package ua.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import ua.devopsbuddy.backend.service.EmailService;
import ua.devopsbuddy.backend.service.MockEmailService;

/**
 * @author Rostyslav Kasprovych
 */
@Configuration
@Profile("dev")
@PropertySource("application-dev.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService(){
        return new MockEmailService();
    }
}
