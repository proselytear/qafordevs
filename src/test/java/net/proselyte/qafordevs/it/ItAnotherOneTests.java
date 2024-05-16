package net.proselyte.qafordevs.it;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

@ActiveProfiles("test")
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItAnotherOneTests extends AbstractRestControllerBaseTest {
    private static final Logger log = LoggerFactory.getLogger("abobus");
    @Test
    public void bimbimbambam() {
        log.info("Doing bimbimbambam test");
    }

}
