package com.server.quiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RequestMapping("questions")
@RestController
public class Question {
    @GetMapping("all")
    public String getAllQuestions(){
        String quary = "select * from employee";
        try {
            Connection con = new Connection() {
                @Override
                public Statement createStatement() throws SQLException {
                    return con.createStatement();
                }

                @Override
                public PreparedStatement prepareStatement(String sql) throws SQLException {
                    return con.prepareStatement(sql);
                }
            }.con;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(quary);
            String allQuestions = "";
            while (rs.next()) {
                allQuestions += rs.getString("question") + "\n";
            }
            return allQuestions;
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
}
