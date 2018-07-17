import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

public class AppTest {
    @Test
    public void makeSureGoodleIsUp() {
        given().when().get("https://www.google.com").then().statusCode(200);
    }
}