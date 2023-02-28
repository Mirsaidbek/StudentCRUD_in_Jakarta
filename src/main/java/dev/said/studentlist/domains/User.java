package dev.said.studentlist.domains;

public class User {
    Integer id;
    String username;
    String password;
    UserRole role;

    public enum UserRole {
        STUDENT,
        PROFESSOR,
        ADMIN
    }
}

