package itss.vn.demo.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reviews")
public class Review extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    @Column( name = "user_id")
    private Long userId;

    @Column( name = "title")
    private String title;

    @Column( name = "rating")
    private Integer rate;


    @Column(length = 2000,  name = "content")
    private String content;

    @CreatedBy
    @Column(name = "create_by")
    private String createdBy;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private Instant createdDate = Instant.now();

    public Review(Long userId, Integer rate, String title, String content, String createBy, Instant createdAt) {
        this.userId = userId;
        this.rate = rate;
        this.title = title;
        this.content = content;
        this.createdBy = createBy;
        this.createdDate = createdAt;
    }
}
