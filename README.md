# 🍔 Hamburgueria API

API REST para gerenciamento de produtos de uma hamburgueria, desenvolvida com foco em boas práticas para portfólio de Desenvolvedor Java Júnior.

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.0-brightgreen)
![Maven](https://img.shields.io/badge/Maven-4.0.0-blue)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow)

### 🔗 Repositório: https://github.com/ruandma/hamburgueria-api

## 🚀 Tecnologias

- **Java 21**
- **Spring Boot 4.1.0** (Web, Data JPA)
- **H2 Database** (em memória)
- **Hibernate 7.4.1**
- **Maven**
- **Lombok**

## 📦 Funcionalidades

- [x] CRUD completo de Produtos
- [x] Persistência em H2
- [ ] Validação com Bean Validation
- [ ] Tratamento global de erros
- [ ] Autenticação com Spring Security + JWT
- [ ] CRUD de Pedidos
- [ ] Docker

## 📚 Endpoints

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/produtos` | Lista todos os produtos |
| `GET` | `/produtos/{id}` | Busca produto por ID |
| `POST` | `/produtos` | Cria novo produto |
| `PUT` | `/produtos/{id}` | Atualiza produto |
| `DELETE` | `/produtos/{id}` | Deleta produto |

## ▶️ Como Rodar

1. Clone o projeto:
```bash
git clone https://github.com/ruandma/hamburgueria-api.git
cd hamburgueria-api