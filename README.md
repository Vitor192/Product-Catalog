# 📦 Product Catalog - Microservice

**O catálogo de produtos do seu e-commerce!**  
Este microsserviço é responsável pelo **gerenciamento de produtos**, permitindo **cadastrar**, **atualizar**, **listar** e **remover** itens disponíveis para compra.  
Desenvolvido com 💛 usando **Java Spring Boot** e seguindo boas práticas de arquitetura.

---

## ✨ Funcionalidades
- ➕ **Cadastrar novos produtos**
- ✏ **Atualizar informações de produtos**
- 📜 **Listar todos os produtos**
- 🔍 **Buscar produtos por ID**
- 🗑 **Remover produtos do catálogo**

---

## 🛠 Tecnologias Utilizadas
| Tecnologia | Função |
|------------|--------|
| ☕ **Java 17** | Linguagem principal |
| 🚀 **Spring Boot** | Framework backend |
| ☁️ **Spring Cloud** | Integração entre microsserviços |
| 🗄 **PostgreSQL** (ou MySQL, se for o caso) | Banco de dados relacional |
| 📦 **Maven** | Gerenciador de dependências |
| 🐳 **Docker** (opcional) | Containerização |

---

## 🚀 Como Executar Localmente

### 1️⃣ Clonar o Repositório
```bash
git clone https://github.com/Vitor192/Product-Catalog.git

📡 Endpoints Principais

GET    /products          # 📜 Lista todos os produtos
POST   /products          # ➕ Cadastra um novo produto
GET    /products/{id}     # 🔍 Busca produto pelo ID
PUT    /products/{id}     # ✏ Atualiza produto pelo ID
DELETE /products/{id}     # 🗑 Remove produto pelo ID

📂 Estrutura do Projeto

product-catalog/
 ├── src/
 │   ├── main/
 │   │   ├── java/
 │   │   │    └── com.example.productcatalog/
 │   │   │         ├── controller/
 │   │   │         ├── service/
 │   │   │         ├── model/
 │   │   │         └── repository/
 │   │   └── resources/
 │   │        ├── application.properties
 │   │        └── data.sql
 └── pom.xml


