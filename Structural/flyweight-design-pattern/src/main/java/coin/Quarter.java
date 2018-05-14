package coin;

import java.math.BigDecimal;

/*
    Concrete flyweight class that extends the Coin class
 */
public class Quarter extends Coin {

    public Quarter() {
        super(new BigDecimal(".25"));
    }

}
