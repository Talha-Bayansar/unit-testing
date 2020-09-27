package be.thomasmore.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    void calculateSum() {
        Exercise1 e1 = new Exercise1();
        int[] array = {2, 5, 7, 6};
        int[] emptyArray = {};
        assertEquals(0, e1.calculateSum(emptyArray));
    }
}