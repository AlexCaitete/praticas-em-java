package vendas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        // Polimorfismo e Injeção de Dependência na prática:
        // Passamos o GerenciadorArquivo para dentro do Processador de Vendas
        GravadorDados gravador = new GerenciadorArquivo();
        ProcessadorVendas processador = new ProcessadorVendas(gravador);
        
        byte opcao;

        System.out.println("### SISTEMA DE VENDAS & AUDITORIA - DEVSHOP ###\n" +
                           "1 - Registrar Nova Venda\n" +
                           "2 - Sair");
        opcao = teclado.nextByte();
        teclado.nextLine(); // Limpa o buffer do enter

        while (opcao != 2) {
            switch (opcao) {
                case 1:
                    // 1. Gera o ID automático lendo o histórico de arquivos
                    int idAutomatico = processador.gerarProximoId();
                    System.out.println("Registrando venda de código Nº: " + idAutomatico);

                    // 2. Coleta os dados do cliente
                    System.out.println("Digite o nome do cliente:");
                    String cliente = teclado.nextLine();

                    System.out.println("Digite o valor total da venda:");
                    double valorTotal = teclado.nextDouble();
                    teclado.nextLine(); // Limpa o buffer

                    // 3. Captura a data atual do computador de forma automática
                    LocalDate dataAtual = LocalDate.now();
                    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String dataFormatada = dataAtual.format(formatador);

                    // 4. Cria o objeto Venda com o ID e data gerados pelo sistema
                    Venda novaVenda = new Venda(idAutomatico, cliente, valorTotal, dataFormatada);

                    // 5. Manda para o motor processar e gravar no arquivo TXT
                    processador.registrarVenda(novaVenda);
                    System.out.println("Venda gravada com sucesso no relatório de auditoria!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("\n### SISTEMA DE VENDAS & AUDITORIA - DEVSHOP ###\n" +
                               "1 - Registrar Nova Venda\n" +
                               "2 - Sair");
            opcao = teclado.nextByte();
            teclado.nextLine(); // Limpa o buffer
        }

        System.out.println("Sistema de auditoria finalizado com segurança!");
        teclado.close();
    }
}