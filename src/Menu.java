import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Menu {
    private BufferedImage m_menuBackground;
    private BufferedImage m_nowaGraGreen;
    private BufferedImage m_nowaGraRed;
    private BufferedImage m_wczytajGreGreen;
    private BufferedImage m_wczytajGreRed;
    private BufferedImage m_opcjeGreen;
    private BufferedImage m_opcjeRed;
    private BufferedImage m_wyjdzGreen;
    private BufferedImage m_wyjdzRed;

    private Image m_nowaGra;
    private Image m_wczytajGre;
    private Image m_opcje;
    private Image m_wyjdz;

    private GameFrame m_frame;

    Menu(GameFrame frame) throws IOException {

        this.m_frame = frame;


        this.m_menuBackground = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\Menu\\SpaceBackground.png"));
        this.m_nowaGraGreen = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\Menu\\StartGreen.png"));
        this.m_nowaGraRed = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\Menu\\StartRed.png"));
        this.m_wczytajGreGreen = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\Menu\\LoadGreen.png"));
        this.m_wczytajGreRed = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\Menu\\LoadRed.png"));
        this.m_opcjeGreen = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\Menu\\OptionGreen.png"));
        this.m_opcjeRed = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\Menu\\OptionRed.png"));
        this.m_wyjdzGreen = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\Menu\\ExitGreen.png"));
        this.m_wyjdzRed = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\Menu\\ExitRed.png"));

        this.m_nowaGra = this.m_nowaGraRed;
        this.m_wczytajGre = this.m_wczytajGreRed;
        this.m_opcje = this.m_opcjeRed;
        this.m_wyjdz = this.m_wyjdzRed;
    }

    public Image getBackground(){
        return this.m_menuBackground;
    }
    public Image getNowaGra(){
        return this.m_nowaGra;
    }
    public Image getWczytajGre(){
        return this.m_wczytajGre;
    }
    public Image getOpcje(){
        return this.m_opcje;
    }
    public Image getWyjdz(){
        return this.m_wyjdz;
    }
    public void setNowaGra(Image image){
        this.m_nowaGra = image;
    }
    public void setWczytajGre(Image image){
        this.m_wczytajGre = image;
    }
    public void setOpcje(Image image){
        this.m_opcje = image;
    }
    public void setWyjdz(Image image){
        this.m_wyjdz = image;
    }


    public void Update(int x, int y, boolean mouseClicked){
        if(this.m_frame.getScene() == 1){
            if(x >= 400 && x <= (400 + 400) && y >= 200 && y <= (200 + 100)) {
                this.setNowaGra(this.m_nowaGraGreen);
                if(mouseClicked){
                    this.m_frame.setScene(2);
                }
            }else {
                this.setNowaGra(this.m_nowaGraRed);
            }
            if(x >= 400 && x <= (400 + 400) && y > 300 && y <= (300 + 100)) {
                this.setWczytajGre(this.m_wczytajGreGreen);
            }else {
                this.setWczytajGre(this.m_wczytajGreRed);
            }
            if(x >= 400 && x <= (400 + 400) && y > 400 && y <= (400 + 100)) {
                this.setOpcje(this.m_opcjeGreen);
            }else {
                this.setOpcje(this.m_opcjeRed);
            }
            if(x >= 400 && x <= (400 + 400) && y > 500 && y <= (500 + 100)) {
                this.setWyjdz(this.m_wyjdzGreen);
                if(mouseClicked){
                    this.m_frame.dispatchEvent(new WindowEvent(this.m_frame, WindowEvent.WINDOW_CLOSING));
                }
            }else {
                this.setWyjdz(this.m_wyjdzRed);
            }
        }
    }
}

