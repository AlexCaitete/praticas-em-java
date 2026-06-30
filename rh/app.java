import java.util.Scanner;

public class app {
  public static void main(String[] args) throws Exception {
    Scanner teclado = new Scanner(System.in);
    FolhaPagamento rh = new FolhaPagamento();

    byte opcao;

    System.out.println("### SISTEMA DE RH - DEVSHOP ###\n" +
    "1 - CADASTRAR FUNCIONÁRIO\n" +
    "2 - MOSTRAR FOLHA DE PAGAMENTO\n" +
    "3 - SAIR");
      opcao = teclado.nextByte();

      while(opcao !=3){
        switch(opcao){

          case 1:
            System.out.println("qual o tipo de funcionário?");
            System.out.println("1 - Funcionario regular");
            System.out.println("2 - Gerente");
            byte tipo = teclado.nextByte();
            teclado.nextLine();
            
            System.out.println("Digite o nome do funcionario:");
            String nome = teclado.nextLine();

            System.out.println("Digite o CPF do funcionário:");
            String cpf = teclado.nextLine();

            System.out.println("Digite o salário Bruto do funcionário:");
            double salarioBruto = teclado.nextDouble();

            if( tipo == 1){
              Funcionario f = new Funcionario(nome, cpf, salarioBruto);
              rh.cadastrarFuncionario(f);
              System.out.println("Funcionário cadastrado com sucesso!");
            }

              else if(tipo == 2){
                System.out.println("Digite o bonus do gerência: ");
                double bonus = teclado.nextDouble();
                teclado.nextLine();
                
                System.out.println("Digite o departamento onde irá atuar: ");
                String departamento = teclado.nextLine();

                Gerente g = new Gerente(nome, cpf, salarioBruto, bonus, departamento);
                rh.cadastrarFuncionario(g);
                System.out.println("Gerente cadastrado com sucesso!");
              }
              else{
                System.out.println("Opção invalida!");
              }
              break;
              
              case 2:
                rh.listarFolha();
                break;

              case 3:
              break;
            }
            System.out.println("### SISTEMA DE RH - DEVSHOP ###\n" +
            "1 - CADASTRAR FUNCIONÁRIO\n" +
            "2 - MOSTRAR FOLHA DE PAGAMENTO\n" +
            "3 - SAIR");
            opcao = teclado.nextByte();
            
            }
            System.out.println("Sistema encerrado!");
            teclado.close();
          }
      }
    
  
  
