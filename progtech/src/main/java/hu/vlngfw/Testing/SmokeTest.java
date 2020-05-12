package hu.vlngfw.Testing;
import static org.assertj.core.api.Assertions.assertThat;

import hu.vlngfw.BookController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
public class SmokeTest {

    @Autowired
    private BookController controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}
