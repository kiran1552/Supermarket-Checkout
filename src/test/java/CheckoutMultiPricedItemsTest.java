import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by Kiran on 10/24/2017.
 */
public class CheckoutMultiPricedItemsTest {

    @Test
    public void should_be_able_to_purchase_the_several_items() {
        //Given
        // Set The Rules for items
        CheckOut checkOut = new CheckOut(SpecialPriceRule.ofPriceRules());

        // When
        checkOut.theItems("AAA");
        checkOut.theItems("BB");

        //Then
        assertThat(checkOut.theTotal(), is(85));
    }

    @Test
    public void should_be_able_to_purchase_the_item_A_and_B_and_C_from_the_supermarket() {
        //Given
        // Set The Rules for items
        CheckOut checkOut = new CheckOut(SpecialPriceRule.ofPriceRules());

        // When
        checkOut.theItems("ABAACBBA");

        //Then
        assertThat(checkOut.theTotal(), is(165));
    }

    @Test
    public void should_be_able_to_purchase_the_item_A_and_B_and_C_and_D_from_the_supermarket() {
        //Given
        // Set The Rules for items
        CheckOut checkOut = new CheckOut(SpecialPriceRule.ofPriceRules());

        // When
        checkOut.theItems("ABACBBADDA");

        //Then
        assertThat(checkOut.theTotal(), is(215));
    }
}
