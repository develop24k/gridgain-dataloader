package com.develop24k.gridgaindataloader.core.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Component
public class JdbcProvider {

    @Autowired
    private Connection conn;

    public void executeCommand(String sql) throws SQLException {
        try (Statement stmt = conn.getConnection().createStatement()) {
            stmt.executeUpdate(sql);
        }
    }

    public void executeCommand(List<String> sql)
    {
        sql.forEach(x -> {
            try {
                executeCommand(x);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }

}
