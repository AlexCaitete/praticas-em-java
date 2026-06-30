# Práticas em Java ☕

Repositório dedicado ao armazenamento e organização dos meus estudos, projetos e práticas desenvolvidos na linguagem Java, focando em lógica de programação, estruturas de dados e **Programação Orientada a Objetos (POO)**.

---

## 📁 Estrutura do Repositório

O repositório está dividido em pastas organizadas por projetos práticos:

### 1. `estoque`
* **Descrição:** Sistema de controle de estoque para gerenciamento de produtos.
* **Conceitos Aplicados:** Encapsulamento de atributos (`private`), métodos Getters e Setters, construtores para inicialização de objetos, manipulação de listas dinâmicas com `ArrayList` e criação de menus iterativos no console com `Scanner`.

### 2. `rh`
* **Descrição:** Sistema de gerenciamento de recursos humanos (RH) e folha de pagamento da DevShop.
* **Conceitos Aplicados:** 
  * **Herança (`extends`):** Reutilização de código através da classe mãe `Funcionario` para a classe filha `Gerente`.
  * **Uso do `super`:** Chamada de construtores e métodos da classe base de forma controlada.
  * **Polimorfismo (`@Override`):** Sobrescrita do método `calcularSalario()` para adaptar o cálculo do salário final dinamicamente, permitindo que gerentes recebam bônus específicos diretamente através de uma lista genérica de funcionários.

### 3. `vendas`
* **Descrição:** Sistema de registro de vendas comerciais com histórico de auditoria gravado em disco.
* **Conceitos Aplicados:**
  * **Interfaces:** Criação de contratos de código (`GravadorDados`) para garantir o baixo acoplamento entre o processador de regras e o mecanismo de escrita.
  * **Persistência de Dados (I/O):** Gravação de fluxos em arquivos de texto (`.txt`) usando `FileWriter`/`PrintWriter` e leitura de linhas com `FileReader`/`BufferedReader`.
  * **Tratamento de Exceções:** Manipulação robusta de erros em tempo de execução com blocos `try/catch`.
  * **Datas Nativas:** Captura e formatação de datas do sistema operacional usando `LocalDate` e `DateTimeFormatter`.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)
* **IDE:** Visual Studio Code (VS Code)
* **Controle de Versão:** Git & GitHub

---

## 🚀 Como Executar os Projetos

Cada pasta possui sua própria estrutura e ponto de entrada (`app.java` ou `App.java`). Para rodar os sistemas localmente:

1. Clone este repositório no seu computador:
   ```bash
   git clone [https://github.com/AlexCaitete/praticas-em-java.git](https://github.com/AlexCaitete/praticas-em-java.git)