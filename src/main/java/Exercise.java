import com.sun.tools.javac.util.StringUtils;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Input input = new Input();
        System.out.println("Type something: ");
        boolean result = StringUtils.isNumeric(input.getString());
        String userInput = input.getString();
        System.out.println(result);

        String swapped = StringUtils.swapCase(userInput);
        System.out.println(swapped);

        String reversed = StringUtils.reverse(userInput);
        System.out.println(reversed);
    }
}
