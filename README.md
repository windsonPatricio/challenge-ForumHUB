# 📚 Forum HUB

**Forum HUB** é uma API REST desenvolvida com Spring Boot que gerencia usuários, autores e discussões em um fórum. O projeto utiliza autenticação JWT, integração com Swagger para documentação e segue boas práticas de segurança.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3
- Spring Security (com JWT)
- Spring Data JPA + Hibernate
- Banco de Dados H2 (padrão) ou PostgreSQL (configurável)
- Swagger/OpenAPI (SpringDoc)

---

## 🔐 Autenticação JWT

A autenticação é baseada em JWT. Para acessar as rotas protegidas:

1. Faça login via endpoint `/login` com `login` e `senha`.
2. Copie o token JWT retornado.
3. Use esse token nas requisições protegidas (Authorization: `Bearer SEU_TOKEN`).

---

## 🧪 Testando com Swagger

Acesse:

http://localhost:8080/swagger-ui.html


1. Clique em **"Authorize"**.
2. No campo `bearerAuth`, cole:
Bearer SEU_TOKEN_JWT


3. Agora você poderá testar todas as rotas da API diretamente no Swagger.

---

## 📂 Estrutura do Projeto

src/
└── main/
├── java/
│ └── alura.com.forumHub/
│ ├── controller/
│ ├── domain/
│ ├── repository/
│ ├── service/
│ └── infra/
│ └── security/
└── resources/
└── application.properties


---

## ⚙️ Configuração Rápida

### ✅ Pré-requisitos

- Java 17
- Maven
- (Opcional) PostgreSQL

### ▶️ Executando a aplicação

```bash
./mvnw spring-boot:run
🔧 Variáveis de Ambiente
No application.properties:

api.security.token.secret=${JWT_SECRET:12345678}
Você pode definir a variável de ambiente JWT_SECRET para alterar a chave do token.

📫 Contribuições
Pull requests são bem-vindos. Para grandes mudanças, abra uma issue primeiro para discutir o que você gostaria de modificar.
