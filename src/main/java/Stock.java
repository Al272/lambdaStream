import java.time.LocalDate;

public class Stock {
    private String code;
    private String currency;
    private String dateClose;
    public Stock(){

    }
    public Stock(String code,String dateClose,String currency) {
        this.code = code;
        this.currency = currency;
        this.dateClose = dateClose;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getDateClose() {
        String [] temp = dateClose.split("\\.");
        return LocalDate.of(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
    }

    public void setDateClose(String dateClose) {
        this.dateClose = dateClose;
    }
}
