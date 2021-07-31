package ua.intita.qa;

public class MinMax {
    public static void minMax(int[] arr, int n) {

       int minValue = arr[0];
       int maxValue = arr[0];
       for(int i=1; i< arr.length;i++){
           if(arr[i]< minValue){
               minValue=arr[i];
           }
           if(arr[i]> maxValue){
               maxValue=arr[i];
           }
       }
        System.out.println("Min value: " + minValue);
        System.out.println("Max value:" + maxValue);
    }
}
