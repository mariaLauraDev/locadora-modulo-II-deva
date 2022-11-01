import java.util.Random;


public class DoacaoMidia {

    public static Midia pegarMidiaAleatoria(){
        Dvd starWars = new Dvd("DVD-001",5.90,"A Lagoa Azul","inglês",true,"português");
        Dvd madMax = new Dvd("DVD-002",5.90,"Velozes e Furiosos","inglês",true,"português");
        Dvd oParasita = new Dvd("DVD-003",5.90,"Top Gun","coreano",true);
        Cd oneDirection = new Cd("CD-001",25.5,"One Direction", "Louis, Zayn, Nail, Harry",12);
        Cd justinBieber = new Cd("CD-002",30.0,"Baby", "Justin Bieber",15);
        Cd blackPink = new Cd("CD-003",50.0,"Map of the soul", "Back Pink",20);

        Random gerador = new Random();

        int valorAleatorio = gerador.nextInt(4);

        switch (valorAleatorio){
            case 0 : return starWars;
            case 1 : return madMax;
            case 2 : return oParasita;
            case 3: return oneDirection;
            case 4: return justinBieber;
            case 5: return blackPink;
            default : return starWars;
        }
    }

    public static void assistirFilme(Dvd dvd){
        dvd.legenda(true);
        dvd.legenda(true,"português");
    }

    public static void main(Midia midia){
        midia.darPlay();
    }
}
