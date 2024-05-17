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

}