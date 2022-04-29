package br.com.core;

/**Thread com Lambda*
 */
public class ThreadComLambda {

    public static void main(String[] args) {

        Runnable rannndandan = () -> {
            System.out.println("Thread com função lambda!");
        };
        new Thread(rannndandan).start();

    }

}
