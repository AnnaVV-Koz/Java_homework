package ua.intita.qa;

public class SevenNine {
    public static void sevenNine(int[] arr, int n) {
        System.out.print("Числа делятся на 7: ");
        for(int i=0;i<n;i++){
            if(arr[i]%7==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n");
        System.out.println("Числа делятся на 9: ");
        for(int i=0;i<n;i++){
            if(arr[i]%9==0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
