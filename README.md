# 📦 Product Catalog - Microservice

Microsserviço responsável pelo **gerenciamento de produtos** no sistema.  
Permite cadastrar, listar, atualizar e remover produtos via API REST.

---

## 🚀 Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Maven
- JPA / Hibernate
- Banco de dados relacional (MySQL/PostgreSQL)
- Docker (opcional)

---

## 📦 Como Executar

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/Vitor192/Product-Catalog.git

Executar com Maven

Bash
mvn spring-boot:run

GET    /products          # Lista todos os produtos
POST   /products          # Cadastra um novo produto
GET    /products/{id}     # Busca produto pelo ID
PUT    /products/{id}     # Atualiza produto pelo ID
DELETE /products/{id}     # Remove produto pelo ID


