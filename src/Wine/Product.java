package Wine;

/**
 * Created by Jakob on 24-11-2016.
 */
public class Product {

    String name;
    String description;
    int id;
    int quantity;
    int location;           //warehouse location
    double price;
    char for_sale;          //char i stedet for boolean da MySQL ikke understøtter boolean (y/n)


    public Product() {
        this.name = null;
        this.description = null;
        this.id = 0;
        this.quantity = 0;
        this.location = 0;
        this.price = 0.0;
        this.for_sale = 'n';
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }


    public int getID() {

        return id;
    }

    public void setID(int id) {

        this.id = id;
    }


    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }


    public int getLocation() {

        return location;
    }

    public void setLocation(int location) {

        this.location = location;
    }


    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }


    public char getFor_sale() {

        return for_sale;
    }

    public void setFor_sale(char for_sale) {

        this.for_sale = for_sale;
    }


    public String toString() {
        return  "name: " + name + "\n" +
                "description: " + description + "\n" +
                "ID: " + id + "\n" +
                "quantity: " + quantity + " in stock\n" +
                "This product is located at warehouse #" + location + " in stock\n" +
                "price: " + price + " DKK \n" +
                "for sale? : " + for_sale;

    }


}
