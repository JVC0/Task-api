package com.docencia.tasks.domain.model;

import java.util.Set;

public class Role {
    private Long id;
    private String name;
    private User users;

    public Role() {

    }

    public Role(Long id, String name, User users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

}
