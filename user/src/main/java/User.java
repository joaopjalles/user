import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class User {

    @Id
    private String name;
    private String socialId;
    private String email;
    private String phone;
    private String password;
    private List<Role> roles;
}
