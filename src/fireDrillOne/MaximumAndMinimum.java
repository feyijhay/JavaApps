package fireDrillOne;

public class MaximumAndMinimum {



    public int[] getMin(int...numbers) {
            int[] maxMin = new int[1];
            int highest= numbers[0];
            int lowest= numbers[0];


            for (int check = 0; check < numbers.length; check++){
                if (numbers[check] > highest){
                    highest = numbers[check];
                }
                if (numbers[check] < lowest){
                    lowest = numbers[check];
                }

            }

            maxMin = new int[]{highest - lowest};



        return maxMin;
    }



}


