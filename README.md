# Projeto Olimpíadas - Refatoração (POOA)

Este projeto foi refatorado para aplicar os conceitos de SOLID e organização de código que aprendemos na disciplina de Programação Orientada a Objetos Avançada.

## O que foi mudado no código:

1. **Separação de Responsabilidades (SRP):** Antes, a classe `ConsoleUI` fazia de tudo (entrada de dados e salvamento). Agora, ela foca só na interação com o usuário. Toda a parte de salvar e buscar dados foi para os Repositories.

2. **Inversão de Dependência (DIP):** A `ConsoleUI` não cria mais seus próprios repositórios no susto. Ela agora recebe as interfaces no construtor. Isso deixa o código muito mais fácil de testar e mudar no futuro sem quebrar tudo.

3. **Uso de Generics:** Criei uma interface genérica `Repository<T>` para não ter que ficar repetindo código igual para Participante e para Prova. Ficou bem mais limpo.

4. **Estrutura Maven:** O projeto foi organizado nas pastas padrão (`src/main/java` e `src/test/java`) e o `pom.xml` está configurado com o JUnit 5 para rodar os testes unitários.

## Como rodar:
Como é um projeto Maven, basta importar na IDE (IntelliJ ou VS Code) e rodar a classe `App.java`. Os testes também podem ser rodados direto pelo Maven.
