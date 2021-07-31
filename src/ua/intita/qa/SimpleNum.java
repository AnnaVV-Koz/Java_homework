package ua.intita.qa;

public class SimpleNum {
    public static void simple(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
            boolean Prime = true;
            if (arr[i] == 1)
                Prime = false;
            else {
                for (int j = 2; j <= arr.length / 2; j++) {
                    if (arr[i] % j == 0) {
                        Prime = false;
                        break;
                    }
                }
            }
            if (Prime)
                System.out.println(arr[i] + " простое число в массиве  ");
        }

    }
}
