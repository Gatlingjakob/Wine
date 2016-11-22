import java.time.Year;

/**
 * Created by Jakob on 22-11-2016.
 */
public class Wine {

    String name;
    String colour;
    String grape;
    String coo;             //country of origin
    Year year;
    int quantity;
    double volume;          //Amount of alcohol contained in this type of wine
    boolean sparkly;

    public Wine() {
        this.name = null;
        this.colour = null;
        this.grape = null;
        this.coo = null;
        this.year = null;
        this.quantity = 0;
        this.volume = 0.0;
        this.sparkly = false;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }


    public String getGrape() {

        return grape;
    }

    public void setGrape(String grape) {

        this.grape = grape;
    }


    public String getCoo() {

        return coo;
    }

    public void setCoo(String coo) {

        this.coo = coo;
    }


    public Year getYear() {

        return year;
    }

    public void setYear(Year year) {

        this.year = year;
    }


    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }


    public double getVolume() {

        return volume;
    }

    public void setVolume(double volume) {

        this.volume = volume;
    }


    public boolean getSparkly() {

        return sparkly;
    }

    public void setSparkly(boolean sparkly) {

        this.sparkly = sparkly;
    }


    public String toString() {
     return  "name: " + name + "\n" +
             "colour: " + colour + "\n" +
             "grape: " + grape + "\n" +
             "coo: " + coo + "\n" +
             "year: " + year + "\n" +
             "quantity: " + quantity + "\n" +
             "volume: " + volume + "% \n" +
             "sparkly: " + sparkly;

    }
}