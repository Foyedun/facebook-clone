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
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String DateOfBirth;
    private String Age;
    private String Password;
    private String Email;

}
