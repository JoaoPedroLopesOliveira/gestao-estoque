public class Produto {
    String nome;
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
}