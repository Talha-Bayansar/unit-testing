package be.thomasmore.tdd;

public class Product {
    public String name;
    public int size;
    public int percentage;

    public Product(String name, int size, int percentage) {
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }

    public String productDescription(){
        String s = "";
        if (size == 0 && percentage != 0){
            s += percentage + "%";
        } else if (size != 0 && percentage == 0){
            s += size + "CL";
        } else if (size != 0 && percentage != 0){
            s += size + "CL " + percentage + "%";
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
