package info;

public class PremiumCustomer extends RegularCustomer implements PremiumCards {
    private int rewardPoints = WELCOME_POINTS;
    public PremiumCustomer(String custId, String custName, long mobileNo,
                           Address address) {
        super(custId, custName, mobileNo, address);
        this.discountPercentage = 8.0f;
    }
    @Override
    public double redeemPoints(double totalPrice) {
        double amountDeducted = checkAvailablePoints(totalPrice) ? totalPrice
                : this.rewardPoints;
        this.rewardPoints = this.rewardPoints
                - (int) Math.round(amountDeducted);
        System.out.println((int) Math.round(amountDeducted)
                + " points deducted for paying the bill");
        System.out.println(this.rewardPoints + " points remaining");
        return amountDeducted;
    }
    @Override
    public void addPoints(double money) {
        int pointsAdded = (int) money / 10;
        this.rewardPoints += pointsAdded;
        System.out.println(pointsAdded + " points added for your purchase");
        System.out.println(this.rewardPoints + " points remaining");
    }
    @Override
    public double payBill(double totalPrice) {
        double priceAfterDiscount = super.payBill(totalPrice);
        System.out.println("Total cost after discount: " + priceAfterDiscount);
        addPoints(priceAfterDiscount);
        totalPrice = priceAfterDiscount - redeemPoints(priceAfterDiscount);
        return totalPrice;
    }
    public boolean checkAvailablePoints(double amountToBePaid) {
        if (this.rewardPoints >= Math.round(amountToBePaid)) {
            return true;
        }
        return false;
    }
    public int getRewardPoints() {
        return rewardPoints;
    }
    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}
