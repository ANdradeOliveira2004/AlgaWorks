package exercicio02;

public class Produto {

    //definindo o número fixo
    final int  NUMERO_FIXO = 10;

    String nome;
    int quantidadeEstoque;

    public boolean quantidadeVerificar() {
        if (quantidadeEstoque < NUMERO_FIXO){
            return  true;
        }
        return  false;
    }


}
