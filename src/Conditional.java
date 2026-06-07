public class Conditional {

    static void main() {

        int releaseDate = 2004;
        boolean includedInThePlan = true;
        double movieRating = 6.8;
        String planGrade = "Basic";

        if (releaseDate >= 2026){
            System.out.println("Lançamento deste ano!");
        } else {
            System.out.println("Filme retro!");
        }

        if (includedInThePlan || planGrade.equals("Premium")){
            System.out.println("""
        Filme incluso no plano.
        É só dar o play!
        """);
        } else{
            System.out.println("""
            Filme disponível apenas para assinantes Premium.
            Ou faça a locação do seu play!
            """);
        }

    }
}
