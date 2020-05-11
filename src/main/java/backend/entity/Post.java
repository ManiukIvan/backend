package backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    @Column
    private String description;

    @Column
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(
            name = "post_hashtags",
            joinColumns= {@JoinColumn (name = "post_id")},
            inverseJoinColumns= {@JoinColumn (name = "hashtag_id")})
    Set<HashTag> hashtags = new HashSet<>();
    public Post(){

    }

    public Post(String description,Date date) {
        this.description = description;
        this.date = date;
    }

}
