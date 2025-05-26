package Model.Questao5;

public class Main {
    public static void main(String[] args) {
        Personagem[] personagens = {
                new Guerreiro(),
                new Mago(),
                new Arqueiro()
        };

        System.out.println("Iniciando turno de combate...");
        for (Personagem p : personagens) {
            p.atacar();
        }
    }
}
