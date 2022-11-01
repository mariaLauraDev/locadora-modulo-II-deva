public class Cd extends Midia {

    private String artista;
    private int quantidadedeFaixas;

    public Cd(String codigo,
              Double preco,
              String nome,
              String artista,
              int quantidadedeFaixas) {
        super(codigo, preco, nome);
        this.artista = artista;
        this.quantidadedeFaixas = quantidadedeFaixas;
    }

    public String getArtista() {
        return artista;
    }

    public int getQuantidadedeFaixas() {
        return quantidadedeFaixas;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setQuantidadedeFaixas(int quantidadedeFaixas) {
        this.quantidadedeFaixas = quantidadedeFaixas;
    }

    @Override
    public void darPlay(){
        System.out.println("Primeira faixa tocando");
    }

    @Override
    public String toString() {
        return "Cd{" +
                "artista='" + artista + '\'' +
                ", quantidadedeFaixas=" + quantidadedeFaixas +
                '}';
    }
}
