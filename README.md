# # RestCodScanner

O **RestCodScanner** é uma aplicação Spring Boot que demonstra a consulta a um banco de dados MySQL para recuperar informações de um produto com base no código de barras.

##### Foi escrito utilizando o Spring Tool Suite 4 Version: 4.22.0

Este projeto serve como um exemplo básico de como construir um serviço REST que interage com um banco de dados e retorna dados em formato JSON.
Funcionalidades

    Busca um produto no banco de dados MySQL utilizando o código de barras como parâmetro.
    Retorna um objeto JSON contendo todas as informações do produto caso seja encontrado.
    Retorna o status code 404 Not Found caso o produto não seja encontrado.

### Pré-requisitos

    Java 17 ou superior
    Banco de dados MySQL com tabela contendo informações de produtos (ajuste de acordo com a sua estrutura)
    Credenciais de acesso ao banco de dados MySQL

### Dependências

O projeto utiliza as seguintes dependências do Maven:

    Spring Boot Starter Data JPA: Fornece suporte para acesso a dados JPA.
    Spring Boot Starter Web: Habilita funcionalidades para desenvolvimento de aplicações web.
    MySQL Connector/J: Driver JDBC para conexão com banco de dados MySQL (adicionado em runtime).
    Spring Boot Starter Tomcat: Servidor web Tomcat embutido (opcional, fornecido como dependência de escopo provided).
    Spring Boot Starter Test: Dependências necessárias para testes unitários da aplicação.

Executando a aplicação

    Certifique-se de ter o Java 17 ou superior instalado e configurado no seu ambiente.
    Clone ou baixe o código fonte do projeto.
    Ajuste as configurações de conexão com o banco de dados MySQL no código da aplicação (normalmente na classe de configuração).
    Execute o comando mvn spring-boot:run no terminal para iniciar a aplicação.

# Exemplo de uso

A aplicação expõe um endpoint para consulta de produtos por código de barras. Substitua **your-code-here** pelo código de barras desejado na seguinte URL:

http://localhost:8080/api/produtos/codigoBarras/your-code-here

## Caso o produto seja encontrado:

A aplicação retornará um objeto JSON contendo todas as informações do produto. A estrutura do JSON dependerá da sua modelagem de entidade Produto.

## Caso o produto não seja encontrado:

A aplicação retornará o status code 404 Not Found.
#### Contribuindo

Este projeto é um exemplo básico e pode ser extendido para atender às suas necessidades específicas. Sinta-se à vontade para fazer fork, contribuir e enviar pull requests para melhorias.
Licença.