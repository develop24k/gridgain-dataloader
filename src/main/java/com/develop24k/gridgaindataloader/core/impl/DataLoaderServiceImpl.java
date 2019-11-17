package com.develop24k.gridgaindataloader.core.impl;

import com.develop24k.gridgaindataloader.core.DataLoader;
import com.develop24k.gridgaindataloader.core.DataLoaderService;
import com.develop24k.gridgaindataloader.core.SchemaManager;
import com.develop24k.gridgaindataloader.core.utils.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class DataLoaderServiceImpl implements DataLoaderService {

    @Autowired
    private DataLoader dataLoader;

    @Autowired
    private SchemaManager schemaManager;

    @Autowired
    private FileReader fileReader;

    @Value("${SQL_Script_Path}")
    private String scriptPath;

    @Override
    public void createSchema() {
        try {
            schemaManager.execute(fileReader.readAllLines(scriptPath));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void loadData() {
        try {
            dataLoader.Copy();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
