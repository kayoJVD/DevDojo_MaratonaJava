package DevDojoExercicios.ZZHpadroesdeprojeto.dominio;

public interface Currency {
    String getSymbol();
}

class Real implements Currency{
    @Override
    public String getSymbol() {
        return "$";
    }
}


class UsDollar implements Currency{
    @Override
    public String getSymbol() {
        return "$";
    }
}