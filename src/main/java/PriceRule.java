import java.util.Collection;

/**
 * Created by Kiran on 10/24/2017.
 */
public interface PriceRule {
    int calculateTotalPrice(Collection<String> items);

}
