package dev.facebook.week6.models;

import dev.facebook.week6.enums.Gender;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Comment {
    private int id;
    private int userId;
    private int postId;
    private String comment;
    private LocalDate created_at;
}
