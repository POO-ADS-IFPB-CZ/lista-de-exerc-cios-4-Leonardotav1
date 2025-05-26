package Model.Questao4;

public class CartaoCredito extends Pagamento {
    @Override
    public void processar(double valor) {
        double taxa = valor * 0.02;
        System.out.println("Pagamento com Cartão de Crédito: R$" + (valor + taxa));
    }
}
