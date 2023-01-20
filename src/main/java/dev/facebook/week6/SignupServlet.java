package dev.facebook.week6;

import dev.facebook.week6.dao.UserDao;
import dev.facebook.week6.dao.impl.UserDaoImpl;
import dev.facebook.week6.dto.UserDto;
import dev.facebook.week6.enums.Gender;
import dev.facebook.week6.models.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "SignupServlet", value = "/signup")
public class SignupServlet extends HttpServlet {
    private static UserDao userDao = new UserDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/Signup.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get all the request params
        String firstName = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String dob = request.getParameter("dob");
//        String age = request.getParameter("Age");
        String age = "age";
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        //build a userdto from params
        UserDto userDto = new UserDto(firstName, lastname, dob,  age, password, email);

        if(firstName.isEmpty() || lastname.isEmpty() || email.isEmpty() || password.isEmpty() || age.isEmpty()){

            try {
                request.setAttribute("error", "You're missing one of the required inputs");
                doGet(request, response);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Error detected");
        } else {
            //make a call to the dao layer
            userDao.signUp(userDto);
            //request.setAttribute("success", "Registration Successful");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

        System.out.println("Connected");
        System.out.println(firstName + lastname + email + password + age + dob);
    }
}
