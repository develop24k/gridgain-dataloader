package com.develop24k.gridgaindataloader.core.impl;

import com.develop24k.gridgaindataloader.core.DataLoader;
import com.develop24k.gridgaindataloader.core.utils.JdbcProvider;
import org.apache.ignite.internal.util.IgniteUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class DataLoaderImpl implements DataLoader {

    @Autowired
    private JdbcProvider jdbcProvider;

    @Override
    public void Copy() throws SQLException {

        jdbcProvider.executeCommand("COPY FROM '" + IgniteUtils.resolveIgnitePath("C:\\temp\\data.csv") + "' " +"INTO City (ID, NAME) FORMAT CSV");

    }


}
