package GetApi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class First {

    // BaseURI_BasePath_GlobalSetupAsString
    final String Base_URI = "https://restful-booker.herokuapp.com";
    final String Base_Path = "/booking";


    @BeforeClass
    public void setup() {
        // Setting BaseURI and BasePath
        RestAssured.baseURI = Base_URI;
        RestAssured.basePath = Base_Path;

    }

    @Test
        public void Request1() {
            RequestSpecification request = RestAssured.given();
            Response response = request.get();
            System.out.println(response.asString());
        }

        @Test
        public void Request2() {
            RequestSpecification request = RestAssured.given();
            Response response = request.get();
            System.out.println(response.asString());
        }




    }


