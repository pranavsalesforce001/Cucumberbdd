package TestPOMBDD;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    static Properties prop;

    static FileInputStream input;
    public  String getProperty(String key){
        prop=new Properties();
        try{
            input=new FileInputStream("src\\test\\java\\Resurces\\config.properties");
            prop.load(input);
            input.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
