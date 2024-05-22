package serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeserializeTransaction {

    public static  Transaction[] deserialize(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Transaction[].class);

    }

    public static int getTotalAmountOfTransaction(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        String fileContent = Files.readString(path);
        Transaction[] transaction = deserialize(fileContent);

        int container = 0;

        for(Transaction transaction1 :  transaction){
            container += transaction1.getAmount();

        }
        return container;
    }

    public static List<Transaction> getAllTransactions(String filePath, String date) throws IOException {
        LocalDate localDate = LocalDate.parse(date);
        Path path = Paths.get(filePath);
        String file = Files.readString(path);
        Transaction[] transactions = deserialize(file);

//        List<Transaction> newTransactions = new ArrayList<>();
//
//        for (Transaction transaction2 : transactions) {
//            if (transaction2.getDate().equals(localDate)){
//                newTransactions.add(transaction2);
//            }
//
//        }
//        newTransactions.size();
        return Arrays.stream(transactions).filter((transaction) ->
                transaction.getDate().equals(localDate)).collect(Collectors.toList());
    }


    public static List<Transaction> getTransactionsFromDifferentDate(String filePath, String startDate, String endDate) throws IOException {
        LocalDate localDate = LocalDate.parse(startDate);
        LocalDate localDate1 = LocalDate.parse(endDate);
        Path path = Paths.get(filePath);
        String file = Files.readString(path);
        Transaction[] transactions = deserialize(file);

        return Arrays.stream(transactions).filter((transaction) ->
                transaction.getDate().equals(localDate) || transaction.getDate().isAfter(localDate)
                && transaction.getDate().equals(localDate1) || transaction.getDate().isBefore(localDate1))
                .collect(Collectors.toList());

    }


    public static IntSummaryStatistics getAverageTransactionAmount(String filePath, String startDate, String endDate) throws IOException {
        LocalDate localDate = LocalDate.parse(startDate);
        LocalDate localDate1 = LocalDate.parse(endDate);
        Path path = Paths.get(filePath);
        String file = Files.readString(path);
        Transaction[] transactions = deserialize(file);




        return Arrays.stream(transactions).flatMapToInt((transaction) -> IntStream.of(transaction.getAmount())).summaryStatistics();


    }
}
