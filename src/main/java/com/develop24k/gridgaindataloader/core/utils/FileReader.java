package com.develop24k.gridgaindataloader.core.utils;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FileReader {

    public List<String> readAllLines(String path) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get(path));

        List<String> cleanLines = lines.stream().filter(x -> {

            if (x.isEmpty()) return false;

            if (StringUtils.trimLeadingWhitespace(x).startsWith("#")) return false;

            if (!StringUtils.hasText(x)) return false;

            return true;
        }).collect(Collectors.toList());

        return cleanLines;

    }
}
