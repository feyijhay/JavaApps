package serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

//    public static int getTotalNumberOfDigits(String filePath) throws IOException {
//        Path path = Paths.get(filePath);
//        String content = Files.readString(path);
//        Transaction[] digits = deserialize(content);
//
//        int digit = 0;
//
//        for(Transaction digits1: digits){
//            digit = digits1.getNumber();
//        }
//        return digit;
//    }

}
