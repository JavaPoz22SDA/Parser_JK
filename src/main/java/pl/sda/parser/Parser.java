package pl.sda.parser;

import javafx.scene.shape.Path;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.Path;
import java.nio.Paths;


public class Parser {

    private Path file = Path.get("file.csv");

    public List<RealEstate> readfile() throws IOException {
        byte[] data = Files.readAllBytes(files);
        String convertData = new String(data);
        String[] dataArray = convertData.split("\r");
        List<String> dataList = new ArrayList<>(Arrays.asList(dataArray));

        for (String line: dataArray){
            System.out.println(line);
        }
        return null;
    }
}
