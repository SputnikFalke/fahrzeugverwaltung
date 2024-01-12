package fdbwz;

import javax.swing.*;

public class fahrzeugverwaltungMainForm extends JFrame{

    private JPanel mainPanel;


    public fahrzeugverwaltungMainForm(){
        super("Fahrzeugverwaltung");

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack(); //Rendern vom Inhalt
    }

}
