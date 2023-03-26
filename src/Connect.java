import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Connect  {

    private JTextField c_textField;
    private GameFrame c_frame;
    private JButton c_button;
    private String c_ip;

    private BufferedImage c_background;
    Connect(GameFrame frame) throws IOException {
        this.c_frame = frame;
        this.c_background = ImageIO.read(new File("rsc\\Gameplay\\Background.png"));
        this.c_button = new JButton("Connect");
        this.c_button.setBounds(100,100,400,100);
        this.c_textField = new JTextField("Enter IP",16);
        this.c_textField.setBounds(400,400,400,100);
        this.c_frame.add(this.c_button);
        this.c_frame.add(this.c_textField);
        this.c_textField.setVisible(false);
        this.c_button.setVisible(false);
    }
    public void Enable(){
        this.c_button.setVisible(true);
        this.c_textField.setVisible(true);
    }
    public void Disable(){
        this.c_textField.setVisible(false);
        this.c_button.setVisible(false);
    }
    public Image getBackground(){
        return this.c_background;
    }
    public JButton getButton(){
        return this.c_button;
    }
    public JTextField getTextField(){
        return this.c_textField;
    }

    public void Update(ActionEvent e){
        this.c_ip = e.getActionCommand();
        System.out.println("IP: " + this.c_ip);
    }
}
