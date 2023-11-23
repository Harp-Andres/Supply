package co.com.bancodeoccidente.supplyfactor.utils;

import java.io.*;
import java.util.Properties;

public class MetodoUtilCargarArchivo {

    public static Properties properties;
    public static void configLoginProperties() {

        properties = new Properties();
        try {
            properties.load(new FileReader("info.properties"));
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void configDataProveedorProperties() {

        properties = new Properties();
        try {
            properties.load(new BufferedReader(new InputStreamReader(new FileInputStream("dataAgregarProveedor.properties"), "utf-8")));
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}