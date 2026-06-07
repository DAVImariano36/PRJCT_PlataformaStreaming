import java.util.Scanner;

public class YourReview {

    static void main() {
        Scanner read = new Scanner(System.in);
        double gradePhoto = 0;
        double gradeSoundtrack = 0;
        double gradeActing = 0;
        double averageGrade;

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("Avalie o que você achou da fotografia do filme:");
                    gradePhoto = read.nextDouble();
                    break;
                case 1:
                    System.out.println("Agora avalie o que achou da trilha sonora do filme:");
                    gradeSoundtrack = read.nextDouble();
                    break;
                case 2:
                    System.out.println("E agora nos fale como avalia a atuação do filme?");
                    gradeActing = read.nextDouble();
                    break;
            }

        }

        averageGrade = (gradePhoto + gradeSoundtrack + gradeActing) / 3;
        System.out.println("A sua nota média para o filme é: " + averageGrade);


    }
}
