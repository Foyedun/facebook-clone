package dev.facebook.week6.models;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Post {
    private int id;
    private int userId;
    private int postId;
    private String post_title;
    private String post_body;
    private LocalDate createdAt;
}
