📦 Projeto - Sistema de Funcionários
🚀 Antes de rodar o projeto

Antes de iniciar a aplicação, é necessário configurar o banco de dados corretamente no seu MySQL.

🛠️ 1. Criar o banco de dados

Execute o seguinte script diretamente no seu MySQL:

CREATE DATABASE empresa;
USE empresa;

CREATE TABLE funcionario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(50),
    telefone VARCHAR(30),
    idade INT
);

✅ Basta copiar e colar no MySQL e executar.

⚙️ 2. Configurar o Maven

Após abrir o projeto na sua IDE:

Clique em "Sincronizar Maven" (ou Reload Maven Project)
Isso irá baixar automaticamente todas as dependências necessárias
🔐 3. Configurar acesso ao banco

No arquivo application.properties, preencha suas credenciais do MySQL:

spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

💡 Certifique-se de que o nome do banco (empresa) está correto na configuração.
