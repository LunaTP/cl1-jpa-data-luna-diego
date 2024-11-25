package pe.edu.i202223044.cl1_jpa_data_luna_diego.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "city")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country country;

    @Column(name = "district")
    private String district;

    @Column(name = "Population")
    private Integer population;
}