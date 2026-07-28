# Hamburgueria API 🍔

API REST para gerenciamento de produtos de uma hamburgueria, desenvolvida com foco em boas práticas para portfólio Java Júnior.

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-green)
![Status](https://img.shields.io/badge/Status-Completo-blue)

## 🚀 Tecnologias
- Java 21
- Spring Boot 3.5.4 (Web, Data JPA, Validation)
- H2 Database
- Bean Validation
- SpringDoc Swagger
- Maven

## 📦 Funcionalidades
- CRUD completo de Produtos
- Validação com Bean Validation
- Tratamento global de erros
- Documentação automática com Swagger

## 📚 Endpoints
| Método | Endpoint | Status |
|---|---|---|
| GET | /produtos | 200 |
| GET | /produtos/{id} | 200 / 404 |
| POST | /produtos | 201 |
| PUT | /produtos/{id} | 200 / 404 |
| DELETE | /produtos/{id} | 204 / 404 |

## ▶️ Como Rodar
```bash
git clone https://github.com/ruandma/hamburgueria-api.git
cd hamburgueria-api
./mvnw spring-boot:run
