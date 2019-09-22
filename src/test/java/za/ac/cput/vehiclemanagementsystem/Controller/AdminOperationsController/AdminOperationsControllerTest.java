package za.ac.cput.vehiclemanagementsystem.Controller.AdminOperationsController;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class AdminOperationsControllerTest {

    private static final String BASE_URL = "http://localhost:8080/vehiclemanagement/lookup/adminOperation";

    @Autowired
    private TestRestTemplate restTemplate;



    @Test
    public void create() {
        ResponseEntity result = restTemplate.withBasicAuth("admin", "1234")
                .postForEntity(BASE_URL + "/create/female", null, String.class);
        System.out.println(result.getBody());

        Assert.assertEquals(HttpStatus.OK, result.getStatusCode());
    }

    @Test
    public void getAll()
    {
        ResponseEntity <String> result = restTemplate.withBasicAuth("user", "password")
                .getForEntity(BASE_URL + "/getall", String.class);
        System.out.println(result.getBody());
        Assert.assertEquals(HttpStatus.OK, result.getStatusCode());
    }


}