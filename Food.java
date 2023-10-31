package info;

public class Food {
    private String name;
    private String cuisine;
    private String type;
    private int quantityAvailable;
    private double unitPrice;

    Food(String name, double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCuisine(){
        return cuisine;
    }
    public void setCuisine(String cuisine){
        this.cuisine = cuisine;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}


