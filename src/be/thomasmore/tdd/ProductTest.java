package be.thomasmore.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void productDescription() {
        Product p1 = new Product("product 1", 30, 6.2);
        Product p2 = new Product("product 2", 30, 0);
        Product p3 = new Product("product 3", 0, 6);
        Product p4 = new Product("product 4", 0, 0);
        assertEquals("30CL 6.2%", p1.productDescription());
        assertEquals("30CL", p2.productDescription());
        assertEquals("6%", p3.productDescription());
        assertEquals("", p4.productDescription());
    }
}