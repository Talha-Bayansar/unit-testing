package be.thomasmore.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KassaTest {

    @Test
    void startingSituation(){
        Kassa kassa = new Kassa();
        int coins = kassa.getAmountOfCoins(33);
        assertEquals(33, coins);
    }

    @Test
    void buyCoins(){
        Kassa kassa = new Kassa();
        int coins = kassa.getAmountOfCoins(33);
        coins = kassa.buyCoins(coins, 100);
        assertEquals(133, coins);
        coins = kassa.buyCoins(coins, -100);
        assertEquals(133, coins);
    }

    @Test
    void order(){
        Kassa kassa = new Kassa();
        int coins = kassa.getAmountOfCoins(33);
        boolean orderAllowed = kassa.isOrderAllowed(coins, 50);
        assertFalse(orderAllowed);
        coins = kassa.buyCoins(coins, 100);
        assertEquals(133, coins);
        orderAllowed = kassa.isOrderAllowed(coins, 50);
        assertTrue(orderAllowed);
        coins = kassa.order(coins, 50);
        assertEquals(83, coins);
    }


    @Test
    void promotion(){
        Kassa kassa = new Kassa();
        int coins = kassa.getAmountOfCoins(13);
        boolean orderAllowed = kassa.isOrderAllowed(coins, 15);
        assertFalse(orderAllowed);
        coins = kassa.promotion(coins);
        assertEquals(15, coins);
        orderAllowed = kassa.isOrderAllowed(coins, 15);
        assertTrue(orderAllowed);
        coins = kassa.order(coins, 15);
        assertEquals(0, coins);
        coins = kassa.promotion(coins);
        assertEquals(0, coins);
    }

}