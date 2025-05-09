Com base nos arquivos `Conta.java` e `telainicial.java`, aqui está um modelo de `README.md` explicativo e sem emojis:

---

# Sistema de Controle de Contas de Energia

Este projeto Java simula um sistema de gerenciamento de contas de energia elétrica, permitindo o registro, consulta e alteração de informações relacionadas ao consumo mensal, valores pagos e pendentes.

## Funcionalidades

* Cadastro de contas com informações como mês, ano, valor do kW e quantidade de kW utilizados.
* Alteração do status de pagamento da conta.
* Atualização dos dados de consumo e valor por kW.
* Impressão das contas em aberto, contas pagas e contas de um ano específico.
* Interface gráfica básica com a classe `telainicial`.

## Estrutura Principal

### Classe `Conta`

* Representa uma conta de energia com os atributos:

  * `mes`, `ano`
  * `kw` consumido e `valorKw` cobrado
  * status de `paga` (booleano)
* Métodos para:

  * Obter e definir os valores dos atributos.
  * Calcular o valor total da conta.
  * Gerar uma descrição textual da conta com status de pagamento.

### Classe `telainicial`

* Responsável por interações com o usuário via interface gráfica Swing.
* Armazena uma lista de contas (`ArrayList<Conta>`).
* Permite:

  * Alterar dados de uma conta existente com base no mês e ano.
  * Visualizar contas pagas ou em aberto.
  * Filtrar contas por ano.

## Tecnologias Utilizadas

* Java 8+
* Swing (para interface gráfica)
* Maven (gerenciador de dependências - arquivo `pom.xml` incluso)

## Como Executar

1. Clone ou extraia o projeto.
2. Abra em uma IDE compatível com Java (como NetBeans ou IntelliJ).
3. Compile e execute a classe `telainicial`.
4. Utilize a interface para cadastrar e gerenciar as contas de energia.

## Autor

Desenvolvido por Arthur com finalidade educacional para prática de Programação Orientada a Objetos (POO) e interfaces gráficas em Java.

## Licença

Projeto livre para fins acadêmicos. O uso com fins comerciais requer autorização prévia do autor.

---
