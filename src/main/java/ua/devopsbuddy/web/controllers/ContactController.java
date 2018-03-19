package ua.devopsbuddy.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.devopsbuddy.backend.service.EmailService;
import ua.devopsbuddy.web.domain.frontend.FeedbackPojo;

/**
 * @author Rostyslav Kasprovych
 */
@Controller
public class ContactController {

    /** The application logger*/
    private static final Logger LOG = LoggerFactory.getLogger(ContactController.class);

    /** The key which identifies the feedback payload in the Model.*/
    private final static String FEEDBACK_MODEL_KEY = "feedback";

    /** The Contact US view name*/
    private final static String CONTACT_US_VIEW_NAME = "contact/contact";

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactGet(ModelMap model) {
        FeedbackPojo feedbackPojo = new FeedbackPojo();
        model.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedbackPojo);
        return CONTACT_US_VIEW_NAME;
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String contactPost(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedbackPojo feedbackPojo){
        LOG.debug("Feedback POJO content: {}", feedbackPojo);
        emailService.sendFeedbackEmail(feedbackPojo);
        return CONTACT_US_VIEW_NAME;
    }
}
