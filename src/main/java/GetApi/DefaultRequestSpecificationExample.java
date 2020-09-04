package GetApi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DefaultRequestSpecificationExample {

    @BeforeClass
    public void setUpDefaultRequestSpecificationExample(){

        RequestSpecification requestSpecification1 = RestAssured.given();
        requestSpecification1.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification1.basePath("/booking");

        RestAssured.requestSpecification = requestSpecification1;
    }

    // use useDefaultRequestSpecification
    @Test
    public void useDefaultRequestSpecification(){
        Response res  = RestAssured.when().get();
        System.out.println(res.asString());
    }

     @Test
    public void overrideDefaultSpecification(){

        // creating new request specification

        RequestSpecification requestSpecification2 = RestAssured.given();

         requestSpecification2.baseUri("https://restful-booker.herokuapp.com");
         // Setting Base Path
         requestSpecification2.basePath("/ping");

        // specifying new request specification
         Response res  = RestAssured.given().spec(requestSpecification2).get();
         System.out.println("override test method -->> "+res.asString());
         System.out.println("Response time in milliseconds = "+res.getTime());
         System.out.println("Response time in seconds = "+res.getTimeIn(TimeUnit.SECONDS));

     }


}
