# Racing-GET
A simple GET service which brings information about racing sport events and some triple crown races and stuff;

### Requires JAVA 11 to work;

### Application.Properties
##### Database conection works through applications.properties which is not included on this repository.
##### Should be allocated on /src/main/resources
```
spring.jpa.hibernate.ddl-auto = none
spring.datasource.url = jdbc:mysql://${databaseurl}:3306/${racing}
spring.datasource.username = ${username}
spring.datasource.password = ${password}
logging.level.root=WARN
```

### Build and Run Docker
```
docker build -t racing .

docker run -p 8080:8080 -d racing 
or 
docker run -p 8080:8080 -t racing
```

### EndPoints Examples

#### Get Indy500 by winner driver
```
http://localhost:8080/Racing/Indy500?year=&chasis=&engine=&driver=H%C3%A9lio%20Castroneves
```

#### Get 24 Hours of LeMans by Year
```
http://localhost:8080/Racing/LeMans?year=2005
```

#### Get MonacoGP winner by Year
```
http://localhost:8080/Racing/Monaco?year=2005
```

#### GET F1 Constructor Champion by Chasis/Engine combination
```
http://localhost:8080/Racing/WCC?year=&chasis=Mclaren&engine=Honda&wins=6
```

#### Get F1 Driver Champion by Driver Name
```
http://localhost:8080/Racing/WDC?year=&country=&chasis=&engine=&driver=Jim%20Clark
```

#### Get Various Full Database Tables 
```
http://localhost:8080/Racing/All?arr=5,3,1
```