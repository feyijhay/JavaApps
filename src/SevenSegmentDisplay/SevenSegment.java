package SevenSegmentDisplay;

public class SevenSegment {

        private final String[] segment = new String[8];
        public  void splittingIntoArray(String number) {
            for (int index = 0; index < segment.length; index++) {
                if (number.charAt(index) != '0'  && number.charAt(index) != '1') throw new IllegalArgumentException("invalid binary");
                segment[index] = "" + number.charAt(index);


            }
           displaySeven();
        }

        public void displaySeven() {
            if (segment.length > 8){
                throw new IllegalArgumentException();
            }
            try {
                display1(segment[0]);
                display2(segment[5], segment[1]);
                display1(segment[6]);
                display2(segment[4], segment[2]);
                display1(segment[3]);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: ");
            }
        }


        private void display1(String segment) {
            if (!segment.equals("0") && !segment.equals("1")) {
                throw new IllegalArgumentException("Invalid segment");
            }
            if (segment.equals("1")) System.out.println("* * * * *");

        }

        private void display2(String segment1, String segment2) {
            if (!segment1.equals("0") && !segment2.equals("1")) {
                throw new IllegalArgumentException("Invalid segment");
            }


            if (segment1.equals("1") && segment2.equals("1"))
                for (int check = 0; check< 4; check++) System.out.println("*       *");

            if (segment1.equals("1") && !segment2.equals("1"))
                for (int check = 0; check < 4; check++) System.out.println("*       ");

            if (!segment1.equals("1") && segment2.equals("1"))
                for (int check = 0; check < 4; check++) System.out.println("       *");

}


    }


