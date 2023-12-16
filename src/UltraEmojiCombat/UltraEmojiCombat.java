package UltraEmojiCombat;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Jacaré", "Brasil", 31, 1.75f, 55.5f, 14, 2, 3);
        l[1] = new Lutador("Eliabe", "Brasil", 21, 1.80f, 65.3f, 20, 0, 1);
        l[2] = new Lutador("Mutante", "Brasil", 32, 1.70f, 99.8f, 14, 3, 1);
        l[3] = new Lutador("Minotauro", "Brasil", 21, 1.80f, 100.5f, 12, 5, 2);
        l[4] = new Lutador("Vitor Belfort", "Brasil", 21, 1.80f, 70.5f, 16, 1, 0);
        l[5] = new Lutador("José Aldo", "Brasil", 21, 1.80f, 70.5f, 17, 1, 2);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2], l[3]);
        UEC01.lutar();
    }
}
