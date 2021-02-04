# spring-docker-demo-handson
Simple application that involves Spring Boot and Mysql all dockerized.

OBS. be sure that you're outside the VPN or at least the VPN is properly configured.

First of all, we will need Docker Desktop and Git installed. If you're not sure if Docker are installed, type in terminal or CMD: <br>```docker -- version```. <br>If you're seeing nothing, please get docker here: https://docs.docker.com/get-docker/. Get Git here: https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

Then with Docker installed and running, clone repository to you local machine<br>
$ git clone https://github.com/crispendenza/spring-docker-demo-handson.git

Then, with docker running, start's application with compose:<br>
$ docker-compose up --build
<br><br>

The container will serve locally in 8089 port (localhost:8089) with REST SpringBoot API with the following methods:
<br>
[POST]: /create
[GET]: /view/{id}
[GET]: /viewAll
<br>
Message type is JSON. Consider to user POSTMAN. 
Example to create a resource:
<br>
POST http://localhost:8089/create
JSON (set Body)
```
{
    "fromAccount": "1148",
    "toAccount": "0042", 
    "amount": 314.32
}
```
and 
<br>
GET http://localhost:8089/view/1
to see the JSON with information of register id #1
<br>
Tks
<br>
:wq
