package Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "products", schema = "public", catalog = "shop")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "count", nullable = false)
    private Integer count;

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }


}
