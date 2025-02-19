public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teste1");


        p1.setMediaVendaSemanal(20);
        p1.setQuantidadeEmEstoque(50);

        System.out.println(p1.getSituacao());


    }
}
