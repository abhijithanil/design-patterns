package com.inspire17.tutorial.common;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<String> readFile(String fileName)
            throws java.io.IOException {
        InputStream inputStream = FileReader.class.getClassLoader().getResourceAsStream(fileName);
        List<String> instructions = new ArrayList<>();
        try (java.io.BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                instructions.add(line);
            }
        }
        return instructions;
    }
}
