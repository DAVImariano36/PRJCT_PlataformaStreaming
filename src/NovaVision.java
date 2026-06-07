public class NovaVision {

    public static void main(String[] args) {

        System.out.println("Bem vindo ao NovaVision");
        String movie = "Como Se Fosse a Primeira Vez";
        System.out.println("Filme: " + movie);

        int releaseDate = 2004;
        System.out.println("Ano de Lançamento: " + releaseDate);
        boolean includedInThePlan = true;
        double movieRating = 6.8;

        String synopsis = """
                
                50 First Dates / Como se Fosse a Primeira Vez
                Comédia, romance, drama.
                
                Henry, um homem com medo de compromisso, conhece a linda Lucy,
                juntos se apaixonam e ele acredita que finalmente encontrou a 
                garota dos seus sonhos, até descobrir que perdeu sua memória 
                de curto prazo e esquece tudo o que aconteceu. cada dia.
                
                Avaliação do filme: 
                """ + movieRating;
        System.out.println(synopsis);

        int starsClass = (int) movieRating/2;
        System.out.println("Estrelas: " + starsClass);

    }
}
