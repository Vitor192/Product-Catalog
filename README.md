# 📦 Product Catalog & Shopping Cart — Microsserviços com Spring Boot

> **Projetos de Microsserviços em Kotlin/Java com Spring Boot e Docker**  
> Dois microserviços construídos para gerenciar produtos e carrinhos de compras.  
> Tecnologias principais: **Spring Boot**, **Elasticsearch**, **Redis**, **Docker**, **Kotlin/Java**

---

## 🎯 Objetivo dos Projetos
Estes projetos têm como finalidade demonstrar na prática como implementar **arquitetura de microsserviços**, com serviços independentes, armazenamento especializado e containerização:  

1. **Product Catalog** — Gerencia produtos e realiza operações CRUD com **Elasticsearch**.  
2. **Shopping Cart** — Gerencia carrinhos de compras, armazenando dados em **Redis** e pronto para integração com outros serviços.

---

## 🛠️ Tecnologias Utilizadas
- Kotlin / Java 17
- Spring Boot
- Spring Web
- Spring Data Elasticsearch (Product Catalog)
- Spring Data Redis (Shopping Cart)
- Spring Boot Actuator
- Docker / Docker Compose
- Lombok (redução de boilerplate)

---

## 📂 Estrutura dos Projetos

### 1️⃣ Product Catalog
- **Responsabilidade:** CRUD de produtos com persistência no **Elasticsearch**
- **Configurações importantes:**  
  - `ElasticSearchConfig.kt` — configuração do Elasticsearch  
  - `ProductRepository.kt` — repositório para produtos  
- **Dados armazenados:** Usando **Ladiscsanche**  

src/
├── main/
│ ├── java/com/example/productcatalog
│ │ ├── config/ElasticSearchConfig.kt
│ │ ├── repository/ProductRepository.kt
│ │ └── model/Product.kt
│ └── resources/
│ └── application.yml



---

### 2️⃣ Shopping Cart
- **Responsabilidade:** Gerenciar carrinhos de compras com dados em **Redis**
- **Configurações importantes:**  
  - `RedisConfig.kt` — configuração do Redis  
  - `CartRepository.kt` — repositório de carrinho  
- **Containerização:** Dockerfile incluso  

src/
├── main/
│ ├── java/com/example/shoppingcart
│ │ ├── config/RedisConfig.kt
│ │ ├── repository/CartRepository.kt
│ │ └── model/Cart.kt
│ └── resources/
│ └── application.yml
Dockerfile



---

## 🚀 Como Executar

### Product Catalog
**Pré-requisitos:** Elasticsearch rodando localmente ou via Docker  

```bash
# Clonar repositório
git clone https://github.com/<seu-usuario>/product-catalog.git
cd product-catalog

# Rodar o projeto
./gradlew bootRun

# Ou com Docker
docker build -t product-catalog .
docker run -p 8080:8080 product-catalog

Shopping Cart

Pré-requisitos: Redis rodando localmente ou via Docker


# Clonar repositório
git clone https://github.com/<seu-usuario>/shopping-cart.git
cd shopping-cart

# Rodar o projeto
./gradlew bootRun

# Ou com Docker
docker build -t shopping-cart .
docker run -p 8081:8081 shopping-cart

# Caso queira rodar Redis via Docker
docker run -d -p 6379:6379 redis

🔗 Endpoints Principais
Product Catalog

GET /products — Listar todos os produtos

GET /products/{id} — Obter produto por ID

POST /products — Criar produto

PUT /products/{id} — Atualizar produto

DELETE /products/{id} — Remover produto

Shopping Cart

GET /cart/{userId} — Obter carrinho do usuário

POST /cart/{userId}/add — Adicionar item

POST /cart/{userId}/remove — Remover item

POST /cart/{userId}/checkout — Finalizar compra

📌 Observações

Projetos preparados para arquitetura de microsserviços.

Integração futura entre Product Catalog e Shopping Cart via APIs REST.

Recomendado uso de Docker Compose para orquestrar múltiplos serviços.
