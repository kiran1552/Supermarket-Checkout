import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/**
 * Created by Kiran on 10/24/2017.
 */
public class CheckoutIndividualPricedItemsTest {

    @Test
    public void the_supermarket_should_initially_have_no_items_sold() {
        //Given
        // Set The Rules for items
        CheckOut checkOut = new CheckOut(SpecialPriceRule.ofPriceRules());

        //Then
        assertThat(checkOut.theTotal(), is(0));
    }

    @Test
    public void should_be_able_to_purchase_a_item_A_from_the_supermarket() {
        //Given
        // Set The Rules for items
        CheckOut checkOut = new CheckOut(SpecialPriceRule.ofPriceRules());

        // When
        checkOut.theItems("A");

        //Then
        assertThat(checkOut.theTotal(), is(40));
    }

    @Test
    public void should_be_able_to_purchase_a_item_B_from_the_supermarket() {
        //Given
        // Set The Rules for items
        CheckOut checkOut = new CheckOut(SpecialPriceRule.ofPriceRules());

        // When
        checkOut.theItems("B");

        //Then
        assertThat(checkOut.theTotal(), is(10));
    }

    @Test
    public void should_be_able_to_purchase_a_Item_B_and_C_and_D_from_the_supermarket() {
        //Given
        // Set The Rules for items
        CheckOut checkOut = new CheckOut(SpecialPriceRule.ofPriceRules());

        // When
        checkOut.theItems("B");
        checkOut.theItems("C");
        checkOut.theItems("D");

        //Then
        assertThat(checkOut.theTotal(), is(65));
    }

    @Test
    public void should_be_able_to_purchase_a_Item_A_and_B_and_C_and_D_from_the_supermarket() {
        //Given
        // Set The Rules for items
        CheckOut checkOut = new CheckOut(SpecialPriceRule.ofPriceRules());

        // When
        checkOut.theItems("ABCD");

        //Then
        assertThat(checkOut.theTotal(), is(105));
    }

}
