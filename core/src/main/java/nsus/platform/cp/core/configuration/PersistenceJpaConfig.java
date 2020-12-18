package nsus.platform.cp.core.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("nsus.platform.cp.core")
public class PersistenceJpaConfig {
}
