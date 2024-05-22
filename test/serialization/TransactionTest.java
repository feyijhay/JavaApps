package serialization;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    public void testTransaction() throws IOException {
        String location = "C:\\Users\\DELL\\Desktop\\Json files\\Transaction.json.txt";
        int result = 6000;
        assertEquals(result, DeserializeTransaction.getTotalAmountOfTransaction(location));

    }

    @Test
    public void testAllTransaction() throws IOException {
        String location = "C:\\Users\\DELL\\Desktop\\Json files\\Transaction.json.txt";
        String date = "2024-05-01";
        assertEquals(3, DeserializeTransaction.getAllTransactions(location, date).size());
    }

    @Test
    public void testAllTransactionsWithinAPeriod() throws IOException {
        String location = "C:\\Users\\DELL\\Desktop\\Json files\\Transaction.json.txt";
        String startDate = "2024-03-01";
        String endDate = "2024-05-01";
        assertEquals(5, DeserializeTransaction.getTransactionsFromDifferentDate(location, startDate, endDate).size());
    }

    @Test
    public void testAverageTransactionAmount() throws IOException {
        String location = "C:\\Users\\DELL\\Desktop\\Json files\\Transaction.json.txt";
        String startDate = "2024-03-01";
        String endDate = "2024-05-01";
        assertEquals(2000, DeserializeTransaction.getAverageTransactionAmount(location, startDate, endDate).getAverage());



    }

}