package pe.edu.i202223044.cl1_jpa_data_luna_diego.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "countrylanguage")
@Data
public class CountryLanguage {
    @EmbeddedId
    private CountryLanguageId id;
    @Column(name = "isOfficial")
    private String isOfficial;
    @Column(name = "percentage")
    private Double percentage;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @MapsId("countryCode")
    @JoinColumn(name = "CountryCode",insertable = false,updatable = false)
    private Country country;
}

