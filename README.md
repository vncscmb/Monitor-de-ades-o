# 🏥 Monitor de Adesão a Medicamentos
- 🌐 **Link de Deploy / Execução em Nuvem:** [Acesse o Codespace do Projeto](https://opulent-succotash-x5j6qg5r4jj364j.github.dev/)
-
- *Nota: Para rodar a aplicação online, acesse o link acima, abra o terminal do Codespace e execute `mvn compile && mvn exec:java -Dexec.mainClass="apresentacao.Main"`*
Este projeto é uma ferramenta de linha de comando (CLI) desenvolvida em **Java 21** para auxiliar no controle e monitoramento da adesão de pacientes a seus tratamentos medicamentosos.

## 🚀 Funcionalidades
- Cadastro de medicamentos e dosagens.
- Registro de horários de ingestão.
- Verificação de adesão ao tratamento (Cálculo de porcentagem).
- Histórico de notificações.

## 🛠️ Tecnologias e Ferramentas
- **Java 21**: Linguagem base do projeto.
- **Maven**: Gerenciamento de dependências e build.
- **JUnit 5**: Testes unitários automatizados.
- **GitHub Actions**: Integração Contínua (CI) configurada para validar cada commit.
- **Checkstyle**: Garantia de boas práticas e padronização do código.

## 🧪 Como Rodar os Testes
Para garantir que as regras de negócio estão funcionando corretamente, execute:
```bash
mvn test
