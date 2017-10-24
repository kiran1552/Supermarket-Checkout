import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;


/**
 * Created by Kiran on 10/24/2017.
 */
public class CheckoutIndividualProductsTest {


    @Test
    public void check_price_for_product_A(){
        Assert.assertEquals(sum(),5);
    }

    private long sum() {
        return 4;
    }


}
