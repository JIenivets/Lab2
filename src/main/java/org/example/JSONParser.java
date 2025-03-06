package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

class JSONParser {

    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static Map<String, User> jsonRead(String file_path){
        Type userMapType = new TypeToken<Map<String, User>>() {}.getType();
        try (FileReader reader = new FileReader(file_path)) {
            return gson.fromJson(reader, userMapType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }

    public static void jsonWrite(Object data, String file_path){
        try (FileWriter writer = new FileWriter(file_path)) {
            gson.toJson(data, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}