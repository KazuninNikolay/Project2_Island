package settings;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.FileReader;
import java.io.IOException;

public class YamlReader {
    public void print() {
        try {
            ObjectMapper mapper = new YAMLMapper();
           EatingMap prop = mapper.readValue(new FileReader("settings/settings-eating-table.yaml"), EatingMap.class);
            System.out.println(prop.getPercentOfEating());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
