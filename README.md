

# 🛒 Loja Online em Java

Um projeto simples desenvolvido em **Java** para praticar os pilares da **Programação Orientada a Objetos (POO)**:  
**Abstração, Encapsulamento, Herança e Polimorfismo**.

---

## 📌 Objetivo
O sistema simula uma loja online onde diferentes tipos de produtos podem ser adicionados a um carrinho de compras.  
Cada produto possui regras próprias de desconto e exibição de detalhes, demonstrando o uso de polimorfismo.

---

## 🧩 Estrutura do Projeto

- **Produto (abstrata)**  
  Classe base que define atributos comuns (`nome`, `preço`, `estoque`) e métodos abstratos (`aplicarDesconto`, `exibirDetalhes`).

- **Eletronico**  
  Subclasse de `Produto`. Aplica **10% de desconto** automaticamente.

- **Roupa**  
  Subclasse de `Produto`. Aplica **20% de desconto** automaticamente.

- **Alimento**  
  Subclasse de `Produto`. Não aplica desconto, mas possui atributos extras como `validade` e `marca`.

- **Carrinho**  
  Gerencia uma lista de produtos. Permite adicionar, remover, listar e calcular o total da compra.  
  Se houver mais de **5 itens**, aplica um **desconto adicional de 5%** no total.

- **Main**  
  Classe principal que instancia produtos, adiciona ao carrinho e demonstra o funcionamento do sistema.

---

## 🚀 Funcionalidades

- Adicionar produtos de diferentes categorias ao carrinho.  
- Listar produtos com detalhes específicos de cada tipo.  
- Aplicar descontos individuais por categoria.  
- Calcular o valor total da compra com desconto extra para carrinhos grandes.  

---

## 🛠️ Tecnologias Utilizadas
- **Java 17+**  
- Paradigma **Orientado a Objetos**

---

## 🎯 Aprendizados
Este projeto reforça:
- **Abstração:** uso de classes abstratas para generalizar comportamentos.  
- **Encapsulamento:** atributos privados com validações via getters e setters.  
- **Herança:** subclasses especializadas que herdam de `Produto`.  
- **Polimorfismo:** lista de produtos exibindo comportamentos diferentes com o mesmo método.

---



Quer que eu te mostre como adicionar **badges visuais** (Java version, status, linguagem) para dar aquele toque moderno no topo do README?
