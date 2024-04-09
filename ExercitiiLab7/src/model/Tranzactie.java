package model;

public class Tranzactie extends ConversieCalculImpl implements Cloneable {
    private int id;
    private Payment payment;
    private Currency currency;
    private float amount;
    private int refNmb;

    @Override
    public float conversieValutaToEur(Currency currency, float value)
    {
        switch(currency)
        {
            case EUR -> {
                return value;
            }
            case GBP ->
            {
                return 1.17f*value;
            }
            case RON ->
            {
                return 0.2f*value;
            }
            case TRY ->
            {
                return 0.029f*value;
            }
            case USD ->
            {
                return 0.92f*value;
            }
            case null, default -> throw new IllegalStateException("Currency invalid.");
        }
    }

    public Tranzactie(int id, Payment payment) {
        this.id = id;
        this.payment = payment;
        this.currency=Currency.EUR;
        this.amount=conversieValutaToEur(this.currency, payment.getAmount());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getRefNmb() {
        return refNmb;
    }

    public void setRefNmb(int refNmb) {
        this.refNmb = refNmb;
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "id=" + id +
                ", payment=" + payment +
                ", currency=" + currency +
                ", amount=" + amount +
                ", refNmb=" + refNmb +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Tranzactie clona=(Tranzactie) super.clone();
        clona.setPayment((Payment) clona.getPayment().clone());
        return clona;
    }
}
