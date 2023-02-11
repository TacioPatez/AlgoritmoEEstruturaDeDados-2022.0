public class Cilindro extends Circulo {
    private Double altura;

    public Cilindro() {
        setRaio(0.0);
        setAltura(0.0);
    }

    public Cilindro(int a, int b, Double r, Double h){
        super(a,b,r);
        setAltura(h);
    }

    public void setRaio(Double r) {
        super.setRaio(r);
    }

    public void setAltura(Double h) {
        altura = h;
    }

    public Double getRaio() {
        return super.getRaio();
    }

    public Double getAltura() {
        return altura;
    }

    public Double areaCilindro() {
        Double a;
        a = 2 * super.areaCirculo() + 2 * Math.PI * super.getRaio() * altura;
        return a;
    }

    public Double volumeCilindro(){
        Double a;
        a = super.areaCirculo() * altura;
        return a;
    }

    public String toString() {
        String res;
        res = "Centro " + super.toString() + " Raio " + super.getRaio() + " Altura: " + altura;
        return res;
    }
}