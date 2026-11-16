# 🎬 CineBot — Chatbot de Recomendações de Filmes

O **CineBot** é um chatbot tradicional desenvolvido em **Java**, com o objetivo de recomendar filmes e fornecer informações sobre títulos cadastrados, como gênero, sinopse, duração e ano de lançamento.

O projeto é desenvolvido como parte da **Atividade Avaliativa III** da disciplina de Paradigma de Programação Orientada a Objetos, da Pontifícia Universidade Católica de Campinas (PUC-Campinas).

## 📌 Sobre o projeto

O CineBot utiliza uma base de conhecimento composta por palavras-chave (*tokens*), intenções (*intents*) e respostas (*dialogs*) previamente cadastradas.

A partir de uma mensagem enviada pelo usuário, o sistema realiza etapas de processamento textual para identificar a intenção da pergunta e selecionar uma resposta adequada.

Por ser um chatbot tradicional, seu funcionamento é baseado em regras predefinidas, sem a utilização de inteligência artificial generativa ou bibliotecas específicas para chatbots.

## ⚙️ Funcionalidades previstas

- Recomendar filmes de acordo com o gênero solicitado.
- Consultar informações sobre filmes cadastrados.
- Informar sinopse, duração e ano de lançamento.
- Identificar palavras-chave nas mensagens dos usuários.
- Reconhecer intenções a partir de regras cadastradas.
- Selecionar respostas utilizando a base de conhecimento.
- Realizar leitura e gravação de dados em arquivos.

## 🧠 Funcionamento do chatbot

O processamento das mensagens será organizado nas seguintes etapas:

1. **Tokenização:** separação da mensagem em palavras (*tokens*).
2. **Análise léxica:** identificação dos tokens presentes no dicionário.
3. **Análise sintática:** verificação da estrutura da mensagem utilizando regras gramaticais.
4. **Análise semântica:** identificação da intenção do usuário por meio da comparação com regras cadastradas.
5. **Análise pragmática:** seleção da ação ou resposta correspondente à intenção identificada.
6. **Geração da resposta:** apresentação da informação ao usuário.


## 🏗️ Estrutura de classes planejada

| Classe | Responsabilidade |
|---|---|
| `FILME` | Armazenar informações dos filmes |
| `BASECONHECIMENTO` | Gerenciar filmes, tokens, intenções e respostas |
| `ANALISADOR` | Definir a estrutura base dos analisadores |
| `ANALISADORLEXICO` | Identificar e validar tokens |
| `ANALISADORSINTATICO` | Analisar a estrutura gramatical |
| `ANALISADORSEMANTICO` | Identificar intenções |
| `ANALISADORPRAGMATICO` | Selecionar ações e respostas |
| `CHATBOT` | Coordenar o processamento e a interação com o usuário |

## 💻 Tecnologias utilizadas

- **Java** — linguagem de programação.
- **Programação Orientada a Objetos (POO)** — paradigma utilizado no desenvolvimento.
- **Arquivos locais** — persistência da base de conhecimento.


---
2026/2
Desenvolvido para fins acadêmicos e de aprendizagem em Programação Orientada a Objetos.
