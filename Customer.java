package info;

public abstract class Customer {
    private String customerId;
    private String customerName;
    private long contactNumber;
    private Address address;
    private Order order;
    private static int counter;
    public double totalPrice;

    static {
        counter = 100;
    }

    Customer(String customerId, String customerName, long contactNumber,
             Address address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    Customer(String customerId, String customerName, Address address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setCounter(int counter) {
        Customer.counter = counter;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public void payBill() {
        double discountPercentage = 25;
        System.out.println("Calculating final amount to be paid.....");
        double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
        System.out.println("Hi " + customerName + ", your final bill amount after discount: " + (int) priceAfterDiscount * 100 / 100.0 + " Rs.");
        System.out.println("_____________________________________________________________");
        System.out.println();
        System.out.println();
    }

    public void displayCustomerDetails() {
        System.out.println("_____________________________________________________________");
        System.out.println("Customer Id : " + getCustomerId());
        System.out.println("Customer Name : " + getCustomerName());
        System.out.println("Contact Number : " + getContactNumber());
        System.out.println("Address : " + address.getDoorNo() + " " + address.getStreet() + " " + address.getCity() + " " + address.getZipCode());
        System.out.println("Total no of Orders: "+Order.orderCounter);
        System.out.println();
    }

    public static void main(String[] args) {

        Food f1 = new Food("Buger",45);
        Food f2 = new Food("Pizza",240);
        Food f3 = new Food("Chow mein",80);
        Food f4 = new Food("French fires",65);
        Food f5 = new Food("Freid Rice",55);
        Food f6 = new Food("Manchurian",75);
        Food f7 = new Food("Hakka noodles",90);
        Food f8 = new Food("Manchow soup",80);
        Food f9 = new Food("Plain Rice",45);
        Food f10 = new Food("Jira Rice",65);
        Food f11 = new Food("Plain Rooti",15);
        Food f12 = new Food("Tandoori Rooti",25);
        Food f13 = new Food("Plain Prantha",25);
        Food f14 = new Food("Lacha Prantha",35);
        Food f15 = new Food("Allo Prantha",45);
        Food f16 = new Food("Paneer Prantha",55);
        Food f17 = new Food("Plain bread",15);
        Food f18 = new Food("Garlic bread",25);
        Food f19 = new Food("Paneer Masala",65);
        Food f20 = new Food("Paneer Butter Masala",85);
        Food f21 = new Food("Punjabi Paneer",80);
        Food f22 = new Food("Hydrabadi Pandder",85);
        Food f23 = new Food("Chilli Paneer",75);
        Food f24 = new Food("Paneer Gravy",65);
        Food f25 = new Food("Chicken Masala",65);
        Food f26 = new Food("Butter chicken",80);
        Food f27 = new Food("Chilli chicken",85);
        Food f28 = new Food("Chicken fried",100);
        Food f29 = new Food("Briyani",120);
        Food f31 = new Food("Veg-biryani",105);

        Address custAddress = new Address("D089", "St. Louis Street",
                "Springfield", 62729);
        Customer premiumCustomer = new PremiumCustomer("C1016",
                "Stephen Abram", 7856341287L, custAddress);
        premiumCustomer.displayCustomerDetails();
        double amountRemaining = premiumCustomer.payBill(140);
        System.out.println("Final amount to be paid " + amountRemaining);


        Address address1 = new Address("D404","Hari singh road","Jammu",184324);
        Customer customer1 = new Customer("C1", "Atul Rajput", 9746578324L, address1) {
            @Override
            public double payBill(double totalPrice) {
                return 0;
            }
        };

        Food[] food1 = new Food[] {f1, f4, f6, f14, f17};
        Order order1 = new Order(food1,customer1);
        Order.orderCounter = food1.length;
        System.out.println("___________________________________");
        System.out.println("\tOrder Id : " +order1.getOrderId());
        customer1.displayCustomerDetails();
        customer1.totalPrice=order1.calculateTotalPrice("Debit Card");
        customer1.payBill();

        Address address2 = new Address("Lk04","Old road","Jaipur",908324);
        Customer customer2 = new Customer("C2", "Bhanu Sharma", 8007001234L, address2) {
            @Override
            public double payBill(double totalPrice) {
                return 0;
            }
        };
        Food[] food2 = new Food[] {f1, f7, f11, f14, f21};
        Order order2 = new Order(food2,customer2);
        Order.orderCounter = food2.length;
        System.out.println("___________________________________");
        System.out.println("\tOrder Id : " +order2.getOrderId());
        customer2.displayCustomerDetails();
        customer2.totalPrice=order1.calculateTotalPrice("Paypal");
        customer2.payBill();

        Address address3 = new Address("K04","Lachhipur","Kolkata",184148);
        Customer customer3 = new Customer("C3", "Akhil Singh", 70086453241L, address3) {
            @Override
            public double payBill(double totalPrice) {
                return 0;
            }
        };
        Food[] food3 = new Food[] {f1, f3, f6, f12, f14};
        Order order3 = new Order(food3, customer3);
        Order.orderCounter = food3.length;
        System.out.println("___________________________________");
        System.out.println("\tOrder Id : " +order3.getOrderId());
        customer3.displayCustomerDetails();
        Order.orderCounter = food3.length;
        System.out.println("___________________________________");
        System.out.println("\tOrder Id : " +order3.getOrderId());
        customer3.totalPrice=order1.calculateTotalPrice("Paytm");
        customer3.payBill();

        Address address4 = new Address("I104","Mughal Road","Jalandhar",700564);
        Customer customer4 = new Customer("C4", "Shavi Gupta", 9622345262L, address4) {
            @Override
            public double payBill(double totalPrice) {
                return 0;
            }
        };
        Food[] food4 = new Food[] {f12, f5, f8, f19, f27};
        Order order4 = new Order(food4, customer4);
        Order.orderCounter = food4.length;
        System.out.println("___________________________________");
        System.out.println("\tOrder Id : " +order4.getOrderId());
        customer4.displayCustomerDetails();
        customer4.totalPrice=order1.calculateTotalPrice("Debit Card");
        customer4.payBill();

        Address address5 = new Address("H002","Shiva chownk","Raipur",180024);
        Customer customer5 = new Customer("C5", "Diksha Sharma", 91234554321L, address5) {
            @Override
            public double payBill(double totalPrice) {
                return 0;
            }
        };
        Food[] food5 = new Food[] {f1, f2, f3, f8, f18 , f23};
        Order order5 = new Order(food5, customer5);
        Order.orderCounter = food5.length;
        System.out.println("___________________________________");
        System.out.println("\tOrder Id : " +order5.getOrderId());
        customer5.displayCustomerDetails();
        customer5.totalPrice=order1.calculateTotalPrice("Google Pay");
        customer5.payBill();

        Address address6 = new Address("D11","Azad road","Delhi",234554);
        Customer customer6 = new Customer("C6", "Amisha Singh", 9746000024L, address6) {
            @Override
            public double payBill(double totalPrice) {
                return 0;
            }
        };
        Food[] food6 = new Food[] {f1, f14, f6, f3, f11};
        Order order6 = new Order(food6,customer6);
        Order.orderCounter = food6.length;
        System.out.println("___________________________________");
        System.out.println("\tOrder Id : " +order6.getOrderId());
        customer6.displayCustomerDetails();
        customer6.totalPrice=order1.calculateTotalPrice("Debit Card");
        customer6.payBill();

        Address address7 = new Address("B4","Karan nagar","Srinagar",111234);
        Customer customer7 = new Customer("C7", "Abdul khan", 946955735L, address7) {
            @Override
            public double payBill(double totalPrice) {
                return 0;
            }
        };
        Food[] food7 = new Food[] {f11, f14, f16, f15, f17};
        Order order7 = new Order(food7,customer7);
        Order.orderCounter = food7.length;
        System.out.println("___________________________________");
        System.out.println("\tOrder Id : " +order7.getOrderId());
        customer7.displayCustomerDetails();
        customer7.totalPrice=order1.calculateTotalPrice("Debit Card");
        customer7.payBill();

        Address address8 = new Address("P04","Nehru road","Chennai",890724);
        Customer customer8 = new Customer("C8", "Siya Chauhan", 9746578300L, address8) {
            @Override
            public double payBill(double totalPrice) {
                return 0;
            }
        };
        Food[] food8 = new Food[] {f11, f4, f2, f12, f3};
        Order order8 = new Order(food8,customer8);
        Order.orderCounter = food8.length;
        System.out.println("___________________________________");
        System.out.println("\tOrder Id : " +order8.getOrderId());
        customer8.displayCustomerDetails();
        customer8.totalPrice=order1.calculateTotalPrice("Paytm");
        customer8.payBill();

        System.out.println("________________________________________________________________");
        System.out.println();
        System.out.println("Total number of orders placed by all Customers are: "+(food1.length+food2.length+food3.length+food4.length+food5.length+food6.length+food7.length+food8.length));
        System.out.println("________________________________________________________________");
    }

    public abstract double payBill(double totalPrice);
}
