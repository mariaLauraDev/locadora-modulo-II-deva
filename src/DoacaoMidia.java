import java.util.Random;


public class DoacaoMidia {

    public static Midia pegarMidiaAleatoria(){
        Dvd starWars = new Dvd("DVD-001",5.90,"A Lagoa Azul","inglês",true,"português");
        Dvd madMax = new Dvd("DVD-002",5.90,"Velozes e Furiosos","inglês",true,"português");
        Dvd oParasita = new Dvd("DVD-003",5.90,"Top Gun","coreano",true);

        Random gerador = new Random();

        int valorAleatorio = gerador.nextInt(4);

        switch (valorAleatorio){
            case 0 : return starWars;
            case 1 : return madMax;
            case 2 : return oParasita;
            default : return starWars;
        }
    }

    public static void assistirFilme(Dvd dvd){
        dvd.darPlay();
        dvd.legenda(true);
        dvd.legenda(true,"português");
    }
}
