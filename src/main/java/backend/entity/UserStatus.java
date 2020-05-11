package backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="user_status")
public class UserStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 10,unique = true)
    private String status;

    public UserStatus() {
    }

    public UserStatus(int id, String status) {
        this.id = id;
        this.status = status;
    }



    @Override
    public String toString() {
        return String.format(
                "UserStatus[id=%d, status='%s']",
                id, status);
    }
}
