import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class User implements Serializable {

    @Id
    private String name;
    private String socialId;
    private String email;
    private String phone;
    private String password;

    @ManyToMany
    private List<Role> roles = new ArrayList<>();
}
