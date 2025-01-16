package DevDojoExercicios.Rdatas.Test.Exercicios.Dominio;

public enum Pagamento {
    CREDITO{
        @Override
        public double desconto(double valor){
            return valor *0.05;
        }
    },
    DEBITO{
        @Override
        public double desconto(double valor){
            return valor  * 0.1;
        }
    },
    PIX{
        @Override
        public double desconto(double valor){
            return valor * 0.15;
        }
    };

    public abstract double desconto(double valor);

}
