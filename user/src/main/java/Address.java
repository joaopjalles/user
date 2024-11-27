import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Table(name = "endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Address {

    @Id
    private String Id;
    private String socialId;
    private String street;
    private String state;
    private String country;
    private String city;
    private String zipecode;
    private String number;
}
