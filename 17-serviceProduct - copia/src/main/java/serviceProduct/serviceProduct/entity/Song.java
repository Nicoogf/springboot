package serviceProduct.serviceProduct.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tbl_song")

public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private String artist ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genre_id")
    private Genre genre ;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt ;
}
