package pe.edu.i201515503.cl1_jpa_data_sucapuca_jhon.entidades;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguagePk {
    private String Language;
    private String CountryCode;
}
