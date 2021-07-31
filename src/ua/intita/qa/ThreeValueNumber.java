package ua.intita.qa;

public class ThreeValueNumber {
    public static void threeValNum(int []arr) {
        int i;
        int j;
        int k;

        for( i=1; i < 10; i++)
            for (j=0; j < 10; j++)
            {
                if (arr[i] == j) continue;
                for (k=0; k < 10; k++)
                {
                    if (i == k || k == j) continue;
                    System.out.println( i * 100 +j * 10 + k);
                }
            }

    }

}
