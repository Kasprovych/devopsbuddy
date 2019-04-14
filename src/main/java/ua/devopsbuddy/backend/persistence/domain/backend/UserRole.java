package ua.devopsbuddy.backend.persistence.domain.backend;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Rostyslav Kasprovych
 */
@Entity
@Table(name = "user_role")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;

    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }
}
