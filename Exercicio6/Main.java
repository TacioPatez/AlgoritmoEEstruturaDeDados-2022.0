public class Main {
    public static void main(String[] args) throws Exception{
        IFila fila = new FilaArray(4);
        fila.enfileirar(5);
        fila.enfileirar(6);
        fila.enfileirar(7);
        fila.enfileirar(3);
        System.out.println(fila.desenfileirar());

        System.out.println(fila.toString());
    }
}
