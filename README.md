A sample based on the Oracle Explorer java course, forked for using Spring Boot, Rest, Docker.

Create Docker image

```bash
 docker build --tag app17:latest .
```

Run Docker Conteiner

```bash
docker run --name appConteiner17 -p 8080:8080 app17:latest
```

$
	port -p <local> : <container>
$

Endpoints:
 *	Roots	http://localhost:8080/