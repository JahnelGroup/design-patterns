package coin;

import java.math.BigDecimal;

/*
    Concrete flyweight class that extends the Coin class
 */
public class Penny extends Coin {

    public Penny() {
        super(new BigDecimal(".01"));
    }

}
