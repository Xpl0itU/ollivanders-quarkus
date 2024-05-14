package edu.badpals.gildedroseAPI.domain.database;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="t_users")
public class User extends PanacheEntity {
}
