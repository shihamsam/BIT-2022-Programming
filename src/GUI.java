import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JTextField userText;
    private static JPasswordField passwordText;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(300,200);;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);


        JLabel label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);

        userText = new JTextField();
        userText.setBounds(100, 20,160,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,160,25);
        panel.add(passwordText);


        JButton button = new JButton("Login");
        button.setBounds(180,100,80,25);
        button.addActionListener(new GUI());
        panel.add(button);


        JButton button2 = new JButton("Cancel");
        button2.setBounds(50,100,80,25);
        button2.addActionListener(new GUI());
        panel.add(button2);

        frame.add(panel);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand() + " " + userText.getText() + ", " + passwordText.getText());
    }
}
