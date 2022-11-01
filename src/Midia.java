public class Midia {
    private String codigo;
    private Double preco;
    private String nome;

    public Midia(String codigo,
                 Double preco,
                 String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void darPlay(){
        System.out.printf("A mídia %s está ativa", getNome());
    }

    @Override
    public String toString() {
        return "Midia{" +
                "codigo='" + codigo + '\'' +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
}
