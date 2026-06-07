import java.util.Scanner;

public class InputData {

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual vai ser seu próximo play?");
        String movie = input.nextLine();
        System.out.println(movie);
    }
}
