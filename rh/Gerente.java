public class Gerente extends Funcionario {

  double bonus;
  String departamento;

  public Gerente(String nome, String cpf, double salarioBruto, double bonus, String departamento){
    super(nome, cpf, salarioBruto);
    this.bonus = bonus;
    this.departamento = departamento;
  }

  @Override
  public double calcularSalario() {
    return super.calcularSalario() + this.bonus;
  }
  
}
