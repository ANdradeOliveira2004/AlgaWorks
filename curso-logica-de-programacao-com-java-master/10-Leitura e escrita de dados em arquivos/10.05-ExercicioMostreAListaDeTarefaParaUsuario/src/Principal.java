import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        Path arquivos = Paths.get("C:\\Devs\\AlgaWorks\\curso-logica-de-programacao-com-java-master\\10-Leitura e escrita de dados em arquivos\\10.04-LendoInformacoesDeUmArquivoDeTexto\\LendoArquivo\\aniversario.txt");
        List<String> linhas = Files.readAllLines(arquivos); //adicionar o throws IOException

        for (int i = 0; i < linhas.size(); i++ ) {
            System.out.println("Convidado " + (i) + " : " + linhas.get(i));

        }

        //linhas.get(i) => estamos acessando a lista (linhas) na posição que determinamos na variável i





    }
}
