package dev.facebook.week6.dao;

import dev.facebook.week6.models.User;
import dev.facebook.week6.dto.UserDto;
import dev.facebook.week6.models.User;
import lombok.NonNull;

import java.util.List;

public interface UserDao {

    User signUp(UserDto userDto);

    boolean isUserExist(String email, String password);

//    List<User> getAllUsers();
}
