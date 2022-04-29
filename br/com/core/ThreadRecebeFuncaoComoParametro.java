package br.com.core;

/*******************************************************************************
 * @author Reinaldo Neves
 * É possível passar uma função como parâmetro para outra função.
 * Nesse caso, como parâmetro para o construtor de uma nova thread.
 * Aqui tá um grande lance de mudança de paradigma no Java8
 */
public class ThreadRecebeFuncaoComoParametro {
    public static void main(String[] args) {
        new Thread(
                () -> System.out.println("Fora Bolsonaro")
        ).start();
    }
}
