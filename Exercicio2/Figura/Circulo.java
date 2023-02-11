public class Circulo extends Ponto {
    private Double raio;

    public Circulo() {
        setRaio(0.0);
    }

    public Circulo(int a, int b, Double r) {
        super(a, b);
        setRaio(r);
    }

    public void setRaio(Double r) {
        raio = r;
    }

    public Double getRaio() {
        return raio;
    }

    public Double areaCirculo() {
        Double a;
        a = Math.PI * raio * raio;
        return a;
    }

    public String toString() {
        String res;
        res = "Centro " + super.toString() + "Raio " + raio;
        return res;
    }
}