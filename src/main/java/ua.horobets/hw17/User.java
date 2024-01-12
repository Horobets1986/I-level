package ua.horobets.hw17;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(schema = "public", name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name", length = 15)
    private String firstName;
    @Column(name = "last_name", length = 15)
    private String lastName;
    @Column(name = "mail", length = 100, unique = true)
    private String mail;
    @Column(name = "data")
    private LocalDateTime localDateTimeata;
    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();
    public void addOrder(Order order) {
        order.setUser(this);
        orders.add(order);
    }
}

