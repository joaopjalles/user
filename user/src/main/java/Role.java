import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Role implements Serializable {

        @Id
        private String id;
        private String socialId;
        private String role;
        private String description;
        private String enabled;
}