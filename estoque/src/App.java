import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner teclado = new Scanner(System.in);
      Estoque estoque = new Estoque();
      byte opcao;

      System.out.println("Escolha uma opção: \n" +
        "1 - Cadastrar novo produto \n" +
        "2 - Lista de produtos cadastrados \n"+
        "3 - Pesquisar produto no estoque\n" +
        "4 - Atualzar quantidade de produto\n" +
        "5 -Sair");
        opcao = teclado.nextByte();

        while(opcao !=5){
          switch(opcao){
            case 1:
              teclado.nextLine();
              System.out.println("Digite o nome do produto: ");
              String nome = teclado.nextLine();
              System.out.println("Digite a quantidade: ");
              int qnt = teclado.nextInt();
              Produto novo = new Produto(nome, qnt);
              estoque.cadastrarProduto(novo);
              System.out.println("Produtocadastrado com sucesso!");
              break;

              case 2:
                estoque.listarProduto();
                break;

              case 3:
                teclado.nextLine();
                System.out.println("Digite o nome do produto que deseja pesquisar em nosso estoque:");
                String produtopequisado = teclado.nextLine();
                estoque.pesquisarProduto(produtopequisado);
                break;
              
                case 4:
                  System.out.println("Digite o ID do produto:");
                  int id = teclado.nextInt();
                  System.out.print("Digite a nova quantidade do produto:");
                  int novaQuantidade = teclado.nextInt();

                  estoque.atualizarQuantidade(id,novaQuantidade);
                  break;

                case 5:
                  break;
          }
          System.out.println("Escolha uma opção: \n" +
          "1 - Cadastrar novo produto \n" +
          "2 - Lista de produtos cadastrados \n"+
          "3 - Pesquisar produto no estoque\n" +
          "4 - Atualzar quantidade de produto\n" +
          "5 -Sair");
          opcao = teclado.nextByte();
        }

        System.out.println("Estamos encerrando nosso sistema. até a próxima!");
        
        teclado.close();
        
    }
  }