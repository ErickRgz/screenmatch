import br.com.curso.screenmatch.model.Filme;
import br.com.curso.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {

        System.out.println("==================");
        System.out.println("Filmes");
        System.out.println("==================");

        //Filme

        Filme Batman = new Filme();
        Batman.setnome("Batman: O Cavaleiro das Trevas Ressurge");
        Batman.setAnoDeLancamento(2012);
        Batman.setDuracaoEmMinutos(164);
        Batman.exibeFichaTecnica();

        System.out.println("==================");
        System.out.println("Series");
        System.out.println("==================");
        //Serie

        Serie LaCasaDePapel = new Serie();
        LaCasaDePapel.setnome("La Casa De Papel");
        LaCasaDePapel.setAnoDeLancamento(2017);
        LaCasaDePapel.setTemporadas(5);
        LaCasaDePapel.setEpisodiosPorTemporada(9);
        LaCasaDePapel.exibeFichaTecnica();



    }
}