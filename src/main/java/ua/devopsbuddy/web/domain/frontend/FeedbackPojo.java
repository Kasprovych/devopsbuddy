package ua.devopsbuddy.web.domain.frontend;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Rostyslav Kasprovych
 */
@Getter
@Setter
public class FeedbackPojo {
    private static final long serialVersionUID = 1L;

    private String email;
    private String firstName;
    private String lastName;
    private String feedback;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FeedbackPojo{");
        sb.append("email='").append(email).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", feedback='").append(feedback).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
