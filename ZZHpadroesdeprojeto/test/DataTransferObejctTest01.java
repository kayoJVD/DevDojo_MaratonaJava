package DevDojoExercicios.ZZHpadroesdeprojeto.test;

import DevDojoExercicios.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObejctTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder().
                firstName("Kayo")
                .lastName("Santana")
                .build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();
        System.out.println(reportDto);

    }
}
