import java.util.ArrayList;

public class FolhaPagamento {
  
  private ArrayList<Funcionario> listaFuncionario = new ArrayList<>();

public void cadastrarFuncionario(Funcionario novoFuncionario) {
  listaFuncionario.add(novoFuncionario);
}
public void listarFolha(){
  System.out.println("------------------ Folha de pagamento ------------------");
  for(int id = 0; id < listaFuncionario.size(); id++  ){
    System.out.println("Matricula Nº:"  +  id + "| Nome: " + listaFuncionario.get(id).getNome() + "| Salário do mês: " + listaFuncionario.get(id).calcularSalario());

  }
}
}
