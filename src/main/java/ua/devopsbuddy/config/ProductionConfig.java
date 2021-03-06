package ua.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import ua.devopsbuddy.backend.service.EmailService;
import ua.devopsbuddy.backend.service.SmtpEmailService;

/**
 * @author Rostyslav Kasprovych
 */
@Configuration
@Profile("prod")
@PropertySource("application-prod.properties")
public class ProductionConfig {

    @Bean
    public EmailService emailService(){
        return new SmtpEmailService();
    }
}
