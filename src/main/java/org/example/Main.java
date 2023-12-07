package org.example;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {
        TaskDAO dao = new TaskDAO();
        dao.closeConnection();
}}