import com.sun.istack.internal.NotNull;

import java.util.LinkedList;
import java.util.List;

import static java.lang.String.valueOf;

/**
 * Created by Kiran on 10/24/2017.
 */
public class CheckOut {
    private final PriceRule ruleSet;
    private List<String> items = new LinkedList<>();

    public CheckOut(PriceRule ruleSet) {
        this.ruleSet = ruleSet;
    }

    // Calculate the Total Price
    public int theTotal() {
        return ruleSet.calculateTotalPrice(items);
    }

    // Add each item into Linked List
    public void theItems(@NotNull String listOfItems) {
        for(int i=0; i<listOfItems.length(); i++)
            items.add(valueOf(listOfItems.charAt(i)));
    }
}
