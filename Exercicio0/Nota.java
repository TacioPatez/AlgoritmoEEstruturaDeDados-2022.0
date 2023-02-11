import javax.swing.JOptionPane;

public class Nota {
    public static void main(String arg[]) {
        String nota;
        String result;
        Double n1, n2, n3, media;
            nota = JOptionPane.showInputDialog("Digite a primeira nota");
                n1 = Double.parseDouble(nota);
            nota = JOptionPane.showInputDialog("Digite a segunda nota");
                n2 = Double.parseDouble(nota);
            nota = JOptionPane.showInputDialog("Digite a terceira nota");
                n3 = Double.parseDouble(nota);
                media = (n1 + n2 + n3) / 3;

        if(media >= 7){
            result = "APROVADO";
        } else {
            result = "REPROVADO";
        }
        JOptionPane.showMessageDialog(null, "A media é  " + media, result, JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}