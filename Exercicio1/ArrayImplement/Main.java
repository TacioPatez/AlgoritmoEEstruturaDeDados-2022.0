import java.lang.reflect.Array;

public class Main {
    public static void main (String[] args) throws Exception{
        int bigLength = 10, littleLength = 5;
        FakeArray vetor1 = new FakeArray(); // nenhum valor setado na base e tamanho.


        //Checkando Atributos do vetor1.
            System.out.println("Base: " + vetor1.getBase());
            System.out.println("Tamanho: " + vetor1.getLength());

        //Redimensionando vetor1
            vetor1.setLength(bigLength);
        //Set os valores da base do vetor1
            vetor1.setBase(0); // vou deixar a base com valor 0 mesmo pra não ter muita lambanca. LOL
        //Set os Valores dentro do Array
            for(int i = 0; i < vetor1.getLength(); i++)
                vetor1.setElemento(i, i);

        //Checkando Atributos do vetor1 novamente pra confirmar os Sets.
            System.out.println("Base: " + vetor1.getBase());
            System.out.println("Tamanho: " + vetor1.getLength());

            System.out.print("Elementos vetor1:");
            for(int i = 0; i < vetor1.getLength(); i++)
                System.out.print(vetor1.getElemento(i) + " - ");
        //Check

        FakeArray vetor2 = new FakeArray(bigLength,0); // Criando outro vetor com mesmo tamanho do vetor1
            for(int i = vetor2.getLength()-1, j= 0; i>=0; i--,j++)
                vetor2.setElemento(i,j);

        //Checkando Valores do novo Vetor...
        System.out.print("\nElementos vetor2:");
        for(int i = 0; i < vetor2.getLength(); i++)
            System.out.print(vetor2.getElemento(i) + " - ");

        //Passando valores do vetor 2 para o vetor1 - Assign
            vetor1.assign(vetor2);

        //Checkando Assign
        System.out.print("\nElementos vetor1 depois do Assign: ");
            for(int i = 0; i < vetor1.getLength(); i++)
                System.out.print(vetor1.getElemento(i) + " - ");

        //Redimensionando vetor1
        vetor1.setLength(littleLength);

        //Checkando vetor1 redimensionado
        System.out.print("\nElementos vetor1 depois de Redimensionar: ");
        for(int i = 0; i < vetor1.getLength(); i++)
            System.out.print(vetor1.getElemento(i) + " - ");

        System.out.print("\n\nThat's All Folks!");
    }
}
