package pe.edu.i202223044.cl1_jpa_data_luna_diego.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CountryLanguageId implements Serializable {
    private String countryCode;
    private String language;
}
