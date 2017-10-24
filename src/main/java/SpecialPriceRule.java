import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


/**
 * Created by Kiran on 10/24/2017.
 */
public class SpecialPriceRule implements PriceRule {


    private Map<String, SpecialPrice> priceRules;

    public SpecialPriceRule(Map<String, SpecialPrice> priceRules) {
        this.priceRules = priceRules;
    }

    // Calculate the total price
    @Override
    public int calculateTotalPrice(Collection<String> skus) {
        return skus.stream()
                .collect(groupingBy(x -> x, counting()))
                .entrySet().stream()
                .map(x -> calculatePriceFor(x.getKey(), x.getValue()))
                .mapToInt(Integer::intValue)
                .sum();
    }

    // Set the Unit & Special Price for items
    public static PriceRule ofPriceRules() {
        Map<String, SpecialPrice> priceRules = new HashMap<>();
        priceRules.put("A", new SpecialPrice(40, 3, 70));
        priceRules.put("B", new SpecialPrice(10, 2, 15));
        priceRules.put("C", new SpecialPrice(30));
        priceRules.put("D", new SpecialPrice(25));
        return new SpecialPriceRule(priceRules);

    }

    private int calculatePriceFor(String name, long quantity) {
        if(!priceRules.containsKey(name)) {
            throw new IllegalArgumentException(String.format("No price rule found for '%s'", name));
        }

        SpecialPrice price = priceRules.get(name);

        int batchSize = price.getQuantity();
        int specialPrice = price.getSpecialPrice();
        int unitPrice = price.getUnitPrice();

        int batchCount = (int) (quantity / batchSize);
        int remainder = (int) (quantity % batchSize);

        return batchCount * specialPrice + remainder * unitPrice;
    }


}
