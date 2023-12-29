package heranca;

public class Bolsista extends Aluno {
    private float bolsa;
    public void renovaBolsa() {
        System.out.println("Bolsa do aluno " + this.nome + " renovada!");
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
