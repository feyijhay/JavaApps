package SevenSegmentDisplay;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentTest {

        private  SevenSegment sevenSegment;
        @BeforeEach
        public void initial(){
            sevenSegment = new SevenSegment();
        }

        @Test
        public void inputTest() {
            sevenSegment.splittingIntoArray("11111111");
        }

        @Test
        public void inputTest1() {
            sevenSegment.splittingIntoArray("01100001");
        }

        @Test
        public void inputTest2() {
            sevenSegment.splittingIntoArray("11011011");
        }
        @Test
        public void inputTest3() {
            sevenSegment.splittingIntoArray("11110011");
        }

        @Test
        public void inputTest4() {
            sevenSegment.splittingIntoArray("01100111");
        }

        @Test
        public void inputTest5() {
            sevenSegment.splittingIntoArray("10110111");
        }
        @Test
        public void inputTest6() {
            sevenSegment.splittingIntoArray("10111111");
        }

        @Test
        public void inputTest7() {
            sevenSegment.splittingIntoArray("11100001");
        }
        @Test
        public void inputTest8() {
            sevenSegment.splittingIntoArray("11111111");
        }
        @Test
        public void inputTest9() {
            sevenSegment.splittingIntoArray("11100111");
        }

        @Test
        public void testInvalidInput() {
            assertThrows(IllegalArgumentException.class, () -> sevenSegment.splittingIntoArray("123310101"));
        }


    }


