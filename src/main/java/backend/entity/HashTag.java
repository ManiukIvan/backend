package backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class HashTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    @Column(unique = true)
    private String text;

    @ManyToMany(mappedBy = "hashtags")
    private Set<Post> accounts = new HashSet<>();

    public HashTag(){

    }

    public HashTag(String text) {
        this.text = text;
    }
}
