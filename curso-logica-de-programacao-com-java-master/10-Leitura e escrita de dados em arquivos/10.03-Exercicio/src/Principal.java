import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        List<String> listaTarefas = new ArrayList<>();

        while (true) {
            System.out.println("Digite uma tarefa (ou 0 para sair): ");
            String tarefaUsuario = entrada.nextLine();

            if (tarefaUsuario.equals("0")) {
                break;
            }

            listaTarefas.add(tarefaUsuario);
        }

        Path arquivos = Paths.get("C:\\Devs\\AlgaWorks\\curso-logica-de-programacao-com-java-master\\10-Leitura e escrita de dados em arquivos\\10.03-Exercicio\\tarefaUsuario.txt");
        Files.write(arquivos, listaTarefas);
        System.out.println("Tarefas salvas com sucesso!");
    }
}
