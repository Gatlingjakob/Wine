package Wine;

/**
 * Created by Jakob on 22-11-2016.
 */
public class Wine extends Product{

    String colour;
    String grape;
    String coo;             //country of origin
    String aoo;             //area of origin
    int production_date;
    int production_year;
    double volume;          //Amount of alcohol contained in this type of wine
    char sparkly;           //char i stedet for boolean da MySQL ikke understøtter boolean (y/n)


    public Wine() {
        this.colour = null;
        this.grape = null;
        this.coo = null;
        this.aoo = null;
        this.production_date = 0;
        this.production_year = 0;
        this.volume = 0.0;
        this.sparkly = 'n';
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


    public String getAoo() {

        return aoo;
    }

    public void setAoo(String aoo) {

        this.aoo = aoo;
    }


    public String getCoo() {

        return coo;
    }

    public void setCoo(String coo) {

        this.coo = coo;
    }


    public int getProduction_date() {

        return production_date;
    }

    public void setProduction_date(int production_date) {

        this.production_date = production_date;
    }


    public int getProduction_year() {

        return production_year;
    }

    public void setProduction_year(int production_year) {

        this.production_year = production_year;
    }





    public double getVolume() {

        return volume;
    }

    public void setVolume(double volume) {

        this.volume = volume;
    }


    public char getSparkly() {

        return sparkly;
    }

    public void setSparkly(char sparkly) {

        this.sparkly = sparkly;
    }





    public String toString() {
     return  "name: " + name + "\n" +
             "colour: " + colour + "\n" +
             "grape: " + grape + "\n" +
             "description: " + description + "\n" +
             "area of origin: " + aoo + "\n" +
             "country of origin: " + coo + "\n" +
             "date of production: " + production_date + "\n" +
             "year of production: " + production_year + "\n" +
             "ID: " + id + "\n" +
             "quantity: " + quantity + " in stock\n" +
             "This product is located at warehouse #" + location + " in stock\n" +
             "price: " + price + " DKK \n" +
             "volume: " + volume + "% \n" +
             "sparkly: " + sparkly + "\n" +
             "for sale? : " + for_sale;

    }
}