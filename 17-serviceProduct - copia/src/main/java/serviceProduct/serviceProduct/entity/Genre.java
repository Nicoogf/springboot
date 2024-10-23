package serviceProduct.serviceProduct.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_genre")
@Data
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name ;
}
