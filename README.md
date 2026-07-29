```md
# Hambúrgueria API 🍔

API REST para hamburgueria com Java 21, Spring Boot 3.5.4, JWT, DTOs, Paginação e Controle de Roles.

[Java](https://img.shields.io/badge/Java-21-orange)
[Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen)
[Deploy](https://img.shields.io/badge/Deploy-Render-blue)
[Tests](https://img.shields.io/badge/Tests-Passing-success)
[License](https://img.shields.io/badge/License-MIT-yellow)

### 🔗 API Online (Render)

**Base URL:** `https://hamburgueria-api-sln8.onrender.com`

- **Swagger UI:** https://hamburgueria-api-sln8.onrender.com/swagger-ui.html
- **Listar Produtos (teste rápido):** https://hamburgueria-api-sln8.onrender.com/produtos

> Plano gratuito hiberna - primeira requisição pode demorar até 50s.

### 🚀 Tecnologias

- **Java 21 + Spring Boot 3.5.4** (Web, Data JPA, Validation, Security)
- **Security:** Spring Security + JWT (jjwt 0.12.5) + Roles (ADMIN/USER)
- **Banco:** PostgreSQL (Render) / H2 (Dev e Testes)
- **Boas práticas:** DTOs (Request/Response), Pageable, GlobalExceptionHandler, CORS
- **Docs:** SpringDoc OpenAPI / Swagger
- **Build:** Maven Wrapper, Docker, JUnit 5 + MockMvc

### 🔐 Autenticação

1. **Registre um ADMIN:**
```http
POST /auth/register
{
  "username": "admin",
  "password": "123456",
  "role": "ROLE_ADMIN"
}
```

2. **Login:**
```http
POST /auth/login
{
  "username": "admin",
  "password": "123456"
}
-> retorna: eyJhbGciOi...
```

3. **No Swagger:** clica no cadeado 🔓 > `Bearer SEU_TOKEN`

### 📦 Endpoints

| Método | Endpoint | Acesso | Descrição |
|--------|----------|--------|-----------|
| POST | /auth/register | PUBLIC | Cria usuário |
| POST | /auth/login | PUBLIC | Gera JWT |
| GET | /produtos?page=0&size=10&sort=nome,asc | USER, ADMIN | Lista paginado |
| GET | /produtos/{id} | USER, ADMIN | Busca por ID |
| POST | /produtos | ADMIN | Cria produto |
| PUT | /produtos/{id} | ADMIN | Atualiza |
| DELETE | /produtos/{id} | ADMIN | Remove |

### 💻 Rodar Local

```bash
git clone https://github.com/ruandma/hamburgueria-api.git
cd hamburgueria-api
./mvnw spring-boot:run
```
Swagger: http://localhost:8080/swagger-ui.html

### 🧪 Testes

```bash
./mvnw test
```

### 👨‍💻 Autor

**Ruan de Morais Arruda** - Brasília/DF - Híbrido
- GitHub: [@ruandma](https://github.com/ruandma)
- LinkedIn: [linkedin.com/in/ruandma](https://www.linkedin.com/in/ruandma)
- CLT: R$ 4.000 Jr / R$ 4.500 Pl Jr