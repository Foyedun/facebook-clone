package dev.facebook.week6.dto;

import dev.facebook.week6.enums.Gender;
import lombok.*;

import java.time.LocalDate;

@Data
public class UserDto {
    private int id;
    private final String firstName;
    private final String lastName;
    private final String DateOfBirth;
    private final String Age;
    private final String Password;
    private final String Email;
}
