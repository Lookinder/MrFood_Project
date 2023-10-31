package info;

class Order {
    private static int orderIdCounter;
    private int orderId;
    private Customer customer;
    public Food[] orderedFoods;
    public double totalPrice;
    public String status;
    public static int orderCounter;

    static {
        orderIdCounter = 100;
    }

    Order(Food[] orderedFoods, Customer customer){
        this.orderedFoods = orderedFoods;
        this.customer = customer;
        this.orderId = ++Order.orderIdCounter;
    }
    public static int getTotalNoOfOrders(){

        return orderCounter;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static int getOrderIdCounter(){
        return orderIdCounter;
    }
    public static void setOrderIdCounter(int orderIdCounter){
        Order.orderIdCounter = orderIdCounter;
    }
    public static int getOrderCounter(){
        return orderCounter;
    }
    public static void setOrderCounter(int orderCounter){
        Order.orderCounter = orderCounter;
    }
    public Food[] getOrderedFoods(){

        return orderedFoods;
    }
    public void setOrderedFoods(Food[] orderedFoods){
        this.orderedFoods = orderedFoods;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {

        this.totalPrice = totalPrice;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double calculateTotalPrice(String paymentMode){
        double foodPrice = 0;
        double finalPrice = 0;
        float serviceCharge = 0f;
        for(Food food :orderedFoods){
            foodPrice+=food.getUnitPrice()*1;
        }
        if(paymentMode.equals("Credit Card") || paymentMode.equals("Debit Card")){
            serviceCharge = 2.0f;
        }
        else if(paymentMode.equals("Paypal")){
            serviceCharge = 2.9f;
        }
        finalPrice = foodPrice+foodPrice*(serviceCharge/100);
        this.setTotalPrice(finalPrice);
        return finalPrice;
    }
}
