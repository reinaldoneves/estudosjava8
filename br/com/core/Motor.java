package br.com.core;

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
