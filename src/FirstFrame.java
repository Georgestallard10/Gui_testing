import javax.swing.*;
import java.awt.*;

/**
 * Created by Georgestallard10 on 21/06/2016.
 */
public class FirstFrame extends JFrame {
    public static final int Height = 220;
    public static final int Width = 300;


    public static final int StandardHight = 30;

    public FirstFrame(){
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Demo First Frame");
        this.setSize(Width,Height);
        this.setLayout(null);

        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(25,30,70,StandardHight);
        this.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setName("username");
        usernameField.setBounds(105,30,145,StandardHight);
        this.add(usernameField);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(25,70,70,StandardHight);
        this.add(passwordLabel);

        JTextField passwordField = new JPasswordField();
        passwordField.setBounds(105,70,145,StandardHight);
        this.add(passwordField);
        JButton loginButton = new JButton();
        loginButton.setText("Login");
        loginButton.setBounds(100,115,100,StandardHight);
        this.add(loginButton);

        this.centreFrame();
        this.setVisible(true);
    }
    public void centreFrame(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int xPos = (dim.width/2)- (this.getSize().width);
        int yPos = (dim.width/2) - (this.getSize().height/2);
        this.setLocation(xPos,yPos);
    }

}
