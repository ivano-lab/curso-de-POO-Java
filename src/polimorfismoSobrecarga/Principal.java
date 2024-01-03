package polimorfismoSobrecarga;

public class Principal {
    public static void main(String[] args) {
        // programa principal
        Lobo x = new Lobo();
        x.emitirSom();
        Cachorro z = new Cachorro();
        z.emitirSom();
        z.reagir("Olá!");
        z.reagir(11, 45);
        z.reagir(19,00);
        z.reagir(true);
        z.reagir(false);
    }
}
