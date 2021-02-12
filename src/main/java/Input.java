import java.util.Scanner;
import java.util.Scanner;

//TODO: Inside of util, create a class named Input that has a private property named scanner.
public class Input {

    private Scanner scanner;

    //TODO: When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.
    public Input() {
        this.scanner = new Scanner(System.in);
    }


//TODO: The class should have the following methods, all of which return command line input from the user:

    public String getString() {
//        return this.scanner.nextLine();
        return getString("Please enter a string: ");
    }

    //TODO BONUS: Allow all of your methods for getting input to accept an optional String parameter named prompt. If passed, the method should show the given prompt to the user before parsing the input.
    String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
    public boolean yesNo() {
        String answer = this.scanner.nextLine();
        return (answer.toLowerCase().equals("y") ||
                answer.toLowerCase().equals("yes"));
//        return this.scanner.nextBoolean();
    }
    public int getInt() {
        System.out.println("Please enter an integer: %n");
        return this.scanner.nextInt();
        // Exceptions and Error Handling Exercise Edits
//        int number = Integer.valueOf(getString());
        // Exceptions and Error Handling Exercise Edits
//        return number;
    }

    public int getInt(int min, int max) {
        while (true) {
            System.out.printf("Please enter an integer between %d and %d: %n", min, max);
            int answer = this.scanner.nextInt();
            // Exceptions and Error Handling Exercise
            int number;
            try {
                number = Integer.valueOf(getString());
                return number;
            } catch (NumberFormatException nfe) {
                System.out.println("Wrong input, try again!");
                return getInt();
            }
            // Exceptions and Error Handling Exercise
//            if (answer >= min && answer <= max) {
//                return answer;
//            }
        }
    }
    public double getDouble() {
        return this.scanner.nextDouble();
    }
    double getDouble(double min, double max) {
        while (true) {
            double answer = this.scanner.nextDouble();
            if (answer >= min && answer <= max) {
                return answer;
            }
        }
    }

//    public int getInt(String s) {
//    }

    public static void main(String[] args) {
        Input in = new Input();
    }
}
