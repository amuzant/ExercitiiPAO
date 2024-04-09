package model;

public enum Currency {
    RON("Romania","RO"),
    EUR("Uniunea Europeana","UE"),
    USD("United States of America","US"),
    GBP("United Kingdom","UK"),
    TRY("Turkey","TR");

    private final String numeTara;
    private final String simbolTara;
    Currency(String numeTara, String simbolTara) {
        this.numeTara=numeTara;
        this.simbolTara=simbolTara;
    }

    public String getNumeTara() {
        return numeTara;
    }

    public String getSimbolTara() {
        return simbolTara;
    }
}
