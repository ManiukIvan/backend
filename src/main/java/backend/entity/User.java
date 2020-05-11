package backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    @Column(length = 45,unique = true)
    private String login;

    @Column(length = 45)
    private String password;

    @Column(name="user_name",length = 45,unique = true)
    private String userName;

    @Column(name="full_name",length = 45)
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private UserRole userRole;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private UserStatus userStatus;

    public User(){

    }

    public User(String login, String password, String userName, String fullName) {
        this.login = login;
        this.password = password;
        this.userName = userName;
        this.fullName = fullName;
    }

}

