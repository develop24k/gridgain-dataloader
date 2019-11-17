package com.develop24k.gridgaindataloader.core;

import java.util.List;

public interface SchemaManager {

    void execute(List<String> commands) throws Exception;
    List<String> getTableList(String schemaName);
    List<String> getSchemaList();

}
