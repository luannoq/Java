public class Main {
    public static void main(String[] args) {
        //Construtor
        var produto1 = new Produto("Coca cola", 5.0, "Refrigerante zero", 4);


        var produto2 = new Produto("Guaraná", 4.0 , "Refrigerante de guaraná", 4);

        //Métodos e Funções
        produto1.AdicionarEstoque(5);
        System.out.println(produto1);



        //Produto
        var nome = "Coca cola";
        var preco = 5.0;
        var descricao = "Refrigerante zero";

        //Produto
        var nome2 = "Guaraná";
        var preco2 = 4.0;
        var descricao2 = "Refrigerante de guaraná";
    }

}