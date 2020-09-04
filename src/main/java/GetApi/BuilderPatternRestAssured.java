package GetApi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BuilderPatternRestAssured {

    public static void main(String[] args) {

        // way 1
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification = requestSpecification.accept(ContentType.JSON);
        requestSpecification = requestSpecification.auth().preemptive().basic("username","password");
        requestSpecification = requestSpecification.header("header","headerValue");
        requestSpecification = requestSpecification.param("param","paramValue");
        requestSpecification = requestSpecification.cookie("cookie","cookieValue");

        // way 2

        RequestSpecification requestSpecification1 = RestAssured
                .given()
                .accept(ContentType.JSON)
                .auth().preemptive().basic("username","password")
                .header("header","headerValue")
                .param("param","paramValue")
                .cookie("cookie","cookieValue");

    }


}
