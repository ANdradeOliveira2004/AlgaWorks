public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setCodigo(0001);
        pedido.setSubTotal(100.0);
        pedido.setDesconto(5);
        pedido.setTotal(0);

        System.out.println("Código: " + pedido.getCodigo());
        System.out.println("Subtotal: " + pedido.getSubTotal());
        System.out.println("Desconto: " + pedido.getDesconto());
        System.out.println("Total: " + pedido.getTotal());

    }
}
