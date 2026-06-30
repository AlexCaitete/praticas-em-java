package vendas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcessadorVendas {
  private GravadorDados gravador;
  private String nomeArquivo = "historico_vendas.txt";


  public ProcessadorVendas(GravadorDados gravador){
    this.gravador = gravador;
  }
  public void registrarVenda(Venda venda){
    String linhaFormatada = venda.formatarParaArquivo();
    gravador.gravar(linhaFormatada);
  }
  public int gerarProximoId(){
    int totalLinhas = 0;
  
    try{
      FileReader arquivo = new FileReader(nomeArquivo);
      BufferedReader leitor = new BufferedReader(arquivo);
      
      while(leitor.readLine() != null){
        totalLinhas++;
      }
      
      leitor.close();
      arquivo.close();
    } catch (IOException e) {
      return 1;
    }
    return totalLinhas + 1;
  }
}

