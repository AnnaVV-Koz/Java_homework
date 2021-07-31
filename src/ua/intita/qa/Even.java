package ua.intita.qa;

public class Even {

    public static void evenOrOdd(int[] arr, int n) {
        System.out.print("Четные числа: ");
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n");
        System.out.println("Нечетные числа: ");
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
