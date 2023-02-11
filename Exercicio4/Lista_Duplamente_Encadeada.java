public class Lista_Duplamente_Encadeada<T> {
    private Element<T> head;
    private Element<T> tail;

    public Lista_Duplamente_Encadeada(){

    }

    //metodos
    public void fazVazia(){
        head = null;
        tail = null;
    }

    public Element<T> getHead() {
        return head;
    }

    public Element<T> getTail() {
        return tail;
    }

    public boolean estaVazia(){
        return(head == null);
    }

    public Object getPrimeiro()throws ListaVaziaException{
        if(head == null){
            throw new ListaVaziaException("Lista vazia");
        }
        return head.data;
    }

    public Object getUltimo()throws ListaVaziaException{
        if(tail == null){
            throw new ListaVaziaException("Lista vazia");
        }
        return tail.data;
    }

    //metodos de inserção
    public void inserirInicio(T item){
        Element<T> temp = new Element<T>(item, tail, head);
        if(this.head == null){
            this.head = temp;
            this.tail = temp;
        }else{
            this.head.prev = temp;
            this.head = temp;
            this.head.prev = tail;
            this.tail.next = head;
        }
    }

    public void inserirFim(T item){
        Element<T> temp = new Element<T>(item, tail, head);
        if(this.head == null){
            this.head = temp;
            this.tail = temp;
        }else{
            this.tail.next = temp;
            this.tail = temp;
            this.tail.next = head;
            this.head.prev = tail;
        }
    }

    //remover
    public void remover(T item) throws ObjetoNaoEncontradoException{
        Element<T> ptr = head;
        while(ptr != null && ptr.data != item){
            ptr = ptr.next;
        }
        if(ptr == null){
            throw new ObjetoNaoEncontradoException("Não encontrado!!!");
        }
        if(ptr == head){
            head = ptr.next;
            head.prev = null;
        }
        if(ptr == tail){
            tail = ptr.prev;
            tail.next = null;
        }else{
            (ptr.prev).next= ptr.next;
            (ptr.next).prev = ptr.prev;
        }
    }

    //classe Element
    public final class Element<K> {
        K data;
        public Element<K> next,prev;
        Element(K data, Element<K> prev, Element<K> next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        //metodos 
        public Element<K> getNext(){
            return next;
        }

        public Element<K> getPrev(){
            return prev;
        }

        public K getData(){
            return data;
        }
        
    }
    
}