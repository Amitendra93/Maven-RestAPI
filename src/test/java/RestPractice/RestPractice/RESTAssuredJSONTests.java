package RestPractice.RestPractice;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

import org.hamcrest.Matchers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import io.restassured.response.Response;

public class RESTAssuredJSONTests {

final static String ROOT_URI = "https://api.github.com/users/zellwk";

@Test
public void simple_get_test() {
	Response response = get(ROOT_URI + "/repos");
	System.out.println(response.asString());

	response.then().body("id", hasItems(160906483));
	response.then().body("name", hasItems("11ty.io"));
	response.then().body("svn_url", hasItems("https://github.com/zellwk/fellowship-of-the-dom"));
}
}