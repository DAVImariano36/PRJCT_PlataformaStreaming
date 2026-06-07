import java.util.Scanner;

public class LoginPlan {

    static void main() {

        Scanner security = new Scanner(System.in);
        String correctPassword = "3669";
        int attempts = 5;
        String password = "";

        while (attempts > 0 || password.equals(correctPassword)){
            System.out.println("Digite sua senha: ");
            password = security.nextLine();

            if (password.equals(correctPassword)){
                System.out.println("""
            Login efetuado.
            Seja Bem-Vindo!
            """);
                break;
            } else {
                --attempts;
                System.out.println("""
            Senha Incorreta.
            Restam\s""" + attempts + " tentativas.");
            }
        }
        if (attempts == 0){
            System.out.println("""
                    Conta bloqueada.
                    Entre em contato com o suporte
                    ou tente novamente mais tarde.
                    """);
        }
    }
}
