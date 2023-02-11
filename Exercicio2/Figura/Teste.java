import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int menu = -1;
        Cilindro cilindro = new Cilindro();
        String options = "\n[1] Criar Cilindro\n[2] Área do Cilindro \n[3]Volume do Cilindro\n[0] Sair\n";

        while(menu != 0) {
            System.out.print(options);
            menu = teclado.nextInt();
            switch (menu){
                case 1:
                int x;
                int y;
                Double raio;
                Double altura;

                System.out.print("\nInforme o valor de x:");
                    x = teclado.nextInt();
                System.out.print("\nInforme o valor de y:");
                    y = teclado.nextInt();
                System.out.print("\nInforme o valor do raio:");
                    raio = teclado.nextDouble();
                System.out.print("\nInforme o valor da altura:");
                    altura = teclado.nextDouble();
                Cilindro temp = new Cilindro(x, y, raio, altura);
                    cilindro = temp;
                break;

                case 2:
                    System.out.print("\n" + cilindro.areaCilindro() + "\n");
                break;

                case 3:
                    System.out.print("\n" + cilindro.volumeCilindro() + "\n");
                break;
            }

        }
        teclado.close();
    }
}
