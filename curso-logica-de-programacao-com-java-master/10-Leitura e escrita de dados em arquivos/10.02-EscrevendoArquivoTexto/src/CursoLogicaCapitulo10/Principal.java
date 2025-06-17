package CursoLogicaCapitulo10;

import java.io.IOException;
import java.nio.file.Files; // importando a classe FILES
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        List<String> linhas = new ArrayList<>();
        linhas.add("Esse é minha primeira escrita em arquivo texto em Java");//aqui são as linhas (lines)
        linhas.add("Paulo");
        linhas.add("Arthur");
        linhas.add("Gabrielle");

        Path arquivo = Paths.get("C:\\Devs\\AlgaWorks\\curso-logica-de-programacao-com-java-master\\arquivo.txt");
        Files.write(arquivo, linhas);
        System.out.println("Fim...");
    }
}


/*
Para escrevermos num arquivo texto, utilizamos a classe (FILES) precisamos importar ela.
                Files.write(path, lines);
        Path → Caminho aonde iremos salvar esse nosso arquivo texto.
        Lines → Equivale a um (ArrayList) de "String", aonde cada posição seria uma linha.
        (throws IOException) porque ele é passivel de dar erro.
*/
