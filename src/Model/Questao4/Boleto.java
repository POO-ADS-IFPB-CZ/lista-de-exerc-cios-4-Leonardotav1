package Model.Questao4;

public class Boleto extends Pagamento {
    @Override
    public void processar(double valor) {
        double desconto = valor * 0.05;
        System.out.println("Pagamento com Boleto: R$" + (valor - desconto));
    }
}