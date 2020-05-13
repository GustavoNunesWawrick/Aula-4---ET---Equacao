
/**
 *
 * @author Gustavo Nunes Wawrick
 */
public class Equacao {

    private int a;
    private int b;

    public Equacao() {
        a = 0;
        b = 0;
    }

    public Equacao(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double calculaResultado() {
        double resultado = 0;
        resultado = (-b) / (a * 1.0);
        return resultado;
    }

    public void exibeEquacao() {
        System.out.println(a + "x+" + b + "=0");
    }
}
