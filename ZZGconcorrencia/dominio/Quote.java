package DevDojoExercicios.ZZGconcorrencia.dominio;
// storeName:price:discountCode
public class Quote {
    private final String store;
    private final double price;
    private final Discount.Code discountCode;


    private Quote(String store, double price, Discount.Code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;

    }

    /**
     * Creates newQuote object from the value following the pattern storeName:price:discountCode
     * @param value containing storeName:price:discountCode
     * @return new Quote ehit values from @param value
     */
    public static Quote newQuote(String value){
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
    }
    @Override
    public String toString(){
        return "Quote{" +
                "store='" + getStore() + '\'' +
                ", price=" + getPrice() +
                ", discountCode=" + getDiscountCode() +
                '}';
    }



    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }
}
