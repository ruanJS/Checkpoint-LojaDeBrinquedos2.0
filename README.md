# Loja de Brinquedo - Gerenciamento de Inventário com Spring Security

# Visão Geral do Projeto
Este projeto é uma aplicação web desenvolvida em Java com Spring Boot, que permite o gerenciamento de brinquedos para uma loja virtual. A aplicação oferece funcionalidades de CRUD (Criar, Ler, Atualizar e Deletar) e é protegida por Spring Security, garantindo que apenas usuários autenticados possam acessar determinadas funcionalidades.

# Tecnologias utilizadas:
- **Linguagem:** Java
- **Framework:** Spring Boot
- **Segurança:** Spring Security com autenticação via login
- **Banco de Dados:** Oracle
- **Validação:** DTO com validação de dados
- **IDE:** IntelliJ IDEA
- **Deploy:** Render.com

# Funcionalidades do Projeto
## Gerenciamento de Brinquedos:

- CRUD Completo: Operações de criação, leitura, atualização e exclusão de brinquedos, com atributos como nome, tipo, tamanho, preço e classificação.
- Validação de Dados: Uso de DTOs para garantir que os dados de entrada atendam às regras de negócio.

## Segurança:

- **Autenticação:** Proteção de endpoints com login via Spring Security.
- **Formulário de Login:** Autenticação personalizada, redirecionando para a página de login caso o usuário não esteja autenticado.
- **Sessão de Usuário:** Logout disponível e protegido.

## Interface Amigável:

- **Design Responsivo:** O sistema conta com um layout simplificado e estilizado com CSS, permitindo que os usuários tenham uma experiência fluida ao acessar a aplicação.
  
# Link do Site
https://checkpoint-lojadebrinquedos20-production.up.railway.app/req/login

## Validação de Dados: 
O uso de anotações de validação no BrinquedoDTO garante que os dados recebidos estão no formato correto e atendem às regras de negócio.

## Diagrama de classes
![DALL·E-2024-10-17-22 21 42-A-simple-UML-class-diagram-for-a-Toy-Store-project](https://github.com/user-attachments/assets/52a16ce8-7eb7-4a4b-aad4-75ac271c51f3)


## Banco de dados das tabelas brinquedos e usuário.
## Tabela Brinquedos:
![banco de dados - brinquedos](https://github.com/user-attachments/assets/4bfefa58-2f86-4b39-a76e-44641a6879e3)

## Tabela Usuário:
![banco de dados - users](https://github.com/user-attachments/assets/9f0324fa-6174-4991-9839-f7b9924486dd)


## Endpoints

- **Login:** /req/login
- **Signup:** /req/signup
- **Listar Brinquedos:** GET /brinquedos/listar
- **Obter Brinquedo por ID:** GET /brinquedos/{id}
- **Cadastrar Brinquedo:** POST /brinquedos/cadastrar
- **Atualizar Brinquedo:** PUT /brinquedos/{id}
- **Deletar Brinquedo:** DELETE /brinquedos/{id}

## Integrantes

- Ruan Guedes - rm551096
- Ana Beatriz Bento Silva - rm552536
- Angelo Augusto - rm98310
- Alberto Rubinho - rm99706

