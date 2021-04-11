# Automated Software Testing

### Objetivo:
* Realizar a automação de testes de uma API externa com o framework RestAssured.
    * Para testar a API foi necessário realizar o cadastro no 'https://developer.marvel.com/', para obter a chave pública e a chave privada. 
    Após isso se obtém um hash para tornar possível a chamada na API e assim seguir com os testes tendo cenários de sucesso e erro.

### Abaixo segue as rotas que foram testadas

``` shell
https://gateway.marvel.com:443/v1/public/characters
```
``` shell
https://gateway.marvel.com:443/v1/public/characters/{characterId}
```
``` shell
https://gateway.marvel.com:443/v1/public/comics
```
``` shell
https://gateway.marvel.com:443/v1/public/comics/{comicId}
```

### Abaixo segue a forma de realizar o clone e a chamada de testes na máquina local

1. Fazer o cloning do repositório:
``` shell
git clone https://github.com/CaioBastosImpacta/marvel-restassured.git
```

2. Executar o comando:
``` shell
cd app
```

``` shell
mvn clean test
```

### Abaixo segue a forma de realizar a chamada com o docker

* O Docker está em construção para facilitar a chamada.
![alt text](https://www.radcorp.com.br/site/assets/images/construcao-1000x750.png)