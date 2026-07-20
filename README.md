![Texto alternativo](https://github.com/TiagoGalindo40/budgeting/blob/main/imgs/20ca7bb3-fac4-4de8-919b-b3ee87e551f3.webp)
![Texto alternativo](https://github.com/TiagoGalindo40/budgeting/blob/main/imgs/29fb95e1-f2e0-41e5-ab21-b66ec7f1f8bb.webp)
![Texto alternativo](https://github.com/TiagoGalindo40/budgeting/blob/main/imgs/34d12c68-e4b4-49be-8ff3-b57be70feb9e.webp)
![Texto alternativo](https://github.com/TiagoGalindo40/budgeting/blob/main/imgs/3e88a455-c220-4e56-bb29-28c046ed6ae7.webp)
![Texto alternativo](https://github.com/TiagoGalindo40/budgeting/blob/main/imgs/4f30d88f-d8aa-4176-a20e-859537a82a1e.webp)
![Texto alternativo](https://github.com/TiagoGalindo40/budgeting/blob/main/imgs/29fb95e1-f2e0-41e5-ab21-b66ec7f1f8bb.webp)


# 🚀 Desafio: Evoluindo uma API Inteligente com Spring AI

Bem-vindo ao desafio prático de integração de Inteligência Artificial com o ecossistema Java! Este projeto foi desenvolvido utilizando **Spring Boot** e **Spring AI**, demonstrando como conectar modelos de linguagem (LLMs) a uma aplicação robusta, mantendo uma arquitetura limpa, organizada e escalável.

Agora é a sua hora de praticar, aprender fazendo e levar esta aplicação para o próximo nível.

---

## 📌 Pré-requisitos & Repositórios

Antes de colocar as mãos na massa, certifique-se de explorar e clonar os repositórios oficiais do projeto:

*   **Repositório Base:** [Insira o link do repositório aqui]
*   **Repositório de Apoio/Exemplos:** [Insira o link do repositório secundário aqui]

---

## 🎯 Objetivos do Desafio

O grande objetivo deste desafio é fazer você compreender a sinergia entre o desenvolvimento backend tradicional em Java e as novas possibilidades trazidas pela IA Generativa. Você será provocado a:

1.  **Explorar a Arquitetura:** Entender como o Spring AI abstrai a comunicação com as APIs de IA (como OpenAI, Ollama ou Anthropic) através de `ChatClient` ou `ChatModel`.
2.  **Modificar e Evoluir:** Adicionar novas funcionalidades, melhorar os *prompts* utilizados ou criar novos endpoints na API.
3.  **Aplicar Boas Práticas:** Garantir que o tratamento de erros, DTOs (Data Transfer Objects) e a estrutura de pacotes continuem organizados conforme as convenções do Spring.

---

## 🛠️ Tecnologias Utilizadas

*   **Java 17+** (ou a versão utilizada no projeto)
*   **Spring Boot 3.x**
*   **Spring AI** (para orquestração dos modelos de IA)
*   **Maven/Gradle** (Gerenciador de dependências)

---

## 🚀 Como Começar

<Sequence>
  <Step title="Clonar o Repositório" subtitle="Obtenha o código base localmente">
    Clone o repositório principal do projeto em sua máquina via terminal ou IDE:
    ```bash
    git clone [LINK_DO_REPOSITORIO]
    ```
  </Step>
  <Step title="Configurar as Chaves de API" subtitle="Variáveis de ambiente obrigatórias">
    O Spring AI precisa de credenciais para acessar os provedores de IA. Configure sua chave (ex: OpenAI) nas variáveis de ambiente do seu sistema ou no arquivo `application.properties`/`application.yml`:
    ```properties
    spring.ai.openai.api-key=${OPENAI_API_KEY}
    ```
  </Step>
  <Step title="Executar e Testar a API" subtitle="Valide o estado atual da aplicação">
    Rode a aplicação Spring Boot e teste os endpoints existentes utilizando ferramentas como Postman, Insomnia ou arquivos `.http`.
  </Step>
  <Step title="Implementar suas Melhorias" subtitle="Hora de evoluir o projeto">
    Escolha uma das sugestões de evolução abaixo (ou crie a sua própria) e comece a codificar!
  </Step>
</Sequence>

---

## 💡 Sugestões de Evolução

Precisa de ideias por onde começar a evoluir o projeto? Aqui estão algumas sugestões:

*   **Engenharia de Prompt (Prompt Engineering):** Modifique as instruções do sistema (`System Prompt`) para alterar a personalidade, o tom ou as restrições da resposta da IA.
*   **Memória de Conversação:** Implemente um histórico de mensagens (`Chat Memory`) para que a API consiga lembrar do contexto de perguntas anteriores do usuário.
*   **Suporte a Imagens (Multimodal):** Se estiver utilizando um modelo compatível (como GPT-4o), crie um endpoint que receba uma imagem e faça a IA descrevê-la ou extrair dados.
*   **Saída Estruturada (Structured Outputs):** Force a IA a responder estritamente no formato de um JSON mapeado para um record/classe Java, evitando respostas em texto puro difíceis de tratar no frontend.

---
