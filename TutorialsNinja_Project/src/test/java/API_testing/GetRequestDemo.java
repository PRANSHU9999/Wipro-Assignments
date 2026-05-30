package API_testing;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class GetRequestDemo {

    public static void main(String[] args) {

        // Base URI
        RestAssured.baseURI =
                "https://jsonplaceholder.typicode.com";



        // ================= GET REQUEST =================

        System.out.println("===== GET REQUEST =====");

        Response getResponse =

                given()

                .when()

                    .get("/posts/1");

        System.out.println("Status Code : "
                + getResponse.getStatusCode());

        System.out.println("Response Body : ");

        System.out.println(
                getResponse.getBody().asString());



        // ================= VALIDATION =================

        System.out.println("===== VALIDATION =====");

        given()

        .when()

            .get("/posts/1")

        .then()

            .statusCode(200)

            .body("id", equalTo(1))

            .body("userId", equalTo(1))

            .body("title",
                    notNullValue())

            .log().all();



        // ================= JSON EXTRACTION =================

        System.out.println("===== JSON EXTRACTION =====");

        JsonPath jsonPath =
                getResponse.jsonPath();

        int id =
                jsonPath.getInt("id");

        int userId =
                jsonPath.getInt("userId");

        String title =
                jsonPath.getString("title");

        System.out.println("ID : " + id);

        System.out.println("User ID : "
                + userId);

        System.out.println("Title : "
                + title);



        // ================= POST REQUEST =================

        System.out.println("===== POST REQUEST =====");

        String requestBody =
                "{ \"title\":\"My API\", "
              + "\"body\":\"Learning REST Assured\", "
              + "\"userId\":1 }";

        Response postResponse =

                given()

                    .contentType(ContentType.JSON)

                    .body(requestBody)

                .when()

                    .post("/posts");

        postResponse.then()

                .statusCode(201)

                .log().all();



        // ================= PUT REQUEST =================

        System.out.println("===== PUT REQUEST =====");

        String putBody =
                "{ \"id\":1, "
              + "\"title\":\"Updated API\", "
              + "\"body\":\"Updated Body\", "
              + "\"userId\":1 }";

        given()

            .contentType(ContentType.JSON)

            .body(putBody)

        .when()

            .put("/posts/1")

        .then()

            .statusCode(200)

            .log().all();



        // ================= DELETE REQUEST =================

        System.out.println("===== DELETE REQUEST =====");

        given()

        .when()

            .delete("/posts/1")

        .then()

            .statusCode(200)

            .log().all();



        // ================= PATH PARAM =================

        System.out.println("===== PATH PARAM =====");

        given()

            .pathParam("id", 1)

        .when()

            .get("/posts/{id}")

        .then()

            .statusCode(200)

            .log().all();



        // ================= QUERY PARAM =================

        System.out.println("===== QUERY PARAM =====");

        given()

            .queryParam("userId", 1)

        .when()

            .get("/posts")

        .then()

            .statusCode(200)

            .log().all();



        // ================= HEADERS =================

        System.out.println("===== HEADERS =====");

        given()

            .header("Content-Type",
                    "application/json")

        .when()

            .get("/posts/1")

        .then()

            .statusCode(200)

            .log().headers();



        // ================= JSON SCHEMA VALIDATION =================

        System.out.println("===== JSON SCHEMA VALIDATION =====");

        given()

        .when()

            .get("/posts/1")

        .then()

            .assertThat()

            .body(matchesJsonSchemaInClasspath(
                    "schema.json"))

            .log().all();



        System.out.println(
                "===== TEST COMPLETED =====");

    }
}