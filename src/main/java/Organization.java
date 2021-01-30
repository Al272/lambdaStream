import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String name;
    private String shortName;
    private String address;
    private String phone;
    private String inn;
    private String ogrn;
    private String date;
    private Stock[] papers;

    public Organization(){

    }
    public Organization(String name, String shortName, String address, String phone, String inn, String ogrn, String date){
        this.name = name;
        this.shortName = shortName;
        this.address = address;
        this.phone = phone;
        this.inn = inn;
        this.ogrn = ogrn;
        this.date = date;
        //this.papers = papers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public LocalDate getDate() {
       String [] temp = date.split("\\.");
       return LocalDate.of(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));

    }

    public void setDate(String date) {
        this.date = date;
    }

    public Stock[] getPapers() {
        return papers;
    }

    public void setPapers(Stock[] papers) {
        this.papers = papers;
    }

}
