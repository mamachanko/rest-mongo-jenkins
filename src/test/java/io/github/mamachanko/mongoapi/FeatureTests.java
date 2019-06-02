package io.github.mamachanko.mongoapi;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

//@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FeatureTests {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void canDoStuff() {
        ResponseEntity<String> getResponse = testRestTemplate.getForEntity("/api", String.class);

        assertThat(getResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
