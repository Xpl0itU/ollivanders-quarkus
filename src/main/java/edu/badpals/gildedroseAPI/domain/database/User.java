package edu.badpals.gildedroseAPI.domain.database;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_USERS")
public class User extends PanacheEntityBase {
    @Id
    @Column(name="USER_NAME")
    private String username;

    @Column(name="PROPERTIES")
    private int properties;
}
