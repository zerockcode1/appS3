package org.zerock.apps3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

@SpringBootTest
class AppS3ApplicationTests {

    @Test
    void contextLoads() {

        Resource resource = new ClassPathResource("");

        try {
            System.out.println(resource.getURI().getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
