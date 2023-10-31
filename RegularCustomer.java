package info;

public abstract class RegularCustomer extends Customer{
    protected float discountPercentage;
    public RegularCustomer(String custId, String custName, long mobileNo,
                           Address address) {
        super(custId, custName, mobileNo, address);
        this.discountPercentage = 5.0f;
    }
    public float getDiscountPercentage() {
        return discountPercentage;
    }
    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double payBill(double totalPrice) {
        double priceAfterDiscount = totalPrice
                * (1 - (discountPercentage / 100));
        return priceAfterDiscount;
    }
}
