# Distance Calculation API for Deutsche Bahn

This project was developed as case study provided by Deutsche Bahn.

To start the service, clone the repo, open IntelliJ (or any IDE) and let Maven download all the dependencies.
After that you can start the Spring Boot application. Go to `http://localhost:8080` to view the content in the browser.

The API provides two endpoints:

| Endpoint                     | Type  | Description                                                               |
|------------------------------|-------|---------------------------------------------------------------------------|
| `/api/v1/station`            | `GET` | provides a full list of stations                                          |
| `/api/v1/distance/:from/:to` | `GET` | calculates the distance between `from` and `to` and returns a JSON object |

`from` and `to` are strings and accepts DS100 codes from DB for this purpose. The calculation of the distance
is based on the Haversine formula.

### Example

We use the `distance` endpoint to calculate the distance between Frankfurt and Berlin. The DS100 codes for both stations are as follows:

```
GET /api/v1/distance/FF/BLS
```

The endpoint accepts DS100 codes in all type of cases (lower, upper, etc). The endpoint would return a JSON object like so:

```json
{
"from": "Frankfurt(Main)Hbf",
"to": "Berlin Hbf",
"distance": 423,
"unit": "km"
}
```

In case of any questions feel free to get in touch.