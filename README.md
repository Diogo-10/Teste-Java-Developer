# Desafio Java Developer

Este projeto é uma implementação de um sistema para gerenciar transações entre clientes e empresas, conforme solicitado no desafio. O sistema permite realizar depósitos e saques, valida CPF e CNPJ, e simula o envio de notificações e callbacks.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- **Cliente**: Representa um cliente com nome e CPF.
- **Empresa**: Representa uma empresa com nome, CNPJ e saldo.
- **Transacao**: Gerencia a realização de transações (saques e depósitos) entre clientes e empresas.
- **Main**: Classe principal para execução do código e testes básicos.

## Funcionalidades

1. **Validação de CPF e CNPJ**:
   - O CPF e o CNPJ são validados com base em seus algoritmos específicos.
   - O CPF deve ter 11 dígitos e o CNPJ deve ter 14 dígitos.

2. **Transações**:
   - **Depósitos**: Adiciona valor ao saldo da empresa.
   - **Saques**: Remove valor do saldo da empresa, se houver saldo suficiente.

3. **Notificações e Callbacks**:
   - Simula a notificação do cliente e o envio de callbacks para a empresa.

## Configuração e Execução

1. **Pré-requisitos**:
   - Java 21 ou superior instalado.
   - IDE Java (IntelliJ IDEA, Eclipse, etc.)

2. **Executando o Projeto**:
   - Clone este repositório:
     ```sh
     git clone https://github.com/seu-usuario/desafio-java.git
     ```
   - Navegue até o diretório do projeto:
     ```sh
     cd desafio-java
     ```
   - Compile e execute o projeto usando sua IDE ou pela linha de comando:
     ```sh
     javac -d bin src/**/*.java
     java -cp bin Main
     ```

## Detalhes da Implementação

### Classe `Cliente`

- **Campos**:
  - `nome`: Nome do cliente.
  - `cpf`: CPF do cliente (validação inclusa).

- **Métodos**:
  - `validaCPF(String cpf)`: Valida o CPF.

### Classe `Empresa`

- **Campos**:
  - `nome`: Nome da empresa.
  - `cnpj`: CNPJ da empresa (validação inclusa).
  - `saldo`: Saldo atual da empresa.

- **Métodos**:
  - `validaCNPJ(String cnpj)`: Valida o CNPJ.
  - `ajustarSaldo(double valor)`: Ajusta o saldo da empresa.

### Classe `Transacao`

- **Campos**:
  - `cliente`: Cliente envolvido na transação.
  - `empresa`: Empresa envolvida na transação.
  - `valor`: Valor da transação.
  - `tipo`: Tipo de transação ("saque" ou "deposito").

- **Métodos**:
  - `realizar()`: Realiza a transação e simula notificações e callbacks.

## Contribuições

Se desejar contribuir para este projeto, por favor, faça um fork do repositório e envie um pull request com suas melhorias.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).

## Contato

Para dúvidas ou mais informações, entre em contato:

- **Diogo Gomes Ferreira**: [diogogf@hotmail.com](diogogf@hotmail.com)
- **GitHub**: [Diogo-10](https://github.com/Diogo-10)

