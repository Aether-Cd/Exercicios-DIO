# ☕ Exercícios Práticos de POO em Java

Este repositório contém um conjunto de implementações focadas em **Programação Orientada a Objetos (POO)** utilizando Java. O projeto resolve três desafios distintos de lógica de negócios, aplicando conceitos fundamentais como Herança, Polimorfismo, Encapsulamento e Abstração.

## 📂 Estrutura do Projeto

O projeto é dividido em três módulos principais, todos testados através da classe `App.java`:

### 1. 🎟️ Sistema de Ingressos de Cinema
Uma hierarquia de classes para gerenciar a venda de ingressos com regras de negócio específicas para descontos.

* **Ingresso (Base):** Define valor, filme e idioma (Dublado/Legendado).
* **Meia Entrada:** Aplica polimorfismo para retornar 50% do valor original.
* **Ingresso Família:** Calcula o valor total baseado no número de pessoas, aplicando um desconto extra de 5% se o grupo for maior que 3 pessoas.

### 2. 👥 Controle de Usuários e Permissões
Simulação de um sistema corporativo com diferentes níveis de acesso e responsabilidades.

* **Gerente:** Possui acesso de Administrador, gera relatórios e consulta vendas.
* **Vendedor:** Registra e consulta suas próprias vendas (sem acesso admin).
* **Atendente:** Gerencia o fluxo de caixa (receber pagamentos e fechar caixa).
* **Segurança:** Todos os usuários possuem métodos seguros de Login, Logoff e alteração de dados (Encapsulamento).

### 3. ⏰ Relógios Mundiais (Conversor e Sincronizador)
Implementação de relógios que funcionam em diferentes formatos, mas interagem entre si.

* **Relógio (Abstrato):** Define a estrutura base de horas, minutos e segundos.
* **Relógio Brasileiro:** Formato 24h (ex: `21:30:45`).
* **Relógio Americano:** Formato AM/PM (ex: `09:30:45 PM`).
* **Funcionalidade Extra:** Método de **Sincronização**, onde um relógio pode ler os dados de outro (independente do tipo) e se ajustar automaticamente.

---

## 🚀 Tecnologias e Conceitos Aplicados

* **Linguagem:** Java (JDK 17+)
* **Paradigma:** Orientação a Objetos

### Conceitos Chave:
* **Herança:** Reutilização de código através de classes pais (`Ingresso`, `Usuario`, `Relogio`).
* **Polimorfismo:** Sobrescrita de métodos (`Override`) para alterar comportamentos (ex: cálculo de valor do ingresso ou formatação da hora).
* **Classes Abstratas:** Definição de modelos que não podem ser instanciados diretamente, obrigando as classes filhas a implementarem regras específicas.
* **Encapsulamento:** Proteção de atributos sensíveis (como senhas e valores em caixa) através de modificadores de acesso e Getters/Setters.

---

## 🛠️ Como Executar

Certifique-se de ter o **Java** instalado em sua máquina.

1. Clone o repositório:
   ```bash
   git clone [https://github.com/Aether-Cd/Exercicios-DIO.git](https://github.com/Aether-Cd/Exercicios-DIO.git)
