import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class TestClass1 {

    @BeforeClass
    public static void createRequestSpecification() {
        RestAssured.baseURI = "http://localhost:3002/people";
    }

    @Test                                                      // Given | When | Then - legible syntax
    public void getAllData() {
        given()
                // .header("Authorisation", "your_auth_token") // This is how authentication and other headers could be added to the requestSpec
                .when()
                .get()
                .then()
                .log().body();
    }


    @Test
    public void getOneItemByIndex() {
        given()
                .when()
                .get("/14")
                .then()
                .log().body()
                // confirm the data is as expected
                .body("fullName", equalTo("Ben Johnson"))
                .body("email", equalTo("hannah.anderson@example.com"))
                .body("job", equalTo("UX/UI Designer"))
                .body("dob", equalTo("09/23/1989"));
    }


    @Test
    public void postData() {
        JSONObject postData = new JSONObject();
        String name = "John Smith";
        postData.put("fullName", name);
        postData.put("email", "js@hotmail.com");
        postData.put("job", "Teacher");
        postData.put("dob", "01/01/1967");

        given()
                .contentType(ContentType.JSON) // confirm that we are passing JSON as our body format
                .body(postData.toString())
                .when()
                .post()
                .then()
                .log().body()
                // confirm the full name returned in the reponse matches the name we've used written
                .body("fullName", equalTo(name));
    }

    @Test
    public void patchDataByIndex() {
        JSONObject patchData = new JSONObject();
        String name = "Ben Johnson";
        patchData.put("fullName", name);

        given()
                .contentType(ContentType.JSON)
                .body(patchData.toString())
                .when()
                .patch("/22")
                .then()
                .log().body()
                .body("fullName", equalTo(name))
                .body("job", equalTo("Test Engineer"));
    }

//    @Test
//    public void deleteOne() {
//        given()
//                .when()
//                .delete("/31")
//                .then()
//                // confirm success via status code  
//                .statusCode(200); 

//    }



}
