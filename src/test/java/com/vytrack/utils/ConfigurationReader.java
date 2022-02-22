package com.vytrack.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    static {

        try (InputStream in = new FileInputStream("configuration.properties")) {
            properties.load(in);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No configuration.properties Loaded");
        }

    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}