public class MetodosIntancia {
    public static void main(String[] args) {
        //Instânciando a Classe Cliente
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Paulo";
        cliente.segundoNome = "Andrade";
        cliente.idade = 20;
        cliente.telefone ="11944500452";
        cliente.email = "andradeoliveira2004@icloud.com";

        System.out.println(cliente.primeiroNome + " " + cliente.segundoNome + ", DDD: " + cliente.obterDDD());



    }
}
