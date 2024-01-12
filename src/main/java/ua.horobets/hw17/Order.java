package ua.horobets.hw17;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(schema = "public",name = "order")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "users")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "orders",length = 15)
    private int orders;
    @Column(name = "name",length = 15)
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users")
    private User user;

}
