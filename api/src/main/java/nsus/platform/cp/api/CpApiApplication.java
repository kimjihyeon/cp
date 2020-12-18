package nsus.platform.cp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(
        scanBasePackages = {"nsus.platform.cp.core", "nsus.platform.cp.api"},
        exclude = {SecurityAutoConfiguration.class}
)
@EntityScan("nsus.platform.cp.core")
public class CpApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CpApiApplication.class, args);
    }

}
