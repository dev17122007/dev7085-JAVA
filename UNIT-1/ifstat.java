public class IfExample {
    public static void main(String[] args) {
        int number = 10;

        if (number > 5) {
            System.out.println("The number is greater than 5");
        }

        if (number < 5) {
            System.out.println("The number is less than 5");
        } else {
            System.out.println("The number is not less than 5");
        }

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
