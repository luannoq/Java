import java.util.Objects;

public class ProdutoDigital extends Produto {
    private String LinkDownload;
    private String formatoArquivo;
//Construtor vazio
    public ProdutoDigital() {
    }

    //Construtor completo
    public ProdutoDigital(String nome, double preco, String descricao, int quantidade, String linkDownload, String formatoArquivo) {
        super(nome, preco, descricao, quantidade);
        LinkDownload = linkDownload;
        this.formatoArquivo = formatoArquivo;
    }

    //Getters e Setters

    public String getLinkDownload() {
        return LinkDownload;
    }

    public void setLinkDownload(String linkDownload) {
        LinkDownload = linkDownload;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    //Equals e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoDigital that = (ProdutoDigital) o;
        return Objects.equals(getLinkDownload(), that.getLinkDownload()) && Objects.equals(getFormatoArquivo(), that.getFormatoArquivo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLinkDownload(), getFormatoArquivo());
    }

    //To string
    @Override
    public String toString() {
        return "ProdutoDigital{" +
                "LinkDownload='" + LinkDownload + '\'' +
                ", formatoArquivo='" + formatoArquivo + '\'' +
                '}';
    }
}
