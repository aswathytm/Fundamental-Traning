package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

    public boolean validate(User loginUser) throws ClassNotFoundException {
        boolean status = false;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/pet?useSSL=false", "root", "qburst123");

            // Create a statement using connection object
            PreparedStatement preparedStatement = connection
            .prepareStatement("select * from user where username = ? and password = ? ")) {
            preparedStatement.setString(1, loginUser.getUsername());
            preparedStatement.setString(2, loginUser.getPassword());

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            printSQLException(e);
        }
        return status;
    }
    public static void insertUser(User user) throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/pet?useSSL=false", "root", "qburst123");

            // Create a statement using connection object
            PreparedStatement preparedStatement = connection
            .prepareStatement("INSERT INTO `user` (`username`, `password`) VALUES (?, ?);")) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }
    }
    
    private static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}