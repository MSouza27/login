# **AppLogin - Sistema de Autenticação**  

## 📌 **Descrição**  
AppLogin é um sistema de autenticação de usuários desenvolvido com **Java e Spring Boot**, utilizando **MySQL** para armazenamento de dados. O projeto permite o cadastro e login de usuários com validações e autenticação básica, garantindo um fluxo seguro e eficiente.  

## 🛠 **Tecnologias Utilizadas**  
- **Java 17**  
- **Spring Boot** (Spring MVC, Spring Data JPA)  
- **MySQL**  
- **Hibernate**  
- **Thymeleaf**  
- **Jakarta Validation**  
- **Maven**  

## 🚀 **Instalação e Configuração**  

### **1️⃣ Clonar o Repositório**  
```sh
git clone https://github.com/seu-usuario/AppLogin.git
cd AppLogin
```

### **2️⃣ Configurar o Banco de Dados**  
Certifique-se de ter o **MySQL** instalado e crie o banco de dados:  
```sql
CREATE DATABASE applogin;
```
Atualize as credenciais no arquivo `application.properties` (ou `DataConfiguration.java`, dependendo da configuração):  
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/applogin
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

### **3️⃣ Instalar Dependências**  
Certifique-se de ter o **Maven** instalado e execute:  
```sh
mvn clean install
```

### **4️⃣ Executar o Projeto**  
```sh
mvn spring-boot:run
```
O sistema estará disponível em **`http://localhost:8080`**.  

## 📌 **Principais Endpoints**  

| Método | Endpoint   | Descrição  |
|--------|-----------|------------|
| `GET`  | `/login`  | Página de login |
| `POST` | `/logar`  | Realiza a autenticação do usuário |
| `GET`  | `/`       | Página inicial após login |
| `GET`  | `/cadastro` | Página de cadastro de usuário |
| `POST` | `/cadastro` | Realiza o cadastro do usuário |

## 💡 **Melhorias Futuras**  
🔹 Implementação de segurança com **Spring Security**  
🔹 **Criptografia de senhas** para maior segurança  
🔹 Implementação de **recuperação de senha**  
🔹 Melhorias na interface utilizando **Bootstrap**  

## 🤝 **Contribuição**  
Contribuições são bem-vindas! Se deseja colaborar, siga os passos:  
1. Faça um **fork** do repositório  
2. Crie uma **branch** para sua feature: `git checkout -b minha-feature`  
3. Commit suas alterações: `git commit -m "Descrição da feature"`  
4. Faça um **push** para sua branch: `git push origin minha-feature`  
5. Abra um **Pull Request**  

Caso encontre algum problema, relate na aba **Issues** do repositório.  

