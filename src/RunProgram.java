import java.time.Year;

/**
 * Created by Jakob on 22-11-2016.
 */
public class RunProgram {
    public static void main(String[] args) {


        Wine wine1 = new Wine();

        wine1.setName("Undurraga");
        wine1.setColour("Red");
        wine1.setGrape("Cabernet Sauvignon");
        wine1.setCoo("Chile");
        wine1.setYear(Year.parse("2015"));
        wine1.setQuantity(50);
        wine1.setVolume(12.5);
        wine1.setSparkly(false);

        System.out.print(wine1.toString());
    }
}
