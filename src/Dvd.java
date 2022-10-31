public class Dvd extends Midia{
    private String idioma;
    private boolean possuiLegenda;
    private String idiomaLegenda;

    public Dvd(String codigo,
               Double preco,
               String nome,
               String idioma,
               boolean possuiLegenda,
               String idiomaLegenda){
        super(codigo, preco, nome);
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
        this.idiomaLegenda = idiomaLegenda;
    }
    public Dvd(String codigo,
               Double preco,
               String nome,
               String idioma,
               boolean possuiLegenda){
        super(codigo, preco, nome);
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isPossuiLegenda() {
        return possuiLegenda;
    }

    public void setPossuiLegenda(boolean possuiLegenda) {
        this.possuiLegenda = possuiLegenda;
    }

    public String getIdiomaLegenda() {
        return idiomaLegenda;
    }

    public void setIdiomaLegenda(String idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    @Override
    public void darPlay() {
        System.out.println("O filme " + getNome() + " foi iniciado.");
    }

    @Override
    public String toString() {
        return super.toString() + "Dvd{" +
                "idioma='" + idioma + '\'' +
                ", possuiLegenda=" + possuiLegenda +
                ", idiomaLegenda='" + idiomaLegenda + '\'' +
                '}';
    }

    public void legenda(boolean ligar, String idioma){
        if (possuiLegenda && !ligar){
            System.out.println("As legendas do filme " + getNome() + " estão desligadas. Ligue-as para poder configurar o idioma da legenda.");
        } else if (possuiLegenda){
            setIdiomaLegenda(idioma);
            System.out.println("As legendas do filme " + getNome() + " estão ligadas. O idioma selecionado é o " + idioma + ".");
        } else {
            System.out.println("Não há legendas disponíveis para o filme " + getNome() + ".");
        }
    }

    public void legenda(boolean ligarDesligar){
        setPossuiLegenda(ligarDesligar);
    }
}
