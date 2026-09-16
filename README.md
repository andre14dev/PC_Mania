# PC Mania

Projeto desenvolvido para a disciplina **C06 - Programação Orientada a Objetos (POO)**.

## Aluno

* **Nome:** André Luiz da Luz Mota
* **Matrícula:** 967
* **Curso:** GES

## Sobre o projeto

O projeto simula um sistema de compras da loja **PC Mania**.

O sistema possui 3 promoções fixas de computadores, cada uma contendo:

* Marca
* Preço
* Processador
* Memória RAM
* HD
* Sistema Operacional
* Memória USB como brinde

O cliente pode escolher um ou mais computadores informando o código da promoção. A compra é finalizada quando o código `0` é informado.

Ao final, são exibidos os dados do cliente, os computadores escolhidos e o valor total da compra.

## Estrutura

```text
src/
└── pcmania/
    ├── modelo/
    │   ├── Cliente.java
    │   ├── Computador.java
    │   ├── HardwareBasico.java
    │   ├── MemoriaUSB.java
    │   └── SistemaOperacional.java
    │
    ├── util/
    │   └── ProcessarPedido.java
    │
    └── PCMania.java
```

## Uso de IA

Foi utilizado o **ChatGPT** como ferramenta de apoio durante o desenvolvimento do projeto, principalmente para tirar dúvidas sobre conceitos de POO, organização e implementação do código.

Conversa utilizada:

[ChatGPT](https://chatgpt.com/share/6aab0c63-085c-83e9-83d0-6e5d5e1e7602?utm_source=chatgpt.com)
