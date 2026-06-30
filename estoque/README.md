# DevShop - Gerenciador de Estoque Interativo 🚀

O **DevShop** é um sistema de gerenciamento de estoque para terminal desenvolvido em Java. O projeto simula o controle de fluxo de produtos de um e-commerce, permitindo operações essenciais de um sistema de inteligência comercial e back-end, como cadastro, listagem, busca inteligente e atualização dinâmica de dados.

---

## 🎯 Objetivo do Projeto & Evolução Técnica

Este projeto foi inicialmente desenvolvido seguindo o paradigma de **Programação Estruturada** (com gerenciamento de múltiplos arrays paralelos e lógica concentrada no método principal). 

Para alinhar o sistema com as práticas exigidas pelo mercado de tecnologia e arquiteturas de back-end profissionais, o código foi totalmente refatorado para o paradigma de **Programação Orientada a Objetos (POO)**. 

### 💎 Benefícios da Refatoração:
* **Encapsulamento:** Proteção dos dados sensíveis dos produtos através de modificadores de acesso privados (`private`) e exposição controlada via métodos seletores (Getters e Setters).
* **Separação de Responsabilidades (SoC):** O método `main` atua estritamente como interface de usuário (CLI), enquanto as regras de negócio e persistência em memória foram isoladas na classe gerenciadora (`Estoque`).
* **Coesão e Reutilização:** Criação da entidade `Produto`, unificando os atributos (nome e quantidade) em um único objeto manipulável dentro de coleções dinâmicas.

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Linguagem Principal:** Java 17+
* **Coleções Dinâmicas:** `ArrayList` para manipulação e persistência de dados em memória.
* **Entrada de Dados:** `Scanner` com tratamento de buffer para capturar strings com espaços e evitar travamentos de concorrência de tipos (`InputMismatchException`).
* **Estruturas de Controle:** Loops (`for`), condicionais complexas e controle de fluxo interativo com `while` e `switch-case`.
* **Algoritmos de Varredura:** Busca textual insensível a maiúsculas e minúsculas utilizando `.equalsIgnoreCase()`.

---

## 🏗️ Arquitetura do Sistema (Estrutura de Classes)

O ecossistema do projeto foi dividido em três pilares principais:

1. **`Produto.java`**: Classe de modelo (Entidade) que define a estrutura do objeto, contendo métodos construtores e encapsulamento dos atributos de nome e quantidade.
2. **`Estoque.java`**: Classe de serviço/gerenciamento responsável por encapsular a lista de objetos e executar a lógica dos métodos de negócio (`cadastrar`, `listar`, `pesquisar` e `atualizar`).
3. **`App.java`**: Ponto de entrada da aplicação (`main`) que gerencia a interface visual do terminal e direciona os comandos do usuário para o serviço de estoque.

---

## 💻 Funcionalidades Atuais

* [x] **Caso 1 - Cadastro de Produtos**: Permite inserir novos itens ao estoque validando e aceitando nomes compostos (ex: "Água Mineral").
* [x] **Caso 2 - Listagem Geral**: Exibe todos os produtos com alinhamento visual e geração automática de IDs baseados em indexação.
* [x] **Caso 3 - Busca Avançada**: Motor de pesquisa que localiza itens no estoque por correspondência de nome, com tratamento para buscas sem resultado.
* [x] **Caso 4 - Atualização de Quantidade**: Permite atualizar o saldo de um item específico por ID, contendo validações de segurança contra estouro de memória (`IndexOutOfBounds`).
* [x] **Caso 5 - Encerramento Seguro**: Finalização elegante da aplicação limpando os fluxos de execução do terminal.

---

## 🚀 Como Executar o Projeto

1. Certifique-se de ter o **JDK 17** ou superior instalado na sua máquina.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO/meu-gerenciador-estoque-poo.git](https://github.com/SEU_USUARIO/meu-gerenciador-estoque-poo.git)
