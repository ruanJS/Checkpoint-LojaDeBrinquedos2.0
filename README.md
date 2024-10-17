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
https://cp-javass.onrender.com/req/login

## Validação de Dados: 
O uso de anotações de validação no BrinquedoDTO garante que os dados recebidos estão no formato correto e atendem às regras de negócio.

## Diagrama de classes
![imagem](https://github.com/user-attachments/assets/b4ac6ea5-88b2-4360-94d9-d329004c5733)

## Banco de dados
![Captura de tela 2024-08-22 215726](https://github.com/user-attachments/assets/877a7f85-18b5-43a6-823f-92f978f0bd6e)

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

