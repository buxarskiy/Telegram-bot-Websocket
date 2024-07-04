package uz.pdp.tgbotwebsocket.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.tgbotwebsocket.entity.enums.OrderStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = counter++;
    private static Integer counter = 1010;
    private OrderStatus orderStatus = OrderStatus.NEW;
    private LocalDateTime localDateTime = LocalDateTime.now();


}
