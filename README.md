@"
# Hamburgueria API 🍔

API REST para gerenciamento de produtos de uma hamburgueria, com CRUD completo, validação e testes. Projeto do meu portfólio.

[![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen?style=for-the-badge&logo=springboot)](https://spring.io/)
[![Deploy](https://img.shields.io/badge/Deploy-LIVE-success?style=for-the-badge&logo=render)](https://hamburgueria-api-sln8.onrender.com)
[![Tests](https://img.shields.io/badge/Tests-5%20passing-brightgreen?style=for-the-badge&logo=junit5)](#)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)

### 🔗 API Online
**Base URL:** \`https://hamburgueria-api-sln8.onrender.com\`

- **Swagger:** [/swagger-ui.html](https://hamburgueria-api-sln8.onrender.com/swagger-ui.html)
- **Produtos:** [/produtos](https://hamburgueria-api-sln8.onrender.com/produtos)
- **H2 Console:** [/h2-console](https://hamburgueria-api-sln8.onrender.com/h2-console)

> Obs: Plano free do Render dorme após inatividade, primeira requisição pode demorar 50s.

### 🚀 Tecnologias
Java 21 | Spring Boot 3.5.4 (Web, Data JPA, Validation) | H2 Database | SpringDoc OpenAPI | JUnit 5, MockMvc | Maven | Docker | Render

### ✅ Funcionalidades
- [x] CRUD completo de Produtos
- [x] Validação com Bean Validation
- [x] Tratamento global de erros
- [x] Documentação Swagger
- [x] Testes unitários e de integração (5 testes)
- [x] Deploy com Docker no Render

### 📚 Endpoints
| Método | Endpoint | Descrição |
|---|---|---|
| GET | /produtos | Lista todos |
| GET | /produtos/{id} | Busca por ID |
| POST | /produtos | Cria novo |
| PUT | /produtos/{id} | Atualiza |
| DELETE | /produtos/{id} | Remove |

### ▶ Como Rodar Local
\`\`\`bash
./mvnw spring-boot:run
# http://localhost:8080
\`\`\`

### 👨‍💻 Autor
**Ruan de Morais Arruda** - [LinkedIn](https://www.linkedin.com/in/ruandma) | [GitHub](https://github.com/ruandma)

### 📄 Licença
MIT
"@ | Set-Content -Path README.md -Encoding UTF8

git add README.md
git commit -m "docs: final README com deploy live"
git push
