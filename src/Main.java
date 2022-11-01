public class Main {
    public static void main(String[] args) {
        Dvd starWars = new Dvd("DVD-001",19.90,"Star Wars","inglês",true,"portugues");
        Dvd madMax = new Dvd("DVD-002",15.90,"Mad Max","inglês",true,"inglês");
        Dvd oParasita = new Dvd("DVD-003",25.90,"O Parasita","coreano",true);

        System.out.println("------------------ MÍDIAS PARA DOAÇÃO ------------------");

        System.out.println("O filme " + DoacaoMidia.pegarMidiaAleatoria().getNome() + " foi selecionado para doação.");
    }
}
