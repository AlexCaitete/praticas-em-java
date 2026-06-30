package vendas;

public class Venda {
  
  private int id;
  private String cliente;
  private double valorTotal;
  private String data;

  public Venda(int id, String cliente, double valorTotal, String data){
    this.id = id;
    this.cliente = cliente;
    this.valorTotal = valorTotal;
    this.data = data;
  }
  public int getId(){
  return id;
  }

  public String getCliente(){
    return cliente;
  }

  public double getValorTotal(){
    return valorTotal;
  }

  public  String getData(){
    return data;
  }
  public String formatarParaArquivo(){
    return this.id + " - " + this.cliente + " - " + this.valorTotal + " - " + this.data;
  }
}
