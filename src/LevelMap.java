import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LevelMap {
    private final BufferedImage l_background;
    private BufferedImage l_level1;
    private BufferedImage l_level2;
    private BufferedImage l_level3;
    private BufferedImage l_level4;
    private BufferedImage l_level5;

    private final BufferedImage l_Info1;
    private final BufferedImage l_Info2;
    private final BufferedImage l_Info3;
    private final BufferedImage l_Info4;
    private final BufferedImage l_Info5;
    private BufferedImage l_Kart1;
    private BufferedImage l_Kart2;
    private BufferedImage l_Kart3;
    private BufferedImage l_Kart4;
    private BufferedImage l_Kart5;

    private final BufferedImage l_arrowRed;
    private final BufferedImage l_arrowGreen;
    private final BufferedImage l_arrowBlue;
    private final BufferedImage l_arrowPurple;
    private BufferedImage l_arrow;
    private int arrowPosX;
    private int arrowPosY;


    private final BufferedImage l_nothing;

    private final BufferedImage l_blueLevel;
    private final BufferedImage l_whiteLevel;

    private final BufferedImage l_powrotGreen;
    private final BufferedImage l_powrotRed;
    private BufferedImage l_powrot;

    private final GameFrame l_frame;

    private final BufferedImage l_startGreen;
    private final BufferedImage l_startRed;
    private BufferedImage l_startImage;
    private boolean l_start;

    LevelMap(GameFrame frame) throws IOException {
        this.l_frame = frame;
        this.arrowPosX = 100;
        this.arrowPosY = 200;
        this.l_start = false;

        this.l_background = ImageIO.read(new File("rsc\\LevelMap\\Background.png"));
        this.l_level1 = ImageIO.read(new File("rsc\\LevelMap\\blue.png"));
        this.l_level2 = ImageIO.read(new File("rsc\\LevelMap\\blue.png"));
        this.l_level3 = ImageIO.read(new File("rsc\\LevelMap\\blue.png"));
        this.l_level4 = ImageIO.read(new File("rsc\\LevelMap\\blue.png"));
        this.l_level5 = ImageIO.read(new File("rsc\\LevelMap\\blue.png"));
        this.l_Info1 = ImageIO.read(new File("rsc\\LevelMap\\KartaInfo1.png"));
        this.l_Info2 = ImageIO.read(new File("rsc\\LevelMap\\KartaInfo2.png"));
        this.l_Info3 = ImageIO.read(new File("rsc\\LevelMap\\KartaInfo3.png"));
        this.l_Info4 = ImageIO.read(new File("rsc\\LevelMap\\KartaInfo4.png"));
        this.l_Info5 = ImageIO.read(new File("rsc\\LevelMap\\KartaInfo5.png"));
        this.l_nothing = ImageIO.read(new File("rsc\\LevelMap\\Nothing.png"));
        this.l_Kart1 = ImageIO.read(new File("rsc\\LevelMap\\Nothing.png"));
        this.l_Kart2 = ImageIO.read(new File("rsc\\LevelMap\\Nothing.png"));
        this.l_Kart3 = ImageIO.read(new File("rsc\\LevelMap\\Nothing.png"));
        this.l_Kart4 = ImageIO.read(new File("rsc\\LevelMap\\Nothing.png"));
        this.l_Kart5 = ImageIO.read(new File("rsc\\LevelMap\\Nothing.png"));

        this.l_arrowRed =   ImageIO.read(new File("rsc\\LevelMap\\strzalkaRed.png"));
        this.l_arrowGreen = ImageIO.read(new File("rsc\\LevelMap\\strzalkaGreen.png"));
        this.l_arrowBlue =  ImageIO.read(new File("rsc\\LevelMap\\strzalkaBlue.png"));
        this.l_arrowPurple =ImageIO.read(new File("rsc\\LevelMap\\strzalkaPurple.png"));

        this.l_blueLevel = ImageIO.read(new File("rsc\\LevelMap\\blue.png"));
        this.l_whiteLevel = ImageIO.read(new File("rsc\\LevelMap\\white.png"));

        this.l_powrotGreen = ImageIO.read(new File("rsc\\HeroCardMenu\\BackGreen.png"));
        this.l_powrotRed = ImageIO.read(new File("rsc\\HeroCardMenu\\BackRed.png"));

        this.l_startGreen = ImageIO.read(new File("rsc\\LevelMap\\StartGreen.png"));
        this.l_startRed = ImageIO.read(new File("rsc\\LevelMap\\StartRed.png"));

        this.l_powrot = this.l_powrotRed;
    }

    public Image getBackground() {
        return this.l_background;
    }

    public Image getLevel1() {
        return this.l_level1;
    }

    public Image getLevel2() {
        return this.l_level2;
    }

    public Image getLevel3() {
        return this.l_level3;
    }

    public Image getLevel4() {
        return this.l_level4;
    }

    public Image getLevel5() {
        return this.l_level5;
    }

    public Image getPowrot() {
        return this.l_powrot;
    }

    public Image getKart1(){
        return this.l_Kart1;
    }
    public Image getKart2(){
        return this.l_Kart2;
    }
    public Image getKart3(){
        return this.l_Kart3;
    }
    public Image getKart4(){
        return this.l_Kart4;
    }
    public Image getKart5(){
        return this.l_Kart5;
    }

    public void setArrow(String arrow){
        if(arrow.equals("Red")){
            this.l_arrow = this.l_arrowRed;
        }
        if(arrow.equals("Green")){
            this.l_arrow = this.l_arrowGreen;
        }
        if(arrow.equals("Blue")){
            this.l_arrow = this.l_arrowBlue;
        }
        if(arrow.equals("Purple")){
            this.l_arrow = this.l_arrowPurple;
        }

    }
    public Image getArrow(){
        return this.l_arrow;
    }
    public int getArrowPosX(){
        return this.arrowPosX;
    }
    public int getArrowPosY() {
        return this.arrowPosY;
    }
    public Image getStartImage(){
        return this.l_startImage;
    }
    public boolean getStart(){
        return this.l_start;
    }



    public void UpdateLevelMap(int x, int y, boolean mouseClicked) {
        if (this.l_frame.getScene() == 3) {

            if (x >= 100 && x <= (100 + 100) && y >= 300 && y <= (300 + 100)) {
                this.l_level1 = this.l_whiteLevel;
                this.l_Kart1 = this.l_Info1;
                if(mouseClicked){
                    //this.l_frame.setScene(4);
                    this.arrowPosX = 100;
                    this.arrowPosY = 200;
                    this.l_start = true;
                }
            } else {
                this.l_level1 = this.l_blueLevel;
                this.l_Kart1 = this.l_nothing;
            } if (x >= 300 && x <= (300 + 100) && y > 500 && y <= (500 + 100)) {
                this.l_level2 = this.l_whiteLevel;
                this.l_Kart2 = this.l_Info2;
                if(mouseClicked){
                    //this.l_frame.setScene(4);
                    this.arrowPosX = 300;
                    this.arrowPosY = 400;
                    this.l_start = true;
                }
            } else {
                this.l_level2 = this.l_blueLevel;
                this.l_Kart2 = this.l_nothing;
            } if (x >= 600 && x <= (600 + 100) && y > 500 && y <= (500 + 100)) {
                this.l_level3 = this.l_whiteLevel;
                this.l_Kart3 = this.l_Info3;
                if(mouseClicked){
                    //this.l_frame.setScene(4);
                    this.l_start = true;
                    this.arrowPosX = 600;
                    this.arrowPosY = 400;
                }
            } else {
                this.l_level3 = this.l_blueLevel;
                this.l_Kart3 = this.l_nothing;
            } if (x >= 700 && x <= (700 + 100) && y > 100 && y <= (100 + 100)) {
                this.l_level4 = this.l_whiteLevel;
                this.l_Kart4 = this.l_Info4;
                if(mouseClicked){
                    //this.l_frame.setScene(4);
                    this.arrowPosX = 700;
                    this.arrowPosY = 0;
                    this.l_start = true;
                }
            } else {
                this.l_level4 = this.l_blueLevel;
                this.l_Kart4 = this.l_nothing;
            }
            if (x >= 1000 && x <= (1000 + 100) && y > 200 && y <= (200 + 100)) {
                this.l_level5 = this.l_whiteLevel;
                this.l_Kart5 = this.l_Info5;
                if(mouseClicked){
                    //this.l_frame.setScene(4);
                    this.arrowPosX = 1000;
                    this.arrowPosY = 100;
                    this.l_start = true;
                }
            } else {
                this.l_level5 = this.l_blueLevel;
                this.l_Kart5 = this.l_nothing;
            }
            if (x >= 500 && x <= (500 + 400) && y > 620 && y <= (620 + 100)) {
                this.l_powrot = this.l_powrotGreen;
                if (mouseClicked) {
                    this.l_frame.setScene(2);
                }
            } else {
                this.l_powrot = this.l_powrotRed;
            }
            if(this.l_start){
                if(x >= 270 && x <= (270 + 400) && y > 170 && y <= (170 + 100)){
                    this.l_startImage = this.l_startGreen;
                    if (mouseClicked) {
                        this.l_frame.setScene(4);
                    }
                }else{
                    this.l_startImage = this.l_startRed;
                }
            }
        }
    }
}
