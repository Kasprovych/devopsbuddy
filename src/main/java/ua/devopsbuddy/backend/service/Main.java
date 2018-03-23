package ua.devopsbuddy.backend.service;

import ua.devopsbuddy.backend.persistence.domain.backend.Plan;
import ua.devopsbuddy.backend.persistence.domain.backend.User;

/**
 * @author Rostyslav Kasprovych
 */
public class Main {

    public static void main(String[] args) {

        User u1 = new User();
        User u2 = new User();
        u1.setId(1);
        u2.setId(10);
        Plan plan = new Plan();
        Plan plan1 = new Plan();
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(plan.hashCode());
        System.out.println(plan1.hashCode());

    }
}
