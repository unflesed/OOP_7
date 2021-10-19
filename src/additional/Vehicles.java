package additional;

public enum Vehicles {
    BMW(1000), AUDI(1100);
    double price;
    String color = "Black";
    Vehicles(double price){
       this.price = price;
    }
    String getColor(){
        return color;
    }
    @Override
    public String toString() {
        return this.name() +
                " price= " + price +
                ", color= " + getColor();
    }

    public static void main(String[] args) {
        Vehicles vehicle = Vehicles.BMW;
        System.out.println(vehicle);
    }
}
