public class Produto {
    String nome;
    String situacao;
    int quantidadeEmEstoque;
    int mediaVendaSemanal;

    public Produto(){

    }
    public Produto (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getMediaVendaSemanal() {
        return mediaVendaSemanal;
    }

    public void setMediaVendaSemanal(int mediaVendaSemanal) {
        this.mediaVendaSemanal = mediaVendaSemanal;
    }

    public String getSituacao() {
        if (quantidadeEmEstoque < 1.5 * mediaVendaSemanal) {
            return "Produto com baixa de estoque";
        }
        else if (quantidadeEmEstoque > 3.5 * mediaVendaSemanal ){
            return "Produto com estoque em excesso";
        }
        else {
            return "estoque padronizado"  + " quantidade em estoque: " + getQuantidadeEmEstoque() + " media venda semanal: " + getMediaVendaSemanal();
        }
    }

}