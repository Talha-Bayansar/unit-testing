package be.thomasmore.tdd;

public class Product {
    public String name;
    public int size;
    public double percentage;

    public Product(String name, int size, double percentage) {
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }

    public String productDescription(){
        String s = "• ";
        int intValue = (int)Math.round(percentage);
        double roundedDouble = Math.round(percentage * 10)/10.0;
        if (percentage % intValue == 0){
            if (size == 0 && percentage != 0){
                s += intValue + "%";
            } else if (size != 0 && intValue == 0){
                s += size + "CL";
            } else if (size != 0 && intValue != 0){
                s += size + "CL " + intValue + "%";
            }
        }else {
            if (size == 0 && percentage != 0) {
                s += roundedDouble + "%";
            } else if (size != 0 && roundedDouble == 0) {
                s += size + "CL";
            } else if (size != 0 && roundedDouble != 0) {
                s += size + "CL " + roundedDouble + "%";
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Product p1 = new Product("product 1", 30, 6);
        Product p2 = new Product("product 2", 30, 0);
        Product p3 = new Product("product 3", 0, 6);
        Product p4 = new Product("product 4", 0, 0);
        System.out.println(p1.productDescription());
        System.out.println(p2.productDescription());
        System.out.println(p3.productDescription());
        System.out.println(p4.productDescription());
    }
}
