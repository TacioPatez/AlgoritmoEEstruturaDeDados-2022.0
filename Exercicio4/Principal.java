public class Principal {
    public static void main(String[] args) throws Exception{

        Lista_Duplamente_Encadeada lista = new Lista_Duplamente_Encadeada();

        int a=10, b=20, c=30, d=40;

        System.out.println(lista.estaVazia());
        
        lista.inserirInicio(b);
        lista.inserirInicio(a);
        lista.inserirFim(c);
        lista.inserirFim(d);

        System.out.println(lista.getPrimeiro());
        System.out.println(lista.getUltimo());

        System.out.println("2 Rodadas com todos os Elementos");
        int rodada = 0;
        for(Lista_Duplamente_Encadeada.Element ptr = lista.getHead(); rodada != 3 ; ptr = ptr.getNext()){
            System.out.println(ptr.getData());
            if(ptr == lista.getTail()){
                rodada++;
            }
        }
        
    }
}
