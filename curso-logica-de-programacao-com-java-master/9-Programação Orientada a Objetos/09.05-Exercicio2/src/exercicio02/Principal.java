package exercicio02;

public class Principal {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Dell g15 5530";
        p1.quantidadeEstoque = 9;

        System.out.println("Necessário repor estoque do produto " + p1.nome + "? " + p1.quantidadeVerificar());


    }

}
