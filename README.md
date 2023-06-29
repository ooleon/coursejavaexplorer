A sample based on the Oracle Explorer java course, forked for using Spring Boot, Rest.

Create Docker image
docker build --tag app17:latest .

Run Docker Conteiner
docker run --name appConteiner17 -p 8080:8080 app17:latest
	port -p <local> : <container>
Endpoint	http://localhost:8080/