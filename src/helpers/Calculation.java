package helpers;

public class Calculation {
    private Calculation(){

    }

    public static double getSum(double[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static double getMax(double[] arr){
        if(arr.length==0){
            return 0;
        }

        double max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static double getAvg(double[] arr){
        if (arr.length == 0){
            return 0;
        }

        return getSum(arr)/ arr.length;
    }
}
