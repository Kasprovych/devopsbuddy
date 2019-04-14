package ua.devopsbuddy.backend.persistence.domain.backend;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Rostyslav Kasprovych
 */
@Entity
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int id;
    private String name;


}
