public class OrdemServico {

    private int id;
    private String cliente;
    private String descrisaoServico;
     boolean finalizada;

    public OrdemServico(int id, String cliente, String descricaoServico) {
        this.id =id;
        this.cliente = cliente;
        this.descrisaoServico = descricaoServico;
        this.finalizada = false;
    }

    // getter e setters
    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDescrisaoServico() {
        return descrisaoServico;
    }


    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Cliente: " + cliente);
        System.out.println("Serviço: " + descrisaoServico);
        System.out.println("Status: " + (finalizada ? "Finalizada" : "Pendente"));
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
}
