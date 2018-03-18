package ua.devopsbuddy.backend.service;

import org.springframework.mail.SimpleMailMessage;
import ua.devopsbuddy.web.domain.frontend.FeedbackPojo;

/**
 * @author Rostyslav Kasprovych
 */
public interface EmailService {

    /**
     * Sends an email with the content in the Feedback Pojo.
     * @param feedbackPojo The feedback Pojo
     */
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    /**
     * Sends an email with the content of the Simple Mail Message object.
     * @param message The object containing the email content
     */
    public void sendGenericEmailMessage(SimpleMailMessage message);
}
