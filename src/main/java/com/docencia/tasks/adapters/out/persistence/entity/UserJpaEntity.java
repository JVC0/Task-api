package com.docencia.tasks.adapters.out.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private RoleJpaEntity role;

    public UserJpaEntity() {
    }

    public UserJpaEntity(Long id, String name, String password, RoleJpaEntity role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleJpaEntity getRole() {
        return this.role;
    }

    public void setRole(RoleJpaEntity role) {
        this.role = role;
    }

}
