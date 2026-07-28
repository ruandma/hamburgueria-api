# Hamburgueria API 🍔

API REST para gerenciamento de produtos de uma hamburgueria, com CRUD completo, validacao e testes automatizados.

[Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
[Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen?style=for-the-badge&logo=springboot)
[Deploy](https://img.shields.io/badge/Deploy-LIVE-success?style=for-the-badge&logo=render)
[Tests](https://img.shields.io/badge/Tests-5%20passing-brightgreen?style=for-the-badge&logo=junit5)
[License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)

### 🔗 API Online

**Base URL:** `https://hamburgueria-api-sln8.onrender.com`

- **Swagger UI:** https://hamburgueria-api-sln8.onrender.com/swagger-ui.html
- **Listar Produtos:** https://hamburgueria-api-sln8.onrender.com/produtos
- **H2 Console:** https://hamburgueria-api-sln8.onrender.com/h2-console

> Nota: Por usar plano gratuito no Render, a instancia hiberna apos inatividade. A primeira requisicao pode demorar ate 50 segundos.

### Tecnologias

- Java 21
- Spring Boot 3.5.4 (Web, Data JPA, Validation)
- H2 Database (em memoria)
- SpringDoc OpenAPI / Swagger
- JUnit 5 + MockMvc + AssertJ
- Maven
- Docker
- Render (Deploy)

### Funcionalidades

- CRUD completo de Produtos
- Validacao com Bean Validation
- Tratamento global de erros com @ControllerAdvice
- Documentacao automatica com Swagger
- Testes unitarios e de integracao (5 testes passando)
- Deploy containerizado

### Endpoints

| Metodo | Endpoint | Descricao |
| :--- | :--- | :--- |
| GET | /produtos | Lista todos os produtos |
| GET | /produtos/{id} | Busca produto por ID |
| POST | /produtos | Cria um novo produto |
| PUT | /produtos/{id} | Atualiza um produto |
| DELETE | /produtos/{id} | Remove um produto |

Exemplo de payload POST:

```json
{
  "nome": "X-Burguer",
  "preco": 25.90,
  "descricao": "Pao, carne e queijo"
}
```

### Como Rodar Localmente

```bash
# Clone o repositorio
git clone https://github.com/ruandma/hamburgueria-api.git
cd hamburgueria-api

# Rode com Maven Wrapper
./mvnw spring-boot:run

# Ou com Docker
docker build -t hamburgueria-api .
docker run -p 8080:8080 hamburgueria-api
```

Acesse:
- API: http://localhost:8080/produtos
- Swagger: http://localhost:8080/swagger-ui.html
- H2: http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:hamburgueria)

### Testes

```bash
./mvnw test
```
Resultado esperado: Tests run: 5, Failures: 0, Errors: 0

### Autor

**Ruan de Morais Arruda**
- GitHub: [@ruandma](https://github.com/ruandma)
- LinkedIn: [ruandma](https://www.linkedin.com/in/ruandma)

### Licenca

Este projeto esta sob a licenca MIT.
```
