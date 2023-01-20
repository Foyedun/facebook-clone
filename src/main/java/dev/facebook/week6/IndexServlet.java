package dev.facebook.week6;

import dev.facebook.week6.dao.UserDao;
import dev.facebook.week6.dao.impl.UserDaoImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


import java.io.IOException;

@WebServlet(name = "IndexServlet", value = "/login")
public class IndexServlet extends HttpServlet {
    private static UserDao userDao = new UserDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        boolean isUserExist = userDao.isUserExist(email,password);
        System.out.println(isUserExist);


        if(isUserExist){
            session.setAttribute("name",email);
            //dispatcher = request.getRequestDispatcher("/dashboard.jsp");
        } else {
            request.setAttribute("status","Invalid Credentials");
           dispatcher = request.getRequestDispatcher("/login.jsp");
        }

        dispatcher.forward(request,response);

//        if(email == null || password == null){
//            request.setAttribute("error", "You're missing one of the inputs");
//            try {
//                doGet(request, response);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Error detected");
//        } else {
//            System.out.println("Login Successful");
//        }
    }
}
