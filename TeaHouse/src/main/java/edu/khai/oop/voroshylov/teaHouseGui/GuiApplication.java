package edu.khai.oop.voroshylov.teaHouseGui;

import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Tea;
import edu.khai.oop.voroshylov.teaClasses.ShuPuerhTangerine;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiApplication extends JFrame {

    private JButton button = new JButton("Masala");

    public GuiApplication(){

        super("Це ЧАЙка");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener{

        private static final Logger logger = Logger.getLogger(
                ButtonEventListener.class);

        public void actionPerformed (ActionEvent e){
            Tea tea2 = new ShuPuerhTangerine();
            String message = "";
            logger.info(tea2.getDescription() + tea2.cost() + " UAH.");
            message += tea2.getDescription() + tea2.cost() + " UAH.";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
