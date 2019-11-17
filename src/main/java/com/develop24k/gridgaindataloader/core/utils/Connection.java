package com.develop24k.gridgaindataloader.core.utils;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class Connection {

    @Value("${jdbc.conectionString}")
    private String connectionString;

    public java.sql.Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionString);
    }

}
