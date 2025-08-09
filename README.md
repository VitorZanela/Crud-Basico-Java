# ☎️ CRUD de Contatos em Java (Console)

Este projeto implementa um sistema básico de **cadastro de contatos** no terminal usando Java, com foco em treinar os
fundamentos de programação orientada a objetos (POO), estruturação de menus e controle de fluxo.

---

## 🎯 Objetivo

Criar um sistema funcional que realize as operações básicas de CRUD:

- **Create (Criar):** adicionar novos contatos
- **Read (Ler):** visualizar os contatos cadastrados
- **Update (Atualizar):** Atualizar os contatos cadastrados
- **Delete (Excluir):** deletar o contato selecionado

---

## 🧱 Etapas do Projeto

### 1. Definição do modelo de dados

Cada **contato** é representado por um objeto da classe `Contato`, contendo:

- `nome`
- `telefone`
- `email`

---

### 2. Armazenamento dos dados

Os contatos são armazenados em tempo de execução usando:

```java
private List<Contato> listaContatos = new ArrayList<>();
```
Sem uso de banco de dados ou arquivos por enquanto — os dados são mantidos apenas em memória durante a execução.

---

### 3. Interação com o usuário (menu no console)
O menu principal é exibido no terminal por meio da classe Layout, com opções interativas:
```
MENU PRINCIPAL
[1] Cadastrar Contato
[2] Ver Contatos
[3] Sair
```
Ao visualizar contatos, o programa adapta dinamicamente o menu com base na existência ou não de registros.

---

### 4. Implementação das operações
#### ✅ Criar contato

Feito via método novoContato() e novoContatoComLoop() dentro da classe AgendaContatos, que solicita os dados ao
usuário e adiciona à lista.

#### ✅ Ler contatos

Método listarContatos() exibe todos os contatos cadastrados com seus respectivos dados.

#### ✅ Atualizar e Remover

Finalizado atualização dos contatos.


---

## 5. 💻 Exemplo de Utilização

Abaixo um exemplo prático da aplicação rodando no terminal:
```
==== MENU PRINCIPAL ====
[1] Cadastrar Contato
[2] Ver Contatos
[3] Sair
======================
Escolha uma opção: 1
======================
    NOVO CONTATO
======================
Nome: Vitor
Telefone: 11999999999
Email: vitor@email.com
--> Adicionado com Sucesso! <--
Continua? [S/N]: 
s
======================
    NOVO CONTATO    
======================
Nome: Ana
Telefone: 11888888888
Email: ana@email.com
--> Adicionado com Sucesso! <--
Continua? [S/N]: 
n
======================
    MENU PRINCIPAL    
======================
1 - Cadastrar Contato
2 - Ver Contatos
3 - Sair
======================
Escolha uma opção: 2
======================
Nome: Vitor
Telefone: 11999999999
Email: vitor@email.com
----------------------
Nome: Ana
Telefone: 11888888888
Email: ana@email.com
----------------------
======================
    EDITAR CONTATOS    
======================
[1] Cadastrar Contato
[2] Ver Contatos
[3] Atualizar Contato
[4] Remover Contato
[5] Sair
Escolha uma opção: 5
```
---

Esse trecho ilustra o comportamento da aplicação:
- Mostra o menu
- Realiza cadastro com confirmação
- Lista os contatos ao final
- Exibe o menu expandido com opções futuras
---

## 📁 Estrutura do Projeto
```
crud-basico/
│
├── src/
│   ├── app/
│   │   └── Main.java               # Ponto de entrada do sistema
│   ├── model/
│   │   └── Layout.java             # Responsável pelos menus e entradas
│   └── services/
│       ├── AgendaContatos.java     # Lógica principal do CRUD
│       └── Contato.java            # Modelo de dados
│
├── README.md
└── .gitignore
```
---

## 🧪 Como executar
1. Clone o repositório:
```
git clone https://github.com/seu-usuario/crud-basico.git
cd crud-basico
```
2. Abra no IntelliJ ou outro IDE Java

3. Execute a classe Main.java

4. Use o menu no terminal para interagir com o sistema

---

## 🚀 Funcionalidades que podem ser implementadas (etapa 6)

- Validação de entrada (ex: não aceitar telefone vazio)

- Evitar duplicidade de contatos

- Exportar e importar contatos via .json ou .csv

- Dockerização para facilitar testes

---

### 👨‍💻 Autor
Desenvolvido como projeto de aprendizado prático em Java por Vitor Zanela.

---

### 📝 Licença
Este projeto é de livre uso para fins educacionais.
