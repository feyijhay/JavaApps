package BackToSenderLogistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackToSenderLogisticsTest {

    @Test
    public void testThat500RidersAreToDeliver100PackagesDaily(){
        BackToSenderLogistics backToSender = new BackToSenderLogistics();
        assertEquals(50_000, backToSender.packagesPerDay());
    }

    @Test
    public void testThatARiderDeliversBelow50percentPackagesADay(){
        BackToSenderLogistics backToSender = new BackToSenderLogistics();
        assertEquals(9_000, backToSender.amountEarned(25));
    }

    @Test
    public void testThatARiderDeliversMoreThan50percentPackagesADay(){
        BackToSenderLogistics backToSender = new BackToSenderLogistics();
        assertEquals(15_400, backToSender.amountEarned(52));
    }

    @Test
    public void testThatARiderDeliversMoreThan60percentPackagesADay(){
        BackToSenderLogistics backToSender = new BackToSenderLogistics();
        assertEquals(21_250, backToSender.amountEarned(65));
    }

    @Test
    public void testThatARiderDeliversMoreThan70percentPackagesADay(){
        BackToSenderLogistics backToSender = new BackToSenderLogistics();
        assertEquals(45_000, backToSender.amountEarned(80));
    }

    @Test
    public void testThatARiderDelivers100PackagesADay(){
        BackToSenderLogistics backToSender = new BackToSenderLogistics();
        assertEquals(55_000, backToSender.amountEarned(100));
    }
    @Test
    public void testThatNegativeNumberOfDeliveriesShouldReturnZero(){
        BackToSenderLogistics backToSender = new BackToSenderLogistics();
        assertThrows(IllegalArgumentException.class,()-> backToSender.amountEarned(-10));
    }
}