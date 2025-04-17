package DevDojoExercicios.ZZHpadroesdeprojeto.test;

import DevDojoExercicios.ZZHpadroesdeprojeto.dominio.Country;
import DevDojoExercicios.ZZHpadroesdeprojeto.dominio.Currency;
import DevDojoExercicios.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol() );
    }
}
