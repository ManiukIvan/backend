package backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="user_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 5,unique = true)
    private String role;

    public UserRole() {
        super();
        // TODO Auto-generated constructor stub
    }

    public UserRole(int id, String role) {
        super();
        this.id = id;
        this.role = role;
    }


    @Override
    public String toString() {
        return String.format(
                "UserRole[id=%d, role='%s']",
                id, role);
    }
}
