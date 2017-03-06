package com.ivankatunou;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by st on 27.02.2017.
 */
public class DatabaseConfig {

    private static Properties propertiesFile;

    static {
        propertiesFile = new Properties();
        InputStream stream = DatabaseConfig.class.getResourceAsStream("data.properties");
        try {
            propertiesFile.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getValue(String key){ return propertiesFile.getProperty(key);}
}
