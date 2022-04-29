package br.com.core;

/**Thread sem Lambda*
 */
public class ThreadSemLambda {

    Runnable r = new Runnable() {
        public void run() {
            System.out.println("Thread com classer interna!");
        }
    };

    public void start() {
        new Thread(r).start();
    }

}
