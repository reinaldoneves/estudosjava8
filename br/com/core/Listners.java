package br.com.core;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listners {

    static JButton button = new JButton();

    static JButton button2 = new JButton();

    public static void main(String[] args) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("O botão foi pressionado!");
                //Realiza alguma ação quando o botão for pressionado
            }
        });

        button2.addActionListener( (e) -> {
            System.out.println("O botão foi pressionado, e o código executado utiliza uma função lambda!");
            //Realiza alguma ação quando o botão for pressionado
        });

    }



}
