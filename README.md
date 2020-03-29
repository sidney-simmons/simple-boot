# simple-boot

simple-boot is a gradle project meant to illustrate a basic Spring Boot setup.  Some of what's illustrated:
* Gradle build process
* Thymeleaf template endpoints
* JSON based API endpoints
* Actuator endpoints (/health and /shutdown)
* Logback logging
* Unit tests
* Basic README file

## Usage

Clone the repository and execute the following.  Runs on port 8000.

```
./gradlew bootRun
```

Hit some of the application endpoints by importing the Postman collection in the `postman-collection.json` file.

## License
[MIT](https://choosealicense.com/licenses/mit/)