package alexeyBurlakov.methods;

import alexeyBurlakov.entity.Organization;
import alexeyBurlakov.entity.Stock;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.Stream;

public class Methods {
    public static String convertor(LocalDate localDate){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
        String text = dtf.format(localDate);
        return "Дата основания "+text;
    }
    public static int yearConvertor(String s){
       int x = Integer.parseInt(s);
       if(s.length()>2)
           return x;
       if(x>21)
           return x+1900;
       else
           return x+2000;
    }
    public void information(Organization [] organizations){
        Stream<Organization> stream = Arrays.stream(organizations);
        stream.forEach(s -> System.out.println(s.getShortName()+" - "+convertor(s.getDate())));
    }
    public void closePapers(Organization[] organizations){
        LocalDate today = LocalDate.now();
        Stream<Organization> stream = Arrays.stream(organizations);
        long l = stream.filter(x ->{
            for(Stock stock : x.getPapers())
                if(today.isAfter(stock.getDateClose())) {
                    System.out.println("Code of stock: "+stock.getCode()+", date of closing: "+stock.getDateClose()+", company full name: "+x.getName());
                    return true;
                }
                return false;
        }).count();
        System.out.println("Amount of papers: "+l);
    }
    public void dateOrganization(String date,Organization[] organizations){
       Stream<Organization> stream =Arrays.stream(organizations);
       LocalDate ld;
       String[] temp=null;
       if(date.length() != 8 && date.length() !=10)
           System.out.println("you enter date in wrong format");
       else if(date.contains("."))
           temp = date.split("\\.");
       else if(date.contains("/"))
           temp = date.split("\\/");
       int day = Integer.parseInt(temp[0]);
       int month = Integer.parseInt(temp[1]);
       int year = yearConvertor(temp[2]);
       ld=LocalDate.of(year,month,day);
       stream.filter(x ->x.getDate().isAfter(ld)).forEach(y -> System.out.println("Company full name: "+y.getName()+", date of foundation "+y.getDate()));
    }
    public void stockCurrency(String currency, Organization[] organizations){
        if(currency.length()!=3)
            System.out.println("You enter wrong currency format");
        else {
            Stream<Organization> stream = Arrays.stream(organizations);
            stream.filter(x -> {
                for (Stock stock : x.getPapers())
                    if (currency.equalsIgnoreCase(stock.getCurrency())) {
                        System.out.println(stock.getCode() + " - " + stock.getCurrency() + " - " + x.getName());
                        return true;
                    }
                return false;
            }).count();
        }
    }

}
