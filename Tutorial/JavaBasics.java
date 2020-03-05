import java.util.Scanner;

public class JavaBasics {

    //if static in method name you do not need to 
    //make instance(obj) of the class
    public static void ternaryOperator() {

        int feburaryDays = 29;
        String result;

        //Assigns different value based on if/else 
        result = (feburaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);
    }

    public static void ifElse() {

        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= 3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }

        System.out.println("Largest Number is " + largestNumber);
    }

    public static void switchTest() {
        
        int week = 3;
        String day = "";
        
        switch (week) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
        }

        System.out.println("The day is " + day);
    }
   
    public static void loops() {

        int sum = 1;

        for (int i = 1; i <= 10000000; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    public static void loops2() {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i]);
        }

        for (char x: vowels) {
            System.out.println(x);
        }
    }

    public static void arrays() {

        int arrayData= 0;
        int[] testArray = new int[10];

        for (int i = 0; i < testArray.length; i++) {

            testArray[i] = arrayData;
            arrayData++;
        }

        System.out.println(testArray);
        double avg = 1.0;

        for (int i = 1; i < testArray.length; i++) {

            avg += testArray[i];
        }

        System.out.println("The average is " + avg/testArray.length);

    }

    public static void arrays2() {
        
        int[][] a = {
        {1, -2, 3}, 
        {-4, -5, 6, 9}, 
        {7}, 
      };

      for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[i].length; j++) {
              System.out.println(a[i][j]);
          } 
      }

    }

    public static void main(String[] args) {

        JavaBasics tester = new JavaBasics();

        //testing ternaryOperator
        ternaryOperator();

        //ifelse
        ifElse();

        //switch
        switchTest();

        loops();

        loops2();

        arrays();

        arrays2();
    }
}