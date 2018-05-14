package coin;

import java.math.BigDecimal;

/*
    Concrete flyweight class that extends the Coin class
 */
public class Nickel extends Coin {

    public Nickel() {
        super(new BigDecimal(".05"));
    }

}
