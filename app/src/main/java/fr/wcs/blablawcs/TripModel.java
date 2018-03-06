import java.util.Date;

/**
 * Created by wilder on 05/03/18.
 */

public class TripModel {


    String firstname = "Name";
    String lastname = "Last";
    Date date;
    int price;

    public TripModel(String firstname, String lastname, Date date, int price) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.date = date;
        this.price = price;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}