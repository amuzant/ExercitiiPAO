package model;

public class Payment implements Cloneable {
    private float amount;
    private Currency currency;
    private User user;
    private String purpose;

    public Payment(float amount, Currency currency, User user, String purpose) {
        this.amount = amount;
        this.currency = currency;
        this.user = user;
        this.purpose = purpose;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", currency=" + currency +
                ", user=" + user +
                ", purpose='" + purpose + '\'' +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        Payment clona=(Payment) super.clone();
        clona.setUser((User) clona.getUser().clone());
        return clona;
    }
}
