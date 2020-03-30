public class SquaredNumsOOP {

    public static int squared(int i) {
        return i * i;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("The squared value of " + i + " is " + squared(i));
        }

    }
}