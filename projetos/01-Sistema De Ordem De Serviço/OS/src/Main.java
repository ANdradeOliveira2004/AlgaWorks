import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorOS gerenciar = new GerenciadorOS();

        while (true) {
            System.out.println("=== Sistema de Ordem de Serviço ===");
            System.out.println("1. Nova Ordem de Serviço");
            System.out.println("2. Listar OS pendentes");
            System.out.println("3. Finalizar OS");
            System.out.println("4. Buscar por cliente");
            System.out.println("5. Salvar em arquivo");
            System.out.println("6. Carregar do arquivo");
            System.out.println("7. Listar todas as OS");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            int info = sc.nextInt();
            sc.nextLine();

            switch (info) {
                case 1:
                    System.out.println("=== Cadastrando Ordem de Serviço ===");
                    System.out.println("\nNome Cliente: ");
                    String nomeCliente = sc.nextLine();

                    System.out.println("Descrição do Serviço: ");
                    String DesServico = sc.nextLine();
                    gerenciar.adicionarOS(nomeCliente, DesServico);
                    gerenciar.pressionarEnter(); // Continua se o usuário apertar enter
                    break;

                case 2:
                    gerenciar.listarOS(true);
                    gerenciar.pressionarEnter(); // Continua se o usuário apertar enter
                    break;

                case 3:
                    gerenciar.ListarFinalizadas();
                    gerenciar.pressionarEnter(); // Continua se o usuário apertar enter
                    break;

                case 4:
                    System.out.println("Digite o Id a ser finalizado: ");
                    int idFinalizar = sc.nextInt();
                    gerenciar.finalizarOS(idFinalizar);
                    gerenciar.pressionarEnter(); // Continua se o usuário apertar enter
                    break;

                case 5:
                    System.out.println("Digite o Id cliente: ");
                    String nome = sc.nextLine();
                    gerenciar.buscarPorCliente(nome);
                    gerenciar.pressionarEnter(); // Continua se o usuário apertar enter
                    break;

                case 0:
                    System.out.println("Deseja finalizar o sistema? (S/N)");
                    String sair = sc.nextLine();
                    if (sair.equalsIgnoreCase("N")) {
                        System.exit(0);
                    } else if(sair.equalsIgnoreCase("S")){
                        continue;
                    }
                    break;
            }
            System.out.println();


        }

    }
}
