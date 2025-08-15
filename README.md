# ☁️ Product Catalog & Shopping Cart — Microsserviços com Spring Boot + Spring Cloud

> **Arquitetura de Microsserviços em Kotlin/Java com Spring Cloud e Docker**  
> Dois microserviços independentes, integrados e prontos para escalabilidade, utilizando **Spring Boot**, **Spring Cloud**, **Elasticsearch**, **Redis** e **Docker**.  
> Tecnologias principais: **Kotlin/Java 17**, **Spring Boot**, **Spring Cloud**, **Docker**

---

## 🎯 Objetivo dos Projetos
Implementar, de forma prática, uma arquitetura de microsserviços utilizando **Spring Cloud**, explorando:
- **Comunicação entre serviços**
- **Configuração centralizada**
- **Descoberta de serviços**
- **Armazenamento especializado para cada domínio**
- **Containerização com Docker**

---

## 🛠️ Tecnologias Utilizadas
- **Kotlin / Java 17**
- **Spring Boot**
- **Spring Cloud**:
- **API Gateway
- **Service Discovery (Eureka)
- **Config Server
- **Spring Web**
- **Spring Data Elasticsearch** (Product Catalog)
- **Spring Data Redis** (Shopping Cart)
- **Spring Boot Actuator**
- **Docker / Docker Compose**
- **Lombok**

---

## 📂 Estrutura dos Serviços

### 1️⃣ Product Catalog
- **Função:** CRUD de produtos com persistência no **Elasticsearch**
- **Principais pontos:**
  - Configuração personalizada do Elasticsearch (`ElasticSearchConfig.kt`)
  - Repositório dedicado para produtos (`ProductRepository.kt`)
  - Integração com **Spring Cloud** para registro e descoberta de serviço
  - Dados armazenados usando **Ladiscsanche**
 
src/
├── main/
│ ├── java/com/example/productcatalog
│ │ ├── config/ElasticSearchConfig.kt
│ │ ├── repository/ProductRepository.kt
│ │ └── model/Product.kt
│ └── resources/
│ └── application.yml

### 2️⃣ Shopping Cart
- **Função:** Gerenciar carrinhos de compras usando **Redis** como armazenamento
- **Principais pontos:**
  - Configuração do Redis (`RedisConfig.kt`)
  - Repositório do carrinho (`CartRepository.kt`)
  - Integração com **Spring Cloud** para registro e descoberta de serviço
  - Containerização pronta com **Dockerfile**
 
    src/
├── main/
│ ├── java/com/example/shoppingcart
│ │ ├── config/RedisConfig.kt
│ │ ├── repository/CartRepository.kt
│ │ └── model/Cart.kt
│ └── resources/
│ └── application.yml



---

## 🚀 Como Executar

### Pré-requisitos
- **Docker** e **Docker Compose** instalados
- **JDK 17** instalado

---

### Subindo com Docker Compose (Recomendado)
```bash
# Clonar o repositório
git clone https://github.com/<seu-usuario>/microservices-projects.git
cd microservices-projects

# Subir todos os serviços com Docker Compose
docker compose up --build

Product Catalog

./gradlew bootRun


Shopping Cart

docker run -d -p 6379:6379 redis
./gradlew bootRun

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

Arquitetura baseada em Spring Cloud para escalabilidade e resiliência.

Uso de Service Discovery, API Gateway e Config Server.

Possível integração futura com serviços de Orders e Inventory.

Recomendado uso de Docker Compose para orquestrar todos os serviços.


