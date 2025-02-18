public class Situacao extends Produto{
    String situacao;

    public void setSituacao() {
        if (quantidadeEmEstoque < (1.5 * mediaVendaSemanal)){
            this.situacao = "Produto com baixa de estoque";
        }
        else if (quantidadeEmEstoque > (3.5 * mediaVendaSemanal)){
            this.situacao = "Produto com estoque em excesso";
        }
    }
}
