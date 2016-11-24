package Wine;

import java.util.Calendar;

/**
 * Created by Jakob on 22-11-2016.
 */
public class RunProgram {
    public static void main(String[] args) {

        //turns two ints into a date (Spørg jaks hvorfor dette er smart)
        int day = 24;
        int month = 12;
        int date =  Integer.valueOf(String.valueOf(day) + String.valueOf(month));

        //create Wine-object
        Wine wine1 = new Wine();

        //set values
        wine1.setName("Undurraga");
        wine1.setColour("Red");
        wine1.setGrape("Cabernet Sauvignon");
        wine1.setDescription("One good-ass Cab Sav, my man!");
        wine1.setAoo("Versace");
        wine1.setCoo("Chile");
        wine1.setProduction_date(date);
        wine1.setProduction_year(Calendar.getInstance().get(Calendar.YEAR));
        wine1.setID(1337);
        wine1.setQuantity(46);
        wine1.setPrice(35.00);
        wine1.setVolume(12.5);
        wine1.setSparkly('n');

        //print toString
        System.out.println("### ### ### Wine 1 (Wine) ### ### ###");
        System.out.println(wine1.toString());

        System.out.println();


        RedWine wine2 = new RedWine();
        System.out.println("### ### ### Wine 2 (Red Wine) ### ### ###");
        System.out.println(wine2.toString());

        System.out.println();

        WhiteWine wine3 = new WhiteWine();
        System.out.println("### ### ### Wine 3 (White Wine) ### ### ###");
        System.out.println(wine3.toString());

        System.out.println();

        SparklyRedWine wine4 = new SparklyRedWine();
        System.out.println("### ### ### Wine 4 (Sparkly Red Wine) ### ### ###");
        System.out.println(wine4.toString());

        System.out.println();

        SparklyWhiteWine wine5 = new SparklyWhiteWine();
        System.out.println("### ### ### Wine 5 (Sparkly White Wine) ### ### ###");
        System.out.println(wine5.toString());

        Product product1 = new Product();
        System.out.println("### ### ### Product 1 (Product) ### ### ###");
        System.out.println(product1.toString());

    }
}
