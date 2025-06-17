public class Pedido {

    private int codigo;
    private double subTotal;
    private int desconto;
//    private double total;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return subTotal - desconto;
    }

    public void setTotal(double total) {
    }
}
