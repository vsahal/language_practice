import java.util.Scanner;

public class AlphaSort {

    public static void main(String[] args) {

        int count;
        String temp;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of words need sorting.");
        count = scan.nextInt();

        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Enter the strings one by one:");
        for (int i = 0; i < count; i++) {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("Strings in Sorted Order");
        for (int i = 0; i <= count - 1; i ++) {
            System.out.println(str[i] + ", ");
        }
    }
}