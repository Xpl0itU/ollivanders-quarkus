package edu.badpals.gildedroseAPI.domain.database;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_ITEMS")
public class Item extends PanacheEntityBase {
    @Id
    @Column(name="ITEM_NAME")
    private String itemName;

    @Column(name="PROPERTIES")
    private int properties;

    @Column(name="TYPE")
    private String type;
}
