package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private DiscountStrategy discountStrategy;

    public CustomerOrder(String customerName, double billAmount, DiscountStrategy discountStrategy) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountStrategy = discountStrategy;
    }

    public double getBillAmount() {
        return discountStrategy.applyDiscount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountStrategy.getClass().getSimpleName()
                + '}';
    }
}
