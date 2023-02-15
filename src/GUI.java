import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private  JLabel label;
    private JButton button;

    public GUI(){

        frame = new JFrame();
        button = new JButton("Click Me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our Demo GUI");
        frame.pack();
        frame.setVisible(true);


    }
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        count++;
        label.setText("Number of clicks " + count);
    }
}
