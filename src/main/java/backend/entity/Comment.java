package backend.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    @Column
    private String text;

    @Column
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;


    public Comment(){

    }

    public Comment(String text,Date date) {
        this.text = text;
        this.date = date;
    }
}
