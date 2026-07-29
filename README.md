# Hambúrgueria API 🍔

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen?style=for-the-badge&logo=springboot)
![Swagger](https://img.shields.io/badge/Swagger-Working-success?style=for-the-badge&logo=swagger&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-Auth-blue?style=for-the-badge&logo=jsonwebtokens)
![Render](https://img.shields.io/badge/Deploy-Render-46E3B7?style=for-the-badge&logo=render)
![Tests](https://img.shields.io/badge/Tests-Passing-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

> API REST 110% - Java 21, Spring Boot 3.5.4, JWT + Roles, Paginação, DTOs, Swagger funcionando.

### 🔗 Demonstração Online

| Recurso | Link |
|---|---|
| **Base URL** | `https://hamburgueria-api-sln8.onrender.com` |
| **Swagger UI** | [Abrir Swagger](https://hamburgueria-api-sln8.onrender.com/swagger-ui.html) |
| **Health Check** | [/actuator/health](https://hamburgueria-api-sln8.onrender.com/actuator/health) |
| **Listar Produtos** | [/produtos?page=0&size=10](https://hamburgueria-api-sln8.onrender.com/produtos) |

> ⚠️ Render gratuito hiberna - primeira requisição pode demorar até 50s.

### 🚀 Tecnologias

- **Core:** Java 21, Spring Boot 3.5.4 (Web, Data JPA, Validation, Security, Actuator)
- **Security:** Spring Security + JWT jjwt 0.12.5 + Roles `ROLE_ADMIN` / `ROLE_USER`
- **Banco:** PostgreSQL (Prod - Render) / H2 (Dev e Testes)
- **Docs:** SpringDoc OpenAPI 2.8.8 - Swagger UI funcionando
- **Boas práticas:** DTOs Request/Response, Pageable, GlobalExceptionHandler, CORS, Bean Validation
- **Build:** Maven Wrapper, Docker, JUnit 5 + MockMvc

### 🔐 Autenticação - Teste em 1 minuto

**1. Registre um ADMIN:**
```http
POST /auth/register
Content-Type: application/json

{
  "username": "admin",
  "password": "123456",
  "role": "ROLE_ADMIN"
}
```

**2. Faça Login:**
```http
POST /auth/login

{
  "username": "admin",
  "password": "123456"
}
// Retorna: { "token": "eyJhbGciOiJIUzI1NiJ9..." }
```

**3. Use no Swagger:** Clique no cadeado 🔓 no topo > `Bearer SEU_TOKEN`

### 📦 Endpoints

| Método | Endpoint | Acesso | Descrição |
|---|---|---|---|
| POST | `/auth/register` | PUBLIC | Cria usuário |
| POST | `/auth/login` | PUBLIC | Gera JWT |
| GET | `/produtos?page=0&size=10&sort=nome,asc` | USER, ADMIN | Lista paginado |
| GET | `/produtos/{id}` | USER, ADMIN | Busca por ID |
| POST | `/produtos` | ADMIN | Cria produto |
| PUT | `/produtos/{id}` | ADMIN | Atualiza |
| DELETE | `/produtos/{id}` | ADMIN | Remove |
| GET | `/actuator/health` | PUBLIC | Health check |

### 📬 Postman

Importe a collection 110%:
- `docs/Hamburgueria-API-110.postman_collection.json`
- `.postman/Hamburgueria-API-110.postman_collection.json`

Já vem com variáveis `{{baseUrl}}` e `{{token}}` + todos os endpoints com Auth.

### 💻 Rodar Local

```bash
git clone https://github.com/ruandma/hamburgueria-api.git
cd hamburgueria-api
./mvnw spring-boot:run
# Swagger: http://localhost:8080/swagger-ui.html
```

### 🧪 Testes

```bash
./mvnw test
```

### 👨💻 Autor

**Ruan de Morais Arruda** - Brasília/DF - Híbrido
- GitHub: [@ruandma](https://github.com/ruandma)
- LinkedIn: [linkedin.com/in/ruandma](https://www.linkedin.com/in/ruandma)
- CLT: R$ 4.000 Jr / R$ 4.500 Pleno Jr
- Horário: 02:30 - Projeto 110% entregue

---
Feito com ☕ e debug de madrugada - Java 21 + Spring Boot 3.5.4
