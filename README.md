🚀🚀 PROJETO - SISTEMA DE FUNCIONÁRIOS 🚀🚀
⚠️⚠️ ANTES DE RODAR O PROJETO ⚠️⚠️

Antes de iniciar a aplicação, você PRECISA configurar o banco de dados no MySQL.

🛠️🛠️ 1. CRIAR O BANCO DE DADOS 🛠️🛠️

Execute o script abaixo no seu MySQL:

CREATE DATABASE empresa;
USE empresa;

CREATE TABLE funcionario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(50),
    telefone VARCHAR(30),
    idade INT
);

✅ Apenas copie e cole no MySQL e execute.

⚙️⚙️ 2. SINCRONIZAR O MAVEN ⚙️⚙️

Após abrir o projeto na sua IDE:

Clique em "Sincronizar Maven" (Reload Maven Project)
Isso irá baixar todas as dependências automaticamente
🔐🔐 3. CONFIGURAR O BANCO 🔐🔐

No arquivo application.properties, informe seus dados:

spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

⚠️ Confirme que o banco empresa está correto na configuração.
