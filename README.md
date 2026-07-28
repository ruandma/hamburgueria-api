# Hamburgueria API 🍔

API REST para gerenciamento de produtos de uma hamburgueria, com CRUD completo, validação e testes automatizados.

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen?style=for-the-badge&logo=springboot)
![Deploy](https://img.shields.io/badge/Deploy-LIVE-success?style=for-the-badge&logo=render)
![Tests](https://img.shields.io/badge/Tests-5%20passing-brightgreen?style=for-the-badge&logo=junit5)
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)

### 🔗 API Online

**Base URL:** `https://hamburgueria-api-sln8.onrender.com`

Acesso direto (sem erro Whitelabel):
- **Swagger UI:** https://hamburgueria-api-sln8.onrender.com/swagger-ui.html
- **Listar Produtos:** https://hamburgueria-api-sln8.onrender.com/produtos

> Nota: Plano gratuito no Render hiberna após inatividade. A primeira requisição pode demorar até 50s.

### Tecnologias

- Java 21
- Spring Boot 3.5.4 (Web, Data JPA, Validation, Security + JWT)
- PostgreSQL (Render) / H2 (local)
- SpringDoc OpenAPI / Swagger
- JUnit 5 + MockMvc + AssertJ
- Maven / Docker / Render (CI/CD)

### Funcionalidades

- CRUD completo de Produtos
- Autenticação com JWT
- Validação com Bean Validation
- Tratamento global de erros com @ControllerAdvice
- Documentação automática com Swagger
- Testes unitários e de integração
- Deploy containerizado

### Endpoints

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| GET | /produtos | Lista todos os produtos |
| GET | /produtos/{id} | Busca produto por ID |
| POST | /produtos | Cria um novo produto |
| PUT | /produtos/{id} | Atualiza um produto |
| DELETE | /produtos/{id} | Remove um produto |

Exemplo payload POST:
```json
{
  "nome": "X-Burguer",
  "preco": 25.90,
  "descricao": "Pao, carne e queijo"
}
```

Como Rodar Localmente
```bash
git clone https://github.com/ruandma/hamburgueria-api.git
cd hamburgueria-api
./mvnw spring-boot:run
```

Acesse:

Swagger: http://localhost:8080/swagger-ui.html
API: http://localhost:8080/produtos

Testes

./mvnw test

Autor
Ruan de Morais Arruda - Brasília/DF - Híbrido

GitHub: @ruandma
LinkedIn: ruandma
CLT: R$ 4.000 Jr / R$ 4.500 Pl Jr
