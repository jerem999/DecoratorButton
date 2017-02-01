import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class DecoratorWindowTest extends JFrame{



    public DecoratorWindowTest() {
        this.setTitle("Decorator");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        // mise en forme du component
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weightx = 1;
        gbc.weighty = 1;

        // bouton test
        gbc.gridx = 0;                                              // position en x dans la grille
        gbc.gridy = 0;                                              // position en y dans la grille
        gbc.gridwidth = 1;                                          // nombre de colonnes occupées par le composant
        gbc.gridheight = 1;
        TestButton[] btn = {new TestButton("Test Button")};

        // nombre de lignes occupées par le composant


        panel.add(btn[0], gbc);
        //btn[0] = new Button2(btn[0]).get();

        // bouton 1
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        JButton Button1 = new JButton("Button 1");
        panel.add(Button1, gbc);
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn[0] = new Button1(btn[0]).get();
            }
        });



        // bouton 2
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        JButton Button2 = new JButton("Button 2");
        panel.add(Button2, gbc);
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn[0] = new Button2(btn[0]).get();
            }
        });

        // bouton 3
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        JButton Button3 = new JButton("Button 3");
        panel.add(Button3, gbc);
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn[0] = new Button3(btn[0]).get();
            }
        });


        this.getContentPane().add(panel);
        this.setVisible(true);


    }











    public static void main(String args[]){
        new DecoratorWindowTest();
    }

}

