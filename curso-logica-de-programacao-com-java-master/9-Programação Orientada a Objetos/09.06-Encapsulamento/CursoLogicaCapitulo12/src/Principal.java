public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setprimeiroNome("Paulo");
        cliente.setUltimoNome("Andrade");

        System.out.println(cliente.getNomeCompleto());
    }
}
