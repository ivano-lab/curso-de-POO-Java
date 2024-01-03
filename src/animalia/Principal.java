package animalia;

public class Principal {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        /*
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        r.locomover();
        p.locomover();
         */

        Canguru leo = new Canguru();
        Cachorro bob = new Cachorro();
        Cobra silvia = new Cobra();
        Calango samuel = new Calango() ;
        Salmao douglas = new Salmao();
        Arara marielle = new Arara();

        leo.locomover();
        bob.locomover();
        leo.emitirSom();
        bob.emitirSom();
    }
}
