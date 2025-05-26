package Model.Questao4;

public class Pix extends Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Pagamento com Pix: R$" + valor);
    }
}