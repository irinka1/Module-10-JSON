import Utilities.RandomDate;
import com.alibaba.fastjson.JSON;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class MAIN {


    public static void writeToFile(String json,String pathToJsonFile) throws IOException {    //write to File our JSON
    FileWriter fileWriter = new FileWriter(pathToJsonFile);
    fileWriter.write(json);
    fileWriter.flush();
    fileWriter.close();
}

    public static String loadFromFile(String pathToJsonFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(pathToJsonFile));
        String json = reader.readLine();
        return json;
    }

    public static void main(String[] args) throws IOException {
        int count = 20;
        List<Fruits> fruits = Trademark.generateFruits(count);
        String json = JSON.toJSONString(fruits);
        System.out.println(json);

        Trademark trademark  = new Trademark();
        System.out.println("Spoiled Fruits:");
        trademark.getSpoiledFruits(LocalDate.of(2017, 11, 20), fruits);
        System.out.println("This fruit is spolied:");
        trademark.getSpoiledFruits(LocalDate.of(2017, 11, 20),fruits,"plum");
        System.out.println("Available Fruits:");
        trademark.getAvailableFruits(LocalDate.now(), fruits );
        System.out.println("Ready to sell:");
        trademark.getAvailableFruits(LocalDate.now(), "plum" , fruits);

        writeToFile(json, "files/data.txt");
        String json1 = loadFromFile("files/data.txt");
        List<Fruits> fruits2 = JSON.parseArray(json1, Fruits.class);
        System.out.println("Our JSON from file:");
        System.out.println(json1);
    }
}
