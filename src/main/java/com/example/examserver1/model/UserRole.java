package com.example.examserver1.model;

import jakarta.persistence.*;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UserRole;
//user
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    @ManyToOne
    private Role role;

    public UserRole(Long userRole) {
        UserRole = userRole;
    }

    public Long getUserRole() {
        return UserRole;
    }

    public void setUserRole(Long userRole) {
        UserRole = userRole;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
