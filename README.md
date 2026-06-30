# Práticas em Java ☕

Repositório dedicado ao armazenamento e organização dos meus estudos, projetos e práticas desenvolvidos na linguagem Java, focando em lógica de programação, estruturas de dados e **Programação Orientada a Objetos (POO)**.

---

## 📁 Estrutura do Repositório

O repositório está dividido em pastas organizadas por projetos práticos:

### 1. `Estoque`
* **Descrição:** Sistema de controle de estoque para gerenciamento de produtos.
* **Conceitos Aplicados:** Encapsulamento de atributos (`private`), métodos Getters e Setters, construtores para inicialização de objetos, manipulação de listas dinâmicas com `ArrayList` e criação de menus iterativos no console com `Scanner`.

### 2. `RH`
* **Descrição:** Sistema de gerenciamento de recursos humanos (RH) e folha de pagamento da DevShop.
* **Conceitos Aplicados:** 
  * **Herança (`extends`):** Reutilização de código através da classe mãe `Funcionario` para a classe filha `Gerente`.
  * **Uso do `super`:** Chamada de construtores e métodos da classe base de forma controlada.
  * **Polimorfismo (`@Override`):** Sobrescrita do método `calcularSalario()` para adaptar o cálculo do salário final dinamicamente, permitindo que gerentes recebam bônus específicos diretamente através de uma lista genérica de funcionários.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **IDE:** Visual Studio Code (VS Code)
* **Controle de Versão:** Git & GitHub

---

## 🚀 Como Executar os Projetos

Cada pasta contém seu próprio ponto de entrada (`App.java`). Para rodar qualquer um dos sistemas:

1. Clone este repositório no seu computador:
   ```bash
   git clone [https://github.com/alex-caitete/praticas-em-java.git](https://github.com/alex-caitete/praticas-em-java.git)
