# Distacne Calcuation API for Deutsche Bahn

This project was developed as case study provided by Deutsche Bahn.

To start the service, clone the repo, open IntelliJ (or any IDE) and let Maven download all the dependencies.
After that you can start the Spring Boot application. Go to `http://localhost:8080` to view the content in the browser.

The API provides two endpoints:

| Endpoint                       | Type  | Description                                                               |
|--------------------------------|-------|---------------------------------------------------------------------------|
| `/api/v1/station`              | `GET` | provides a full list of stations                                          |
| `/api/v1/distance/{from}/{to}` | `GET` | calculates the distance between `from` and `to` and returns a JSON object |

`from` and `to` are strings and accepts DS100 codes from DB for this purpose. The calculation of the distance
is based on the Haversine formula.

In case of any questions feel free to get in touch.