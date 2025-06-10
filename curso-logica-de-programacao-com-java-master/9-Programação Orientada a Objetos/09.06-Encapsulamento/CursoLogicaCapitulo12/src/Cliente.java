public class Cliente {
    
    String primeiroNome;

    String ultimoNome;

    String telefone;


    //Ecapsulamento nos utilizamos o metodos get/set

    public String getprimeiroNome() {
        return primeiroNome;
    }

    public void setprimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeCompleto() {
        return primeiroNome + " " + ultimoNome;
    }
}
