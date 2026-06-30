public class Funcionario {
  
  protected String nome;
  protected String cpf;
  protected double salarioBruto;
  

  public Funcionario(String nome, String cpf, double salarioBruto){
    this.nome = nome;
    this.cpf = cpf;
    this.salarioBruto = salarioBruto;
  }

  public double calcularSalario(){
    return salarioBruto;
  }
  public String getNome(){
    return nome;
  }
  public String getCpf(){
    return cpf;
  }
  public void  setSalarioBruto(double salarioBruto){
    this.salarioBruto = salarioBruto;
  }
}
