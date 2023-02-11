public class Principal {
    public static void main(String[] args) throws Exception{
        
        ListaEncadeada lista = new ListaEncadeada();
        ListaEncadeada lista2 = new ListaEncadeada();

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 4;

        System.out.println(lista.estaVazia());  
        try{
            lista.getPrimeiro();
        } catch(ListaVaziaException e){
            System.out.println("Lista está vazia!");
        }

        lista.inserirInicio(c);
        lista.inserirInicio(b);
        lista.inserirInicio(a);
        lista.inserirFim(d);

        System.out.println("GetPrimeiro - GetUltimo");
        System.out.println(lista.getPrimeiro());
        System.out.println(lista.getUltimo());

        System.out.println("GetHead - GetTail");
        System.out.println(lista.getHead());
        System.out.println(lista.getTail());

        System.out.println("Valores da lista1");
        for(ListaEncadeada.Element ptr = lista.getHead(); ptr != null; ptr = ptr.getNext()){
            System.out.println(ptr.getData());
        }

            lista.extrair(c);

        System.out.println("Extraido C");

        for(ListaEncadeada.Element ptr = lista.getHead(); ptr != null; ptr = ptr.getNext()){
            System.out.println(ptr.getData());
        }

        lista2.atribuir(lista);

        System.out.println("Lista 2");
        for(ListaEncadeada.Element ptr = lista2.getHead(); ptr != null; ptr = ptr.getNext()){
            System.out.println(ptr.getData());
        }


    }
}
