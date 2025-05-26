package Model.Questao4;

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new CartaoCredito(),
                new Boleto(),
                new Pix()
        };

        for (Pagamento p : pagamentos) {
            p.processar(100.0);
        }
    }
}
