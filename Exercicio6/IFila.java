public interface IFila {
    void fazVazia();
    boolean estaVazia();
    Object getPrimeiro() throws ContainerVazioException;
    void enfileirar(Object objeto) throws ContainerCheioException;
    Object desenfileirar() throws ContainerCheioException, ContainerVazioException;
}