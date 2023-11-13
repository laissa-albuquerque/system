# System

Esse é o microserviço que faz a orquestração com o [bank](https://github.com/laissa-albuquerque/bank) e [home-broker](https://github.com/laissa-albuquerque/home-broker);

### Pré-requisitos

* Ter instalado na máquina o docker;
* Ter o postman ou insomnia instalado; 

### Serviço

Foi utilizado o padrão de comunicação RESTFul, e padrão de arquitetura MVC, onde possui três modulos, sendo:
* core
* dataprovider
* entrypoint

### Configuração 

* Baixar o arquivo [docker-compose](https://github.com/laissa-albuquerque/system/blob/main/Docker/docker-compose.yml)

No terminal dentro da pasta onde está o arquivo, rode o comando:
```
docker-compose up
```

### Utilização

* Baixar a [collection](https://github.com/laissa-albuquerque/system/blob/main/collections/system.postman_collection.json)
* Importar o collection no postman ou insomnia;

Possui as operações de:

1. Cadrastar usuário e conta;
2. Depositar;
3. Sacar;
4. Buscar ações que podem ser compradas com saldo que possui na conta;
