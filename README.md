# Hamburgueria API 🍔

API REST para gerenciamento de produtos de uma hamburgueria, desenvolvida com foco em boas práticas, validação e documentação para portfólio Java Júnior.

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-brightgreen)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)
![License](https://img.shields.io/badge/License-MIT-blue)

### 🚀 Tecnologias
- **Java 21**
- **Spring Boot 3.5.4** (Web, Data JPA, Validation)
- **H2 Database** (em memória)
- **Bean Validation**
- **SpringDoc OpenAPI / Swagger**
- **Maven 3.9+ / Maven Wrapper**

### 📦 Funcionalidades
- [x] CRUD completo de Produtos
- [x] Validação com Bean Validation (`@NotBlank`, `@NotNull`, `@Positive`)
- [x] Tratamento global de erros com `@RestControllerAdvice`
- [x] Documentação automática com Swagger
- [x] Banco H2 em memória + console
- [ ] Testes unitários (em progresso)
- [ ] Deploy (próximo passo)

### 📚 Endpoints
| Método | Endpoint | Status | Descrição |
|---|---|---|---|
| GET | `/produtos` | 200 | Lista todos os produtos |
| GET | `/produtos/{id}` | 200 / 404 | Busca produto por ID |
| POST | `/produtos` | 201 | Cria novo produto |
| PUT | `/produtos/{id}` | 200 / 404 | Atualiza produto |
| DELETE | `/produtos/{id}` | 204 / 404 | Remove produto |

### ▶ Como Rodar

**Pré-requisitos:** Java 21+

```bash
# Clone o repositório
git clone https://github.com/ruandma/hamburgueria-api.git
cd hamburgueria-api

# Rode a API (escolha um)

# Linux / macOS / Git Bash
./mvnw spring-boot:run

# Windows PowerShell / CMD
./mvnw.cmd spring-boot:run

# Se já tem Maven instalado
mvn spring-boot:run