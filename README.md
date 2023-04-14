# Spring Boot WebServices com JPA

Este é um projeto de exemplo para demonstrar como criar Web Services RESTful usando Spring Boot e JPA (Java Persistence API).

## Funcionalidades

O projeto implementa os seguintes recursos:

- **GET /users**: retorna todos os usuários cadastrados no sistema.
- **GET /users/{id}**: retorna um usuário específico com base em seu ID.
- **POST /users**: adiciona um novo usuário ao sistema.
- **PUT /users/{id}**: atualiza um usuário existente com base em seu ID.
- **DELETE /users/{id}**: remove um usuário específico com base em seu ID.

## Tecnologias utilizadas

O projeto utiliza as seguintes tecnologias:

- Java 8+
- Spring Boot 3.2.0
- JPA (Java Persistence API)
- H2 Database
- Maven

## Requisitos

Para executar o projeto, você precisa ter o seguinte instalado em seu sistema:

- Java 8 ou superior
- Maven

## Instalação

Para instalar o projeto, siga as instruções abaixo:

1. Faça um clone deste repositório em sua máquina local:
git clone https://github.com/israel-machado/springboot-WebServices-jpa.git

2. Navegue até o diretório raiz do projeto:
cd springboot-WebServices-jpa

3. Execute o comando Maven para compilar o projeto:
mvn compile

4. Execute o comando Maven para executar o projeto:
mvn spring-boot:run

5. O servidor estará em execução em http://localhost:8080.

## Contribuindo

Sinta-se à vontade para enviar sugestões de melhorias ou correções de bugs. Para fazer isso, siga estas etapas:

1. Faça um fork deste repositório em sua conta do GitHub.

2. Crie uma nova branch para suas alterações:
git checkout -b minha-branch

3. Faça suas alterações e faça commit delas:
git commit -m "Minhas alterações"

4. Envie as alterações para o seu fork no GitHub:
git push origin minha-branch

5. Abra um pull request neste repositório para que possamos avaliar suas alterações.

## Licença

Este projeto é licenciado sob a licença MIT

## Como testar

Você pode testar o projeto usando o software [Postman](https://www.postman.com/), um cliente de API que permite testar solicitações HTTP. Você pode usar as seguintes solicitações de exemplo:

### GET /users

Retorna todos os usuários cadastrados no sistema.

GET http://localhost:8080/users

csharp
Copy code

### GET /users/{id}

Retorna um usuário específico com base em seu ID.

GET http://localhost:8080/users/1

### POST /users

Adiciona um novo usuário ao sistema.

POST http://localhost:8080/users

{
"name": "João Silva",
"email": "joao.silva@example.com",
"phone": "555-1234"
}

### PUT /users/{id}

Atualiza um usuário existente com base em seu ID.

PUT http://localhost:8080/users/1

{
"name": "João da Silva",
"email": "joao.silva@example.com",
"phone": "555-1234"
}

### DELETE /users/{id}

Remove um usuário específico com base em seu ID.

DELETE http://localhost:8080/users/1

## Como contribuir

Se você deseja contribuir com o projeto, siga estas etapas:

1. Fork este repositório.

2. Crie uma nova branch com a feature que você deseja implementar.

3. Faça suas alterações e commit.

4. Push suas alterações para a sua branch.

5. Envie um pull request para este repositório.

## Autor

* **Israel Machado** - [israel-machado](https://github.com/israel-machado)

## Agradecimentos

* Este projeto foi baseado em um curso de Java da Udemy.
