package alexeyBurlakov;

import alexeyBurlakov.entity.Organization;
import alexeyBurlakov.methods.Methods;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Methods methods = new Methods();
        ObjectMapper mapper = new ObjectMapper();
        //alexeyBurlakov.entity.Organization org = new alexeyBurlakov.entity.Organization("Albatros","shortAlb","Moscow","02","522","0202","1985.07.11");
        //mapper.writeValue(new File("C:\\Users\\Алексей Б\\Desktop\\org.json"), org);
        Organization [] orgArr = mapper.readValue(new File("org2.json"), Organization[].class);
        methods.information(orgArr);
        methods.closePapers(orgArr);
        methods.dateOrganization("01.02.1966",orgArr);
        methods.stockCurrency("eur" ,orgArr);
    }




}
