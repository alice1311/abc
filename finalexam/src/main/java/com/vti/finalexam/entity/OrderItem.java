<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3c57e060a8122b106e19109aa8e96b43aeb264ae
package com.vti.finalexam.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Order")
public class OrderItem implements Serializable {
    @Column(name = "orderItemId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "sellPrice", nullable = false)
    private float sell_price;

    @Column(name = "subtotal", nullable = false)
    private float subtotal;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name="orderId", nullable = true)
    private Order order;

    @ManyToOne
    @JoinColumn(name="product_detailId", nullable = true)
    private ProductDetail product_detail_order;

    public OrderItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSell_price() {
        return sell_price;
    }

    public void setSell_price(float sell_price) {
        this.sell_price = sell_price;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ProductDetail getProduct_detail_order() {
        return product_detail_order;
    }

    public void setProduct_detail_order(ProductDetail product_detail_order) {
        this.product_detail_order = product_detail_order;
    }
<<<<<<< HEAD
=======
=======
package com.vti.finalexam.entity;public class OrderItem {
>>>>>>> origin/master
>>>>>>> 3c57e060a8122b106e19109aa8e96b43aeb264ae
}
