public class Cliente {

    String primeiroNome;
    String segundoNome;
    int idade;
    String telefone;
    String email;

    //Métodos de instância é quando não utilizamos a palavra Static
    //Para chamarmos ele, devemos criar o objeto da classe cliente
    //usamos o nome da variável que criamos no nosso objeto. (cliente.primeiroNome)
    public String obterNomeCompleto(){
        String nomeCompleto = primeiroNome + " " + segundoNome;

        return nomeCompleto;
    }

    //Pegando o DDD do telefone do cliente.
    //Estamos usando um metodo da classe (‘String’)
    public String obterDDD(){
        String pegarDDD = telefone.substring(0, 2);

        return pegarDDD;
    }


}
