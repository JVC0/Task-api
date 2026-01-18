package com.docencia.tasks.adapters.out.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class RoleJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToOne(mappedBy = "role")
    private UserJpaEntity users;

    public RoleJpaEntity() {
    }

    public RoleJpaEntity(Long id, String name, UserJpaEntity users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserJpaEntity getUsers() {
        return this.users;
    }

    public void setUsers(UserJpaEntity users) {
        this.users = users;
    }
}
