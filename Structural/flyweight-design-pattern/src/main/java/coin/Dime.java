package coin;

import java.math.BigDecimal;

/*
    Concrete flyweight class that extends the Coin class
 */
public class Dime extends Coin {

    public Dime() {
        super(new BigDecimal(".10"));
    }

}
