package edu.badpals.gildedroseAPI.domain.database;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name="T_ORDERS")
public class Order extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_ORDER")
    private BigInteger idOrder;

    @OneToOne
    @JoinColumn(name="USER_NAME")
    private User user;

    @OneToOne
    @JoinColumn(name="ITEM")
    private Item item;
}
