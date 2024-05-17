
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumArray {
    public int getMaximumArray(int... numbers) {
        if (numbers.length < 2) {
            return 0;
        }
        Arrays.sort(numbers);
        int first_product = numbers[0] * numbers[1];
        int second_product = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        if (first_product > second_product) {
            return first_product;
        } else {
            return second_product;
        }
    }

    public int addTwoNumbers(int number1, int number2) {
        return number1 - (-number2);
    }

//    public String webScrapper(String... domain) {
//        https://www.google.com/welcome.html?name=john&age=11
//        scheme -> https
//        domain name -> www.google.com
//        path -> /welcome.html?name=john&age=11
//        try{
//            String location ="https://www.google.com";
//            URL url = new URL(location);
//            InputStream inputStream = url.openStream();
//            byte[] bytes = inputStream.readAllBytes();
//            for(byte data:bytes){
//                System.out.print(Character);
//            }
//
//        }catch (Exception ex){
//            System.err.println("Errror: "+);
//        }
//    }
//


//public static void main(String[] args) {
//
//
//    String word = "It is still a beautiful world";
//    String emptyString = "";
//    List<String> sentence = new ArrayList<>();
//    char[] reverse = word.toCharArray();
//    StringBuilder stringBuilder = new StringBuilder();
//    for (int check =0; check< reverse.length ;  check++) {
//        if (reverse[check] != ' '){
//            stringBuilder.append(reverse[check]);
//        }else{
//            sentence.add(stringBuilder.toString());
//            stringBuilder = new StringBuilder();
//;
//        }
//    }
//    sentence.add(stringBuilder.toString());
//    for (int check=sentence.size()-1; check>=0; check--){
//        emptyString+=sentence.get(check)+" ";
//    }
//
//    System.out.println(emptyString);
//}

//
//        public int[] array (int...numbers){
//
//            for (int check = numbers.length - 1; check > 0; check--) {
//                if (numbers[check] < 9) {
//                    numbers[check]++;
//                    return numbers;
//                } else {
//                    numbers[check] = 0;
//                }
//
//            }
//            return numbers;
//        }


//    public String reverseWord(String... letters) {

//            public static void main(String[] args) {
//
//
//                String sentence = "it is still a beautiful world";
//                String[] words = sentence.split("\\s+");
//
//                StringBuilder stringBuilder = new StringBuilder();
//                for (int check = words.length - 1; check >= 0; check--) {
//                    stringBuilder.append(words[check]);
//                    if (check != 0) {
//                        stringBuilder.append(" ");
//                    }
//                }
//
//                String output = stringBuilder.toString();

//                System.out.println(output);
//            }
//        }
//   }


//    public int getMaximumArrayRetry(int... numbers){
//        int highest1 = 0;
//        int highest2 = 0;
//        int number = 0;
//        int number1 = 0;
//
//        for(int check=0; check< numbers.length; check++){
//            if (numbers[check] == highest1) {
//                 number = numbers[check];
//            }
//            for (int i = 1; i < numbers.length ; i++) {
//                if (numbers[i] == highest2){
//                     number1 = numbers[i];
//                }
//                int answer = numbers[check] * numbers[i];
//         }
//
//        return  answer;
//    }
//          }


}
