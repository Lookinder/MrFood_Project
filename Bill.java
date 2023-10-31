package info;

public class Bill {
    private static int BillId;
    private String paymentMode;

    static {
        BillId = 9001;
    }

    public Bill(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getBillId() {
        return "B"+ BillId++;
    }

    public void setBillId(String billId) {
        BillId = Integer.parseInt(billId);
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}


