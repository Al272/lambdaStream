

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        Methods methods = new Methods();
        ObjectMapper mapper = new ObjectMapper();
        //Organization org = new Organization("Albatros","shortAlb","Moscow","02","522","0202","1985.07.11");
        //mapper.writeValue(new File("C:\\Users\\Алексей Б\\Desktop\\org.json"), org);
        Organization [] orgArr = mapper.readValue(new File("C:\\Users\\Алексей Б\\Desktop\\org2.json"), Organization[].class);
        methods.information(orgArr);
        methods.closePapers(orgArr);
        methods.dateOrganization("01.02.1900",orgArr);
        methods.stockCurrency("usd" ,orgArr);
    }




}
