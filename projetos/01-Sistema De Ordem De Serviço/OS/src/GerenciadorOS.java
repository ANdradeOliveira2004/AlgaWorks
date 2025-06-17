import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorOS {
    List<OrdemServico> listaOS = new ArrayList<>();
    private int proximoId = 1;

    public GerenciadorOS() {
        listaOS = new ArrayList<>();
        //garante que o objeto ao ser criado já esteja sempre pronto para uso
    }

    public void adicionarOS(String cliente, String descricao) {
        OrdemServico novaOS = new OrdemServico(proximoId, cliente, descricao);
        listaOS.add(novaOS);
        System.out.println("Ordem cadastrada com ID: " + proximoId);
        proximoId++;
    }

    public void listarOS(boolean somentePendente) {
        if (listaOS.isEmpty()) {
            System.out.println("Nenhuma ordem de serviço cadastrada.");
            return;
        }

        System.out.println("=== Lista de Ordens de Serviço ===");

        for (int i = 0; i < listaOS.size(); i++) {
            OrdemServico os = listaOS.get(i);

            if (somentePendente && os.isFinalizada()) {
                //aqui se as duas forém verdadeiras ele pula e exibi as não finalizadas (pendente)
                continue;
            }

            os.exibirInformacoes();
            System.out.println("-----------------------------");
        }
    }

    public void ListarFinalizadas(){
        System.out.println("=== Lista de Ordens finalizadas ===");

        for (int i = 0; i < listaOS.size(); i++) {
            OrdemServico os = listaOS.get(i);
            if (os.isFinalizada()){
                os.exibirInformacoes();
                System.out.println("-----------------------------");
            }
        }
    }

    public void finalizarOS(int id) {
        for (int i = 0; i < listaOS.size(); i++) {
            OrdemServico os = listaOS.get(i);

            if (os.getId() == id) {
                if (os.isFinalizada()) {
                    System.out.println("A OS de ID " + id + " já está finalizada.");
                } else {
                    os.setFinalizada(true);
                    System.out.println("Ordem de serviço " + id + " finalizada com sucesso.");
                }
                return;
            }
        }

        System.out.println("Ordem de serviço com ID " + id + " não encontrada.");
    }

    public void buscarPorCliente(String nome){
        for (int i = 0; i < listaOS.size(); i++) {
            OrdemServico os = listaOS.get(i);

            if (os.getCliente().contains(nome)) {
                os.exibirInformacoes();
            }

        }
    }

    public static void pressionarEnter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pressione ENTER para continuar...");
        sc.nextLine();
    }



}
