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

public class Role {

        @Id
        private String Id;
        private String socialId;
        private String role;
        private String description;
        private String enabled;
}