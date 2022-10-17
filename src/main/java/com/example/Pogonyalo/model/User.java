package com.example.Pogonyalo.model;

import javax.persistence.*;

@Entity
@Table(name="my_users")
public class User {

    @Id
    @GeneratedValue
    Long id;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))    @Enumerated(EnumType.STRING)
    private Set<Role> roles = new HashSet<>();
}
