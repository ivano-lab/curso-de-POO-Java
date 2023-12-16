package ProjetoLivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Ívano", 35, "M");
        p[1] = new Pessoa("Hadassah", 0, "F");

        l[0] = new Livro("Java para Leigos", "Professor Guanabara", 900, 0, false, p[0]);
        l[1] = new Livro("Java para Ninjas", "Professor Pardal", 600, 0, false, p[1]);
        l[2] = new Livro("JavaScript para Leigos", "Professor Fontes", 400, 0, false, p[0]);

        System.out.println(l[0].detalhes());
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        for(int c = 0; c < 30; c++) {
            l[0].avancarPag();
        }
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        l[1].folhear(800);
        System.out.println(l[1].detalhes());

    }
}
