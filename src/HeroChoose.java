import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HeroChoose {

    private BufferedImage h_background;
    private BufferedImage h_hero11;
    private BufferedImage h_hero21;
    private BufferedImage h_hero31;
    private BufferedImage h_hero41;
    private BufferedImage h_hero12;
    private BufferedImage h_hero22;
    private BufferedImage h_hero32;
    private BufferedImage h_hero42;
    private BufferedImage h_hero1;
    private BufferedImage h_hero2;
    private BufferedImage h_hero3;
    private BufferedImage h_hero4;
    private BufferedImage h_powrotGreen;
    private BufferedImage h_powrotRed;
    private BufferedImage h_powrot;


    private GameFrame h_frame;
    HeroChoose(GameFrame frame) throws IOException {

        this.h_frame = frame;
        this.h_background = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\HeroCardMenu\\SpaceBackground.png"));
        this.h_hero11 = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\HeroCardMenu\\Hero1.png"));
        this.h_hero21 = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\HeroCardMenu\\Hero2.png"));
        this.h_hero31 = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\HeroCardMenu\\Hero3.png"));
        this.h_hero41 = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\HeroCardMenu\\Hero4.png"));
        this.h_hero12 = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\HeroCardMenu\\Hero12.png"));
        this.h_hero22 = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\HeroCardMenu\\Hero22.png"));
        this.h_hero32 = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\HeroCardMenu\\Hero32.png"));
        this.h_hero42 = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\HeroCardMenu\\Hero42.png"));
        this.h_powrotGreen = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\HeroCardMenu\\BackGreen.png"));
        this.h_powrotRed = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\HeroCardMenu\\BackRed.png"));

        this.h_hero1 = this.h_hero11;
        this.h_hero2 = this.h_hero21;
        this.h_hero3 = this.h_hero31;
        this.h_hero4 = this.h_hero41;
        this.h_powrot = this.h_powrotRed;
    }

    public Image getBackground(){
        return this.h_background;
    }
    public Image getHero1(){
        return this.h_hero1;
    }
    public Image getHero2(){
        return this.h_hero2;
    }
    public Image getHero3(){
        return this.h_hero3;
    }
    public Image getHero4(){
        return this.h_hero4;
    }
    public Image getPowrot(){
        return this.h_powrot;
    }

    public void UpdateHeroChoose(int x, int y, boolean mouseClicked)  {
        if(this.h_frame.getScene() == 2){
            if(x >= 50 && x <= (50 + 283) && y >= 200 && y <= (200 + 401)) {
                this.h_hero1 = h_hero12;
                if(mouseClicked){
                    this.h_frame.setScene(3);
                    this.h_frame.setHero("Red");
                    this.h_frame.setArrow("Red");
                }
            }else {
                this.h_hero1 = h_hero11;
            }
            if(x >= 383 && x <= (383 + 283) && y > 200 && y <= (200 + 401)) {
                this.h_hero2 = h_hero22;
                if(mouseClicked){
                    this.h_frame.setScene(3);
                    this.h_frame.setHero("Blue");
                    this.h_frame.setArrow("Blue");
                }
            }else {
                this.h_hero2 = h_hero21;
            }
            if(x >= 716 && x <= (716 + 283) && y > 200 && y <= (200 + 401)) {
                this.h_hero3 = h_hero32;
                if(mouseClicked){
                    this.h_frame.setScene(3);
                    this.h_frame.setHero("Green");
                    this.h_frame.setArrow("Green");
                }
            }else {
                this.h_hero3 = h_hero31;
            }
            if(x >= 1049 && x <= (1049 + 283) && y > 200 && y <= (200 + 401)) {
                this.h_hero4 = h_hero42;
                if(mouseClicked){
                    this.h_frame.setScene(3);
                    this.h_frame.setHero("Purple");
                    this.h_frame.setArrow("Purple");
                }
            }else {
                this.h_hero4 = h_hero41;
            }
            if(x >= 500 && x <= (500 + 400) && y > 620 && y <= (620 + 100)){
                this.h_powrot = this.h_powrotGreen;
                if(mouseClicked){
                    this.h_frame.setScene(1);
                }
            }else{
                this.h_powrot = this.h_powrotRed;
            }
        }
    }
}
