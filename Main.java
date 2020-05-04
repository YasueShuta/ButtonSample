import javax.swing.*;
import java.awt.event.*;

public class Main {
  public static void main(String[] args) {
    // creating instance of JFrame
    JFrame f = new JFrame();

    // creating instance of JButton, JLabel
    JButton b = new JButton("Click me!");
    JLabel l = new JLabel("Hello!");

    // x axis, y axis, width, height
    b.setBounds(80, 100, 250, 40);
    l.setBounds(80, 30, 250, 40);

    // add event listener
    b.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(l.getText());
      }
    });

    // add button to JFrame
    f.add(b);
    f.add(l);

    f.setSize(400, 500);
    f.setLayout(null);
    // make the frame visible
    f.setVisible(true);
  }
}