package additional;

public enum Vehicles {
    BMW(1000){
        @Override
        String getColor() {
            return "Black";
        }
    },
    AUDI(1100){
        @Override
        String getColor() {
            return "Silver";
        }
    };
    double price;
    String color = "Black";
    Vehicles(double price){
       this.price = price;
    }
    abstract String getColor();
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
