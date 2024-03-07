public class ArrayLength {



       public int[] arrayElement(int...number) {
            for(int check =0; check< number.length; check++){
                if(number[check] % 2 == 0){
                    number[check] = 0;
                }
                else{
                    number[check] = 1;
                }
            }

           return number;

       }

}
