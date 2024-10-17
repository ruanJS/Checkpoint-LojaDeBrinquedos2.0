# Loja de Brinquedo 2024

# Visão Geral do Projeto
O projeto é uma aplicação para gerenciar uma loja de brinquedos. O objetivo é permitir a criação, leitura, atualização e exclusão de informações sobre brinquedos em um sistema centralizado. Este sistema pode ser utilizado por funcionários da loja para gerenciar o inventário de brinquedos, bem como por outras partes interessadas para interagir com as informações de forma programática. Além disso, está sendo utilizado o Spring Security para que o usuário tenha que se logar para conseguir acessar os outros endpoints

# Tecnologias utilizadas:
- **IDE:** IntelliJ
- **Linguagem:** Java
- **Framework:** SpringBoot

# Funcionalidades do Projeto
## Gerenciamento de Brinquedos:

CRUD de Brinquedos: Permite criar, ler, atualizar e deletar brinquedos. Cada brinquedo possui atributos como nome, tipo, classificação, tamanho e preço.

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

- Ana Paula Nascimento Silva (RM 552513) 
- Calina Thalya Santana da Silva (RM 552523) 
- Geovana Ribeiro D. Silva (RM 99646) 
- Leonardo Camargo Lucena (RM 552537)
- Nathan Nunes Calsonari (RM 552539) 

