# Exemplo Serviço utilizando Oauth2
 Serviço configurado com Spring Security utilizando Oauth2


## Requisições para teste 
* Requisição POST: http://localhost:8080/oauth/token
```
Basic Auth
- username: application_client_id
- password: application_client_secret

Body
- grant_type: password
- username: user_name
- password: user_pass
```

* Requisição GET: http://localhost:8080/persons
```
Bearer Token 
- Token: (access_token) retornada pela chamada anterior
```