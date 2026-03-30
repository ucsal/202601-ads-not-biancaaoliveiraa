# Trabalho de POOA - Sistema das Olimpíadas

Fala professor! Segue a minha refatoração do sistema legado. Eu organizei tudo usando Maven e apliquei os princípios do SOLID que foram pedidos, mas sem mudar nada da lógica original de como o sistema funciona.

## Onde usei o SOLID no código:

* **S (Responsabilidade Única):** Eu dei uma limpada nas classes. A `ConsoleUI`, por exemplo, agora só cuida de falar com o usuário. A parte de salvar e buscar os dados ficou exclusiva pros Repositories.
* **O (Aberto/Fechado):** O código tá pronto pra crescer sem precisar ser reescrito. Se a gente quiser mudar o banco de dados depois, é só criar uma classe nova que siga a interface `Repository` sem mexer no que já tá rodando.
* **L (Substituição de Liskov):** Como usei a interface `Repository<T>`, qualquer repositório (de Participante ou de Prova) pode ser usado no lugar do outro sem que a UI dê erro.
* **I (Segregação de Interface):** Não fiz aquelas interfaces gigantes com métodos que ninguém usa. As interfaces são específicas e cada classe só implementa o que realmente precisa.
* **D (Inversão de Dependência):** Essa aqui foi a principal. A `ConsoleUI` não cria mais os repositórios na mão. Ela agora recebe eles prontos no construtor (Injeção de Dependência). Isso deixou o código muito mais solto.

## Estrutura e Testes
* Coloquei o projeto no padrão **Maven** (com o `pom.xml` certinho).
* Usei o **JUnit 5** pra garantir que os cálculos de medalhas e pontos continuam batendo com o sistema original.
