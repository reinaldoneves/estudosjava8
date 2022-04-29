package br.com.core;

/***
 * https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826
 */
public class Motor {

    public static void main(String[] args) {
        Motor m = new Motor();
        m.ligar();
    }

    private static void ligar() {
        ThreadComLambda threadComLambda = new ThreadComLambda();
        ThreadSemLambda threadSemLambda = new ThreadSemLambda();
    }
}
