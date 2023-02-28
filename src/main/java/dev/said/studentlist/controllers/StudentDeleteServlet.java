package dev.said.studentlist.controllers;

import dev.said.studentlist.dao.StudentDAO;
import dev.said.studentlist.domains.Student;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "StudentDeleteServlet", value = "/delete")
public class StudentDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentDAO studentDAO = StudentDAO.getInstance();

        String sid = request.getParameter("id");
        String fname = request.getParameter("ffname");
        String lname = request.getParameter("llname");
        String major = request.getParameter("mmajor");
        String phone = request.getParameter("pphone");

        Student student = Student
                .builder()
                .id(Integer.parseInt(sid))
                .firstName(fname)
                .lastName(lname)
                .major(major)
                .phoneNumber(phone)
                .build();

        studentDAO.updateStudent(student);

        response.sendRedirect("/students");
//
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/delete.jsp");
//        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
