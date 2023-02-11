public class FakeArray {
    private Object[] data; // Array Object
    private int base; // array length

    //Constructors
    public FakeArray(int tam, int lim){
        data = new Object [tam];
        base = lim;
    }

    public FakeArray(){
        this(0,0);
    }

    public FakeArray(int tam){
        this(tam,0);
    }

    //Methods
    public void assign(FakeArray a){ //Métodos de atribuir um array a outro.
        if(a!=this){ // se Vetor1 == Vetor2, não tem pq fazer perder tempo
            if(data.length != a.data.length){ //Se o vetor1 tiver menos Valores que o vetor2, será aumentado o tamanho
                data = new Object [a.data.length];
            }
            for (int i = 0; i < data.length; i++){
                data[i] = a.data[i];
            }
            base = a.base;
        }
    }

    public Object getData(){ // Métodos de Acesso
        return data;
    }

    public int getBase(){
        return base;
    }

    public int getLength(){
        return data.length;
    }

    public Object getElemento(int posicao){ // Indexação de Array
        return data[posicao-base];
    }

    public void setElemento(int posicao, Object o){
        data[posicao - base] = o;
    }

    public void setBase(int b){
        base = b;
    }

    public void setLength(int newTam){ // Redimensionamento de Array
        Object[] newData = new Object[newTam];
        int min = data.length < newTam ? data.length : newTam;
            for(int i = 0; i < min; i++){ // passa os valores para o novo espaco na memoria
                newData[i] = data[i];
            }
        data = newData; // Muda o endereço de data para o endereco novo, pois 
    }
}

