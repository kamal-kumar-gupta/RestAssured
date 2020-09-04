package GetApi;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class DefaultHostAndPortExample {

    public static void main(String[] args) {

        RestAssured
                .given()
                .log()
                .all()
                .when()
                .get();

        // Using BDD
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("/ping").port(8181).when().get();

        // Using Non-BDD
        RequestSpecification requestSpecification = RestAssured.given();
        // Setting Base URI
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        // Setting Base Path
        requestSpecification.basePath("/ping");
        requestSpecification.port(8181);
        /**************** Using RequestSpecBuilder*****************************/

        RequestSpecification requestSpecification1 = new RequestSpecBuilder()
                .setBaseUri("https://restful-booker.herokuapp.com")
                .setBasePath("/ping")
                .setPort(8181)
                .build();


        RestAssured.port= 9191;




    }

}
