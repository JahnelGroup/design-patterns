package coinfactory;

import coin.Coin;
import coin.Nickel;
import coin.Penny;
import coin.Quarter;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.assertTrue;

/*
    The following tests show that only one instance of each coin is created regardless of how much the factory is queried for a type of coin.
 */
public class CoinFactoryTests {

    private CoinFactory coinFactory;

    @Before
    public void setUp(){
        this.coinFactory = new CoinFactory();
    }

    @Test
    public void shouldCreateOneInstanceOfAPennyClass() {
        List<String> results = Arrays.asList(2017, 2016, 2015, 2015)
                .stream()
                .map(y -> {
                    Coin coin = coinFactory.getCoin(BigDecimal.valueOf(.01));
                    coin.setYear(y);
                    return coin.toString();
                })
                .collect(Collectors.toList());
        assertTrue("Only one penny should have been instantiated.",
                coinFactory.getCoinCollection().size() == 1);
        assertThat(results).containsExactly("0.01 : 2017", "0.01 : 2016", "0.01 : 2015", "0.01 : 2015");
    }

    @Test
    public void shouldCreateOneInstanceOfEachCoinCreated() {
        List<String> results = Arrays.asList(
                    createCoin(new Penny(), 2010),
                    createCoin(new Penny(), 2016),
                    createCoin(new Nickel(), 2015),
                    createCoin(new Quarter(), 2012),
                    createCoin(new Quarter(), 2013)
                )
                .stream()
                .map(c -> {
                    Coin coin = coinFactory.getCoin(c.getValue());
                    coin.setYear(c.getYear());
                    return coin.toString();
                })
                .collect(Collectors.toList());
        System.out.println(coinFactory.getCoinCollection());
        assertTrue("Only 3 coins should have been instantiated.",
                coinFactory.getCoinCollection().size() == 3);
        assertThat(results).containsExactly("0.01 : 2010",
                                            "0.01 : 2016",
                                            "0.05 : 2015",
                                            "0.25 : 2012",
                                            "0.25 : 2013");
    }

    public Coin createCoin(Coin coin, int year) {
        coin.setYear(year);
        return coin;
    }

}
