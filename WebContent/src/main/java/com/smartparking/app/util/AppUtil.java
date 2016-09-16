package com.smartparking.app.util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Properties;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

public class AppUtil {

	private static final Logger logger = LoggerFactory
			.getLogger(AppUtil.class);

    private static final Gson gson = new Gson();
    
    private static Properties prop;
    
    static{
        InputStream is = null;
        try {
            prop = new Properties();
            is =  Thread.currentThread().getContextClassLoader().getResourceAsStream("technominds-config.properties");
            prop.load(is);
            logger.info("Properties file loaded : application.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private AppUtil() {
    }
    
     
    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }

   
    public static boolean isValidJsonString(String jsonString) {
        try {
            gson.fromJson(jsonString, Object.class);
            return true;
        } catch (com.google.gson.JsonSyntaxException ex) {
            return false;
        }
    }

    public static String getJsonResponse(RestResponse responseObject) {
        String response = "";
        response = gson.toJson(responseObject);
        return response;
    }

    public static String createJSON(Object object) throws JSONException,
            IllegalAccessException {
        String str = "";
        Class c = object.getClass();
        JSONObject jsonObject = new JSONObject();
        for (Field field : c.getDeclaredFields()) {
            field.setAccessible(true);
            String name = field.getName();
            String value = String.valueOf(field.get(object));
            jsonObject.put(name, value);
        }
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }

    public static String createJSON(List list) throws JSONException,
            IllegalAccessException {
        JSONArray jsonArray = new JSONArray();
        for (Object i : list) {
            String jstr = createJSON(i);
            JSONObject jsonObject = new JSONObject(jstr);
            jsonArray.put(jsonArray);
        }
        return jsonArray.toString();
    }
    
    
    
}