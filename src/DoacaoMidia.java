import java.util.Random;


public class DoacaoMidia {
    static String[] opcoes = { "DVD-001", "DVD-002", "DVD-003"};

    public static void pegarMidiaAleatoria(){
        String midiaAleatoria = opcoes[new Random().nextInt(opcoes.length)];
        System.out.println("A mídia de código " + midiaAleatoria + " foi selecionada para doação.");
    }

    public static void assistirFilme(Dvd dvd){
        dvd.darPlay();
        dvd.legenda(true);
        dvd.legenda(true,"portugues");
    }
}
