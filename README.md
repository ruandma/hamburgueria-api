# Hamburgueria API 🍔

API REST para gerenciamento de produtos de uma hamburgueria, com CRUD completo, validação e testes.

[![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen?style=for-the-badge&logo=springboot)](https://spring.io/)
[![Tests](https://img.shields.io/badge/Tests-5%20passing-brightgreen?style=for-the-badge&logo=junit5)](https://github.com/ruandma/hamburgueria-api/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)
[![Deploy](https://img.shields.io/badge/Deploy-Render-46E3B7?style=for-the-badge&logo=render)](https://hamburgueria-api.onrender.com)

### 🚀 Tecnologias
- Java 21 | Spring Boot 3.5.4 (Web, Data JPA, Validation)
- H2 Database | Bean Validation | SpringDoc OpenAPI
- JUnit 5, MockMvc, AssertJ | Maven Wrapper

### ✅ Funcionalidades
- [x] CRUD completo de Produtos
- [x] Validação com Bean Validation
- [x] Tratamento global de erros
- [x] Documentação Swagger
- [x] Testes unitários e de integração (5 testes)
- [x] Deploy

### 📚 Endpoints
| Método | Endpoint | Status |
|---|---|---|
| GET | /produtos | 200 |
| GET | /produtos/{id} | 200 / 404 |
| POST | /produtos | 201 / 400 |
| PUT | /produtos/{id} | 200 / 404 |
| DELETE | /produtos/{id} | 204 / 404 |

### ▶ Como Rodar
```bash
./mvnw spring-boot:run
# API em http://localhost:8080