# 💳 PicPay Simplificado – Teste Técnico

Este é um projeto simplificado desenvolvido em **Java Spring Boot** como parte de um **teste técnico** para simular transações entre usuários, inspirado no funcionamento básico do **PicPay**.

---
## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (banco em memória para testes)
- **Maven**
- **Lombok**
- **REST API**

---

## 📋 Funcionalidades

- Cadastro de usuários (com tipo: **COMUM** ou **LOJISTA**)
- Consulta de saldo de um usuário
- Realização de transações entre usuários
    - Validação de saldo
    - Restrições para lojistas (não podem enviar dinheiro)
    - Simulação de serviço externo de autorização
    - Registro automático da transação
- Consulta do histórico de transações

---

