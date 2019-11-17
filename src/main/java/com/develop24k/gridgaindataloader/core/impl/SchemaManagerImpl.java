package com.develop24k.gridgaindataloader.core.impl;

import com.develop24k.gridgaindataloader.core.SchemaManager;
import com.develop24k.gridgaindataloader.core.utils.JdbcProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SchemaManagerImpl implements SchemaManager {

    @Autowired
    private JdbcProvider jdbcProvider;

    @Override
    public void execute(List<String> commands) throws Exception {

        jdbcProvider.executeCommand(commands);
    }

    @Override
    public List<String> getTableList(String schemaName) {
        return null;
    }

    @Override
    public List<String> getSchemaList() {
        return null;
    }

    /**
     * Prints message.
     *
     * @param msg Message to print before all objects are printed.
     */
    private void print(String msg) {
        System.out.println();
        System.out.println(">>> " + msg);
    }

}
