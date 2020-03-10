import java.util.Scanner;
import java.util.Arrays;

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

    public static void shallowCopyArrays() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] positiveNumbers = numbers;

        for (int i = 0; i < positiveNumbers.length; i++) {
            System.out.println("Copied int array:" + positiveNumbers[i]);
        }
    }

    public static void deepCopyArrays() {

        int[] source = {1, 2, 3, 4, 5, 6};
        int[] destination = new int[6];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        System.out.println(Arrays.toString(destination));

    }

    public static void funcArrayCopy() {

        int[] n1 = {2, 3, 12, 4, 12, -2};
        int[] n3 = new int[5];
        int[] n2 = new int[n1.length];

        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        System.arraycopy(n1, 2, n3, 1, 2);

        System.out.println("n3 = " + Arrays.toString(n3));

    }

    public static void TwoDArrayCopy() {

        int[][] source = {
                {1, 2, 3, 4},
                {5, 6},
                {0, 2, 42, -4, 5},
        };

        int[][] destination = new int[source.length][];

        for (int i = 0; i < destination.length; i++) {
            destination[i] = new int[source[i].length];

            for (int j = 0; j < destination[i].length; j++) {
                destination[i][j] = source[i][j];
            }
        }

        System.out.println(Arrays.deepToString(destination));
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

        shallowCopyArrays();

        deepCopyArrays();

        funcArrayCopy();

        TwoDArrayCopy();
    }
}