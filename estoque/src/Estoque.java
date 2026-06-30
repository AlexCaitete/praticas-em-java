import java.util.ArrayList;

public class Estoque {
  private ArrayList<Produto> listaProduto = new ArrayList<>();

  public void cadastrarProduto(Produto novoProduto){
    listaProduto.add(novoProduto);

  }
  public void listarProduto(){
    System.out.println("----------------------Lista e quantidade de produtos cadastardos ----------------------");
    for (int indice = 0; indice < listaProduto.size(); indice++){
      System.out.println("ID: " + indice + "| Produto: " + listaProduto.get(indice).getNome() +"| Quantidade: " + listaProduto.get(indice).getQuantidade());
    }
  }
  public void pesquisarProduto(String produtoPesquisado){
    boolean achou = false;
    for(int indice = 0; indice < listaProduto.size(); indice++){
      if (listaProduto.get(indice).getNome().equalsIgnoreCase(produtoPesquisado)){
        System.out.println("ID: " + indice + "| Produto: " + listaProduto.get(indice).getNome() + "| Quantidade: " + listaProduto.get(indice).getQuantidade());
        achou = true;
        }
        }
        if(achou == false){
          System.out.println("Produto não foi encontrado!");}
  }
  public void atualizarQuantidade(int id, int novaQuantidade){
    if(id < listaProduto.size()){
      listaProduto.get(id).setQuantidade(novaQuantidade);
      System.out.println("Quantidade modificada com sucesso!");
    }
    else {
      System.out.println("Não existe produto com esse ID.");
    }
  }  
}


  
