package uz.pdp.tgbotwebsocket.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.tgbotwebsocket.bot.NameGetter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Product implements NameGetter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    @ManyToOne
    private Category category;

    @Override
    public String getTitle() {
        return this.name;
    }
}
