package coinfactory;

import coin.*;

import java.math.BigDecimal;
import java.util.HashMap;

/*
    This class creates and manages the flyweight Coin objects.
 */
public class CoinFactory {

    // This variable is the Coin cache which contains the Coin instances
    private HashMap<BigDecimal, Coin> coinCollection;

    public CoinFactory() {
        this.coinCollection = new HashMap<>();
    }

    /*
        Get Coin object based on value amount.
        The method will first check to see if a Coin exists with the given value.
        If object is found, return object from cache.
        If the coin wasn't found, then create the Coin, add it to the cache, and then return the new coin.
     */
    public Coin getCoin(BigDecimal value) {
        if(this.coinCollection.containsKey(value)){
            return this.coinCollection.get(value);
        }
        Coin newCoin = createCoin(value);
        addCoinToCollection(newCoin);
        return newCoin;
    }

    //This method adds flyweight coin objects to the factory's cache.
    private void addCoinToCollection(Coin coin) {
        this.coinCollection.put(coin.getValue(), coin);
    }

    //This method creates a coin based on a pre-set collection of coin values.
    private Coin createCoin(BigDecimal value) {
        switch (value.toString()) {
            case "0.01":
                return new Penny();
            case "0.05":
                return new Nickel();
            case "0.10":
                return new Dime();
            case "0.25":
                return new Quarter();
        }
        throw new RuntimeException(String.format("Coin for value %s does not exist in system.", value));
    }

    // This method is only needed for testing.
    public HashMap<BigDecimal, Coin> getCoinCollection() {
        return this.coinCollection;
    }
}
