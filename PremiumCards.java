package info;

public interface PremiumCards {
    int WELCOME_POINTS = 100;
    double redeemPoints(double totalPrice);
    void addPoints(double money);
}
