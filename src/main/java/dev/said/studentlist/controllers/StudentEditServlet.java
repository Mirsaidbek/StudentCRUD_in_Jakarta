package dev.said.studentlist.controllers;

import dev.said.studentlist.dao.StudentDAO;
import dev.said.studentlist.db.DataBase;
import dev.said.studentlist.domains.Student;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "StudentEditServlet", value = "/edit")
public class StudentEditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentDAO studentDAO = StudentDAO.getInstance();
        String id = request.getParameter("id");
        Student student = studentDAO.getStudentById(Integer.parseInt(id));
        request.setAttribute("student", student);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/edit.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StudentDAO studentDAO = StudentDAO.getInstance();

        String sid = request.getParameter("id");
        String fname = request.getParameter("Fname");
        String lname = request.getParameter("Lname");
        String major = request.getParameter("major");
        String phone = request.getParameter("phone");

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


//        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/students.jsp");
//        dispatcher.forward(request, response);

    }
}
