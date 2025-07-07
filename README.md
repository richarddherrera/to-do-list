# ✅ To-Do List API

Uma API RESTful para gerenciamento de tarefas, desenvolvida com **Spring Boot**. Permite **criar**, **atualizar**, **listar** e **excluir tarefas**, com suporte a validações, boas práticas REST, e persistência em banco de dados MySQL.

---

## 🚀 Tecnologias utilizadas

- ☕ **Java 17**
- 🌱 **Spring Boot**
- 📦 **Spring Data JPA**
- 🔒 **Bean Validation (Jakarta Validation)**
- 🐬 **MySQL**
- 📡 **Spring Web (REST API)**
- 📁 **Maven**
- 💡 **IntelliJ IDEA** / VSCode

---

## 📦 Estrutura do Projeto

This looks like a Java project structure. Here's a tree representation of the project path based on the image you provided:

```
src/
├── main/
│   ├── java/
│   │   └── com.richarddev.to_do_list/
│   │       ├── Controller/
│   │       │   └── TarefaController.java
│   │       ├── DTO/
│   │       │   ├── DadosTarefaCreate.java
│   │       │   ├── DadosTarefaRead.java
│   │       │   └── DadosTarefaUpdate.java
│   │       ├── Enums/
│   │       │   ├── PrioridadeTarefa.java
│   │       │   └── StatusTarefa.java
│   │       ├── Model/
│   │       │   └── Tarefa.java
│   │       ├── Repository/
│   │       │   └── TarefaRepository.java
│   │       └── ToDoListApplication.java
│   └── resources/
│       └── db.migration/
│           └── V1__create_table_tarefas.sql
```

---

## ✅ Funcionalidades da API

| Verbo HTTP | Rota             | Descrição                   |
|------------|------------------|-----------------------------|
| `POST`     | `/tarefas`       | Cadastrar nova tarefa       |
| `GET`      | `/tarefas`       | Listar todas as tarefas     |
| `PUT`      | `/tarefas`       | Atualizar uma tarefa        |
| `DELETE`   | `/tarefas/{id}`  | Remover uma tarefa          |

---

## 📑 Validações com Bean Validation

O projeto utiliza `@Valid` e as anotações do `jakarta.validation` para garantir que os dados enviados estejam corretos:


📂 Arquivo .gitignore
Seu .gitignore está configurado para ignorar o application.properties real, mas manter o .example para referência segura.

🤝 Contribuição
Contribuições são bem-vindas!
Sinta-se livre para abrir issues, pull requests ou compartilhar sugestões.