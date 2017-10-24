/**
 * Created by Kiran on 10/24/2017.
 */
public class SpecialPrice {

    private int unitPrice;
    private int quantity;
    private int specialPrice;

    // Used for set Special Price
    public SpecialPrice(int unitPrice, int batchSize, int specialPrice) {
        this.unitPrice = unitPrice;
        this.quantity = batchSize;
        this.specialPrice = specialPrice;
    }

    // Used for set Unit Price
    public SpecialPrice(int unitPrice) {
        this.unitPrice = unitPrice;
        this.quantity = 1;
        this.specialPrice = unitPrice;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSpecialPrice() {
        return specialPrice;
    }
}
