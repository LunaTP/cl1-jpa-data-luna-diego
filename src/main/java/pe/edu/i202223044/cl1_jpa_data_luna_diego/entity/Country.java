package pe.edu.i202223044.cl1_jpa_data_luna_diego.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "Code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "continent")
    private String continent;
    @Column(name = "region")
    private String region;
    @Column(name = "surfaceArea")
    private Double surfaceArea;
    @Column(name = "indepYear")
    private Integer indepYear;
    @Column(name = "Population")
    private Integer population;
    @Column(name = "lifeExpectancy")
    private Integer lifeExpectancy;
    @Column(name = "gnp")
    private Double gnp;
    @Column(name = "gnp_old")
    private Double gnpOld;
    @Column(name = "localName")
    private String localName;
    @Column(name = "governmentForm")
    private String governmentForm;
    @Column(name = "headOfState")
    private String headOfState;
    @Column(name = "Capital")
    private Integer capital;
    @Column(name = "code2")
    private String code2;
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<City> cities;
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CountryLanguage> languages;
}
