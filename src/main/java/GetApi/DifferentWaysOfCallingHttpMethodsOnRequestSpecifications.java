package GetApi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DifferentWaysOfCallingHttpMethodsOnRequestSpecifications {

    public static void main(String[] args) {

        // Creating request specification using given()
        RequestSpecification request1= RestAssured.given();
        // Setting Base URI
        request1.baseUri("https://restful-booker.herokuapp.com");
        // Setting Base Path
        request1.basePath("/booking");


        // We can directly call http verbs on RequestSpecification
        Response res1= request1.get();
        System.out.println("Directly call http verbs on RequestSpecification");
        System.out.println(res1.asString());

        // We can also pass RequestSpecification reference variable in overloaded given() method
        Response res2 = RestAssured.given(request1).get();
        System.out.println("Passing RequestSpecification reference variable in overloaded given() method");
        System.out.println(res2.asString());

        // We can also pass RequestSpecification using spec() method
        Response res3 = RestAssured.given().spec(request1).get();
        System.out.println("Pass RequestSpecification using spec() method");
        System.out.println(res3.asString());


    }


}
