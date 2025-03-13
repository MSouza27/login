# AppLogin - Sistema de Autenticação

## Descrição
AppLogin é um sistema de autenticação de usuários desenvolvido em Java com Spring Boot e MySQL. O projeto permite o cadastro e login de usuários utilizando validações e autenticação básica.

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Thymeleaf
- Jakarta Validation
- Hibernate

## Instalação e Configuração

### 1. Clonar o Repositório
```sh
 git clone https://github.com/seu-usuario/AppLogin.git
 cd AppLogin
```

### 2. Configurar o Banco de Dados
Certifique-se de ter o MySQL instalado e crie o banco de dados:
```sql
CREATE DATABASE applogin;
```
Altere as credenciais do banco no arquivo `DataConfiguration.java` se necessário.

### 3. Instalar Dependências
Certifique-se de ter o Maven instalado e execute:
```sh
 mvn clean install
```

### 4. Executar o Projeto
```sh
 mvn spring-boot:run
```
O sistema estará disponível em `http://localhost:8080`.

## Endpoints Principais
- `GET /login` - Página de login.
- `POST /logar` - Realiza a autenticação do usuário.
- `GET /` - Página inicial do sistema após login.

## Melhorias Futuras
- Implementação de segurança com Spring Security.
- Criptografia de senhas.
- Implementação de recuperação de senha.
- Melhorias na interface com Bootstrap.

## Contribuição
Fique à vontade para abrir um pull request ou relatar problemas na aba "Issues" do repositório.

