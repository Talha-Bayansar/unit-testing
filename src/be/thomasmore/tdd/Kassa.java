package be.thomasmore.tdd;

public class Kassa {
    public int getAmountOfCoins(int i) {
        return i;
    }

    public int buyCoins(int coinsTable, int amountToAdd) {
        if (amountToAdd >= 0){
            return coinsTable + amountToAdd;
        }else{
            return coinsTable;
        }

    }

    public boolean isOrderAllowed(int coinsTable, int amountOrder) {
        if(coinsTable >= amountOrder){
            return true;
        }else{
            return false;
        }
    }

    public int order(int coinsTable, int amountOrder) {
        return coinsTable - amountOrder;
    }

    public int promotion(int coinsTable) {
        if(coinsTable >= 10){
            return coinsTable + 2;
        }else{
            return coinsTable;
        }
    }
}
