package ua.intita.qa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        //System.out.print("Input n: ");
        //int n = in.nextInt();
        //start task 1
        String[] fklt = {"Исторический","Педогогический"};
        int[] courseNum = {1,2,3};

        Student[] st = new Student[6];
        st[0] = new Student(1,"Бойко", "Галина","Ивановна", 1991, "Скалецкого_32", 982309877, "Исторический", 1, "И_30");
        st[1] = new Student(2,"Буланов", "Алексей","Игорович", 1990, "Келецкая_34", 98255667, "Исторический", 3, "И_30");
        st[2] = new Student(3,"Воронова", "Алина","Ивановна", 1991, "Пушкина_76", 98254877, "Педогогический", 2, "П_20");
        st[3] = new Student(4,"Гуленова", "Полина","Олеговна", 1990, "Горького_76", 98232877, "Педагогический", 2, "П_20");
        st[4] = new Student(5,"Кравец", "Паша","Иванович", 1991, "Гоголя_87", 98239877, "Исторический", 3, "И_30");
        st[5] = new Student(6,"Поляков", "Игорь","Юриевич", 1991, "Фрунзе_76", 98239877, "Педагогический", 2, "П_20");
       //task1.a
        Student.listOfStudentsFaculty(st,"Исторический");
        // task1.b
        for (int i=0;i<fklt.length;i++) {
            for (int j=0;j<courseNum.length;j++) {
                System.out.println("Fakultet:"+ fklt[i]+" Course:" + courseNum[j]);
                Student.listOfStudentsAllFacultiesCourse(st, fklt[i], courseNum[j]);
            }
        }
         // task1.c
        Student.studentsBornAfterYear(st,1990);
        //task1.d
        Student.listOfStudyGroup(st,"И_30");
        //finish task1
        //start task2
        Customer[] c = new Customer[6];
        c[0] = new Customer(1,"Бойко", "Галина","Ивановна", "Скалецкого_32", 5356643, 57230987);
        c[1] = new Customer(2,"Буланов", "Алексей","Игорович", "Келецкая_34", 56456346, 10250667);
        c[2] = new Customer(3,"Воронова", "Алина","Ивановна", "Пушкина_76", 66436435, 28054877);
        c[3] = new Customer(4,"Гуленова", "Полина","Олеговна", "Горького_76", 45673214, 78232877);
        c[4] = new Customer(5,"Кравец", "Паша","Иванович", "Гоголя_87", 45678903, 98239877);
        c[5] = new Customer(6,"Кравец", "Паша","Иванович", "Фрунзе_76", 34523145, 98239877);
        //finish task2


        // int[] arr = new int[n];
      //  for(int i=0; i<n; i++){
     //       arr[i] = in.nextInt();
     //   }
     //   Even.evenOrOdd(arr, n);
     //   MinMax.minMax(arr,n);
      //  SevenNine.sevenNine(arr, n);
        //ThreeValueNumber.threeValNum(arr);
      //  SimpleNum.simple(arr);

    }
}



