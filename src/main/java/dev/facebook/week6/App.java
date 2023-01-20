package dev.facebook.week6;

import dev.facebook.week6.dao.UserDao;
import dev.facebook.week6.dao.impl.UserDaoImpl;
import dev.facebook.week6.dto.UserDto;
import dev.facebook.week6.enums.Gender;
import dev.facebook.week6.models.User;
import dev.facebook.week6.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class App {
    private static UserDao userDao = new UserDaoImpl();

    public static void main(String[] args) {

//        User user1 = userDao.signUp(new UserDto(2,"Amirat","Moshood","amirat@mail.com","1234",Gender.female,"24-11-2013",LocalDate.now()));

        //System.out.println(user1);
       //userDao.getAllUsers().forEach(System.out::println);

        //System.out.println("Connection Valid: " + DatabaseConnection.INSTANCE.isConnectionValid());

//        final String userInsertSql = "insert into user (first_name, last_name, email, password, dob, gender, date_created) " + "values (?,?,?,?,?,?,?)";
//
////        User user = new User();
////
////        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy.HH:mm:ss");
////        String timeStamp = df.format(new Date());
//
//        try (Connection connection = DatabaseConnection.INSTANCE.getDataSource().getConnection()) {
//
//            PreparedStatement statement = connection.prepareStatement(userInsertSql);
//
//            statement.setString(1, "Aishat");
//            statement.setString(2, "Moshood");
//            statement.setString(3, "a@mail.com");
//            statement.setString(4, "1234");
//            statement.setString(5, "06-12-1996");
//            statement.setObject(6, Gender.FEMALE);
//            //statement.setTimestamp(7, java.sql.Timestamp);
//
//            int result = statement.executeUpdate();
//
//            System.out.println("Result: " + result);
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}
