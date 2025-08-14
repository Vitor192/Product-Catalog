# 📦 Product Catalog — Microsserviços com Spring Cloud

> **Construindo um Projeto com Arquitetura Baseada em Microsserviços Usando Spring Cloud**  
> Aprenda na prática como funciona uma arquitetura de software baseada em microsserviços, seus benefícios e desafios, criando um projeto real em **Java com Spring Cloud** para o seu portfólio.  
> Tecnologias principais: **Spring**, **Docker**, **Java 17**

---

## 🎯 Objetivo do Projeto
Este projeto tem como finalidade demonstrar, de forma prática, como implementar uma **arquitetura de microsserviços** usando **Spring Cloud**.  
Durante o desenvolvimento, aplicamos padrões de comunicação, configuração centralizada e containerização com Docker.

---

## 🛠️ Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Cloud**
- **Spring Web**
- **Spring Data Elasticsearch**
- **Spring Boot Actuator**
- **Docker**

---

## 📂 Estrutura do Projeto
O sistema é composto por múltiplos serviços independentes, que se comunicam entre si:

- **API Gateway** — Roteamento de requisições.
- **Service Discovery** — Registro e descoberta de serviços.
- **Config Server** — Gerenciamento centralizado de configurações.
- **Product Catalog Service** — CRUD de produtos com integração ao **Elasticsearch**.
- **Outros serviços** — (Possível expansão futura: Inventory, Orders, etc.)

---

## ⚙️ Dependências Usadas
- **Spring Data Elasticsearch** (Access + Driver)
- **Spring Web**
- **Spring Boot Actuator**

---

## 🚀 Como Executar
**Pré-requisitos:**  
- Docker e Docker Compose instalados
- JDK 17

### Passos para execução
```bash
# 1. Clonar o repositório
git clone https://github.com/<seu-usuario>/Product-Catalog.git
cd Product-Catalog

# 2. Subir os containers com Docker Compose
docker compose up --build

# 3. Acessar os serviços
# API Gateway
http://localhost:8080
# Swagger (exemplo)
http://localhost:8081/swagger-ui/index.html
