package vendas;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class GerenciadorArquivo implements GravadorDados {
    
  private String nomeArquivo = "historico_vendas.txt";
  
  @Override
  public void gravar(String linha){
    try{
      
      FileWriter arquivo = new FileWriter(nomeArquivo, true);
      PrintWriter gravarArq = new PrintWriter(arquivo);

      gravarArq.println(linha);

      gravarArq.close();
      arquivo.close();
    }catch(IOException e){
      System.out.println("Erro ao tentar salvar os dados nos arquivos: " + e.getMessage());
    }
  } 
}
