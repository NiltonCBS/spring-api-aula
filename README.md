# API de Comércio com Spring Boot

Esta API oferece um conjunto de endpoints para gerenciar dados de comércio eletrônico, incluindo produtos, informações de localização e outras entidades relacionadas. Ela foi construída usando o framework Spring Boot.

## URL Base
A URL base para todos os endpoints é `http://localhost:8080`.

## Endpoints da API

A documentação está organizada por recurso, detalhando os métodos HTTP disponíveis, seus respectivos endpoints e os corpos de requisição necessários.

### Sexo
* **Listar todos os sexos:** `GET /sexos`
* **Buscar sexo por ID:** `GET /sexos/{id}`
* **Cadastrar um novo sexo:** `POST /sexos`
    * **Corpo (JSON):**
        ```json
        {
          "nomesexo": "Feminino"
        }
        ```
* **Alterar um sexo:** `PUT /sexos/{id}`
    * **Corpo (JSON):**
        ```json
        {
          "nomesexo": "Masculino"
        }
        ```
* **Deletar um sexo:** `DELETE /sexos/{id}`

---

### UF (Unidade Federativa)
* **Listar todas as UFs:** `GET /ufs`
* **Buscar UF por ID:** `GET /ufs/{id}`
* **Cadastrar uma nova UF:** `POST /ufs`
    * **Corpo (JSON):**
        ```json
        {
          "nomeuf": "São Paulo",
          "sigla": "SP"
        }
        ```
* **Alterar uma UF:** `PUT /ufs/{id}`
    * **Corpo (JSON):**
        ```json
        {
          "nomeuf": "Rio de Janeiro",
          "sigla": "RJ"
        }
        ```
* **Deletar uma UF:** `DELETE /ufs/{id}`

---

### Cidade
* **Listar todas as cidades:** `GET /cidades`
* **Buscar cidade por ID:** `GET /cidades/{id}`
* **Cadastrar uma nova cidade:** `POST /cidades`
    * **Corpo (JSON):**
        ```json
        {
          "nomeCidade": "Jales",
          "uf": {
            "coduf": 2
          }
        }
        ```
* **Alterar uma cidade:** `PUT /cidades/{id}`
    * **Corpo (JSON):**
        ```json
        {
          "nomeCidade": "Rio Preto",
          "uf": {
            "coduf": 2
          }
        }
        ```
* **Deletar uma cidade:** `DELETE /cidades/{id}`

---

### Tipo
* **Listar todos os tipos:** `GET /tipos`
* **Buscar tipo por ID:** `GET /tipos/{id}`
* **Cadastrar um novo tipo:** `POST /tipos`
    * **Corpo (JSON):**
        ```json
        {
          "nomeTipo": "São Paulo"
        }
        ```
* **Alterar um tipo:** `PUT /tipos/{id}`
    * **Corpo (JSON):**
        ```json
        {
          "nomeTipo": "Rio de Janeiro"
        }
        ```
* **Deletar um tipo:** `DELETE /tipos/{id}`

---

### Rua
* **Listar todas as ruas:** `GET /ruas`
* **Buscar rua por ID:** `GET /ruas/{id}`
* **Cadastrar uma nova rua:** `POST /ruas`
    * **Corpo (JSON):**
        ```json
        {
          "nomeRua": "São Paulo"
        }
        ```
* **Alterar uma rua:** `PUT /ruas/{id}`
    * **Corpo (JSON):**
        ```json
        {
          "nomeRua": "Rio de Janeiro"
        }
        ```
* **Deletar uma rua:** `DELETE /ruas/{id}`

---

### Marca
* **Listar todas as marcas:** `GET /marcas`
* **Buscar marca por ID:** `GET /marcas/{id}`
* **Cadastrar uma nova marca:** `POST /marcas`
    * **Corpo (JSON):**
        ```json
        {
          "nomeMarca": "Yamaha"
        }
        ```
* **Alterar uma marca:** `PUT /marcas/{id}`
    * **Corpo (JSON):**
        ```json
        {
          "nomeMarca": "Honda"
        }
        ```
* **Deletar uma marca:** `DELETE /marcas/{id}`

---

### Bairro
* **Listar todos os bairros:** `GET /bairros`
* **Buscar bairro por ID:** `GET /bairros/{id}`
* **Cadastrar um novo bairro:** `POST /bairros`
    * **Corpo (JSON):**
        ```json
        {
          "nomeBairro": "Bairro Vitoria Brasil"
        }
        ```
* **Alterar um bairro:** `PUT /bairros/{id}`
    * **Corpo (JSON):**
        ```json
        {
          "nomeBairro": "Bairro Rio de Janeiro"
        }
        ```
* **Deletar um bairro:** `DELETE /bairros/{id}`

---

### Cep
* **Listar todos os ceps:** `GET /ceps`
* **Buscar cep por ID:** `GET /ceps/{id}`
* **Cadastrar um novo cep:** `POST /ceps`
    * **Corpo (JSON):**
        ```json
        {
          "numeroCep": "15600-000"
        }
        ```
* **Alterar uma cep:** `PUT /ceps/{id}`
    * **Corpo (JSON):**
        ```json
        {
          "numeroCep": "15600-111"
        }
        ```
* **Deletar um cep:** `DELETE /ceps/{id}`
