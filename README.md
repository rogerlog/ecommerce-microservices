# Solução de e-commerce com microsserviços em Java

- Microserviços
- Spring
- Kafka
- Avro
- Zookeeper
- Schema Registry

### Arquitetura

- Checkout

  - checkout-front
  - checkout-api

- Payment

  - payment-api

  

<br>

> checkout-front ➜ checkout-api ➜ Kafka ➜ payment-api



<br>

<hr>

<br>

## - Docker

Executar o docker compose do arquivo `/checkout/docker/docker-compose.yml` para criação do banco

```shell
docker-compose down

docker-compose up --build -d

docker ps
```

#### 