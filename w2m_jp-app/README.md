# Prueba Técnica Spring Boot para W2M"
API Maven, Spring Boot, y Java, que permite hacer un mantenimiento
CRUD de naves espaciales de series y películas.

- Para el Build and run de la aplicacion, debes ubicarte sobre la carpeta y ejecutar el comando run de mvn
```bash
mvn spring-boot:run
```
- Acceder a H2 Console :  escribe estos detalles en  ```application-properties```
```bash
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:dcbapp
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=<your-password>
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## API Endpoints
- **GET - /ships/test**

  Checkear si el puerto funciona! :)

- **GET - /ships**

  Obtener todas las naves !

- **POST - /ships**

  Agregar una vane con el shipname y movie donde aparece.

- **GET - /ships/id**
  
  Obtener una nave con el unique ID.

- **PUT -/ships/id**

  Modificar la informacion con el unique ID.

- **DELETE -/ships/id**

   Elimiar la nave con el unique ID.


