package coin;

import java.math.BigDecimal;

/*
    Coin is the abstract flyweight object in this example that can be used in multiple contexts.
 */
public abstract class Coin {

    // The value field is the unique identifier of a Coin
    protected BigDecimal value;
    private int year;

    public Coin (BigDecimal value) {
        this.value = value;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public int getYear() {
       return this.year;
    }

    //The value field is the unique identifier for Coin classes
    @Override
    public boolean equals(Object other) {
        return this.value.equals(((Coin) other).getValue());
    }

    //The value field is the unique identifier for Coin classes
    @Override
    public int hashCode(){
        return this.value.hashCode();
    }

    public String toString() {
        return String.format("%s : %d", this.value, this.year);
    }

}
