# ContaBanco

## Descrição
`ContaBanco` é um projeto Java que simula a criação de uma conta bancária a partir de dados inseridos via terminal. O projeto utiliza uma arquitetura limpa para manter o código organizado e fácil de entender.

## Estrutura do Projeto
O projeto está organizado nas seguintes pastas:
- `src/main/java/com/contabanco/application`: Contém a classe principal `ContaTerminal` que executa a aplicação.
- `src/main/java/com/contabanco/domain`: Contém as classes do domínio, como `Conta`.
- `src/main/java/com/contabanco/infrastructure`: Contém a classe `ConsoleInput` para leitura de dados via terminal.
- `src/main/java/com/contabanco/service`: Contém a classe `ContaService` para lógica de negócio.

## Funcionalidades
Adicionei validações nos dados de entrada
- Criação de uma conta bancária a partir dos dados fornecidos pelo usuário.
- Validação dos dados de entrada:
  - Número da conta (deve ter 4 dígitos).
  - Agência (deve seguir o formato XXX-X).
  - Nome do cliente (deve incluir nome e sobrenome).
- Exibição de uma mensagem de boas-vindas ao cliente após a criação da conta.

## Como Executar
Para executar o projeto, siga os passos abaixo:

1. **Clone o repositório:**
   ```sh
   git clone git@github.com:daniell0l/trilha-java-basico.git
   cd trilha-java-basico
    ```

2. **Compile o projeto:**
    ```sh
    javac -d bin -sourcepath src/main/java src/main/java/com/contabanco/application/ContaTerminal.java
    ```

3. **Execute a aplicação:**
    ```sh
    java -cp bin com.contabanco.application.ContaTerminal
    ```
    
## Exemplo de Uso
Ao executar a aplicação, você será solicitado a inserir os seguintes dados:
![image](https://github.com/daniell0l/trilha-java-basico/assets/89937958/9b974ce6-ec4b-4474-917f-9be3fcc8a678)

Após inserir os dados, a aplicação exibirá a seguinte mensagem:
```
Olá daniel, obrigado por criar uma conta em nosso banco, sua agência é 123-1, conta 1234 e seu saldo 1210.0 já está disponível para saque.
```

## Requisitos
- Java 11 ou superior
- Git

## Contribuição
Se você quiser contribuir com o projeto, siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma nova branch com a sua feature: git checkout -b minha-feature
3. Commit suas mudanças: git commit -m 'Adiciona minha feature'
4. Faça um push para a branch: git push origin minha-feature
5. Abra um Pull Request.

Contato
Para dúvidas ou sugestões, entre em contato através do email: daniel_l0l@hotmail.com
