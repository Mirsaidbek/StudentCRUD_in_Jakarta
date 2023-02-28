package dev.said.studentlist.controllers;

import dev.said.studentlist.db.DataBase;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "StudentsListServlet", value = "/students")
public class StudentsListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataBase db = DataBase.getInstance();
        db.loadData();

        request.setAttribute("students", db.students);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/views/students.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
