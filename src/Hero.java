import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hero {
    private BufferedImage h_Hero1Card1;
    private BufferedImage h_Hero1Card2;
    private BufferedImage h_Hero1Card3;
    private BufferedImage h_Hero1Card4;

    private BufferedImage h_Hero1Card1mala;
    private BufferedImage h_Hero1Card2mala;
    private BufferedImage h_Hero1Card3mala;
    private BufferedImage h_Hero1Card4mala;

    private BufferedImage h_Hero2Card1;
    private BufferedImage h_Hero2Card2;
    private BufferedImage h_Hero2Card3;
    private BufferedImage h_Hero2Card4;

    private BufferedImage h_Hero2Card1mala;
    private BufferedImage h_Hero2Card2mala;
    private BufferedImage h_Hero2Card3mala;
    private BufferedImage h_Hero2Card4mala;

    private BufferedImage h_Hero3Card1;
    private BufferedImage h_Hero3Card2;
    private BufferedImage h_Hero3Card3;
    private BufferedImage h_Hero3Card4;

    private BufferedImage h_Hero3Card1mala;
    private BufferedImage h_Hero3Card2mala;
    private BufferedImage h_Hero3Card3mala;
    private BufferedImage h_Hero3Card4mala;

    private BufferedImage h_Hero4Card1;
    private BufferedImage h_Hero4Card2;
    private BufferedImage h_Hero4Card3;
    private BufferedImage h_Hero4Card4;

    private BufferedImage h_Hero4Card1mala;
    private BufferedImage h_Hero4Card2mala;
    private BufferedImage h_Hero4Card3mala;
    private BufferedImage h_Hero4Card4mala;

    private BufferedImage h_Card1;
    private BufferedImage h_Card2;
    private BufferedImage h_Card3;
    private BufferedImage h_Card4;

    private BufferedImage h_Card1mala;
    private BufferedImage h_Card2mala;
    private BufferedImage h_Card3mala;
    private BufferedImage h_Card4mala;

    private BufferedImage h_ActualCard1;
    private BufferedImage h_ActualCard2;
    private BufferedImage h_ActualCard3;
    private BufferedImage h_ActualCard4;

    private BufferedImage h_ActualCard1mala;
    private BufferedImage h_ActualCard2mala;
    private BufferedImage h_ActualCard3mala;
    private BufferedImage h_ActualCard4mala;

    private BufferedImage h_ImageHealt;
    private BufferedImage h_ImageMana;

    private int h_healt;
    private int h_mana;
    private int h_fuel;

    private BufferedImage h_nothing;
    String h_hero;
    private GameFrame h_frame;

    Hero(GameFrame frame) throws IOException {
        this.h_frame = frame;
        this.h_healt = 100;
        this.h_mana = 10;
        this.h_Hero1Card1 = ImageIO.read(new File("rsc\\Hero\\Bohater1Karta1.png"));
        this.h_Hero1Card2 = ImageIO.read(new File("rsc\\Hero\\Bohater1Karta1.png"));
        this.h_Hero1Card3 = ImageIO.read(new File("rsc\\Hero\\Bohater1Karta1.png"));
        this.h_Hero1Card4 = ImageIO.read(new File("rsc\\Hero\\Bohater1Karta1.png"));

        this.h_Hero1Card1mala = ImageIO.read(new File("rsc\\Hero\\Bohater1Karta1mala.png"));
        this.h_Hero1Card2mala = ImageIO.read(new File("rsc\\Hero\\Bohater1Karta1mala.png"));
        this.h_Hero1Card3mala = ImageIO.read(new File("rsc\\Hero\\Bohater1Karta1mala.png"));
        this.h_Hero1Card4mala = ImageIO.read(new File("rsc\\Hero\\Bohater1Karta1mala.png"));

        this.h_Hero2Card1 = ImageIO.read(new File("rsc\\Hero\\Bohater2Karta1.png"));
        this.h_Hero2Card2 = ImageIO.read(new File("rsc\\Hero\\Bohater2Karta1.png"));
        this.h_Hero2Card3 = ImageIO.read(new File("rsc\\Hero\\Bohater2Karta1.png"));
        this.h_Hero2Card4 = ImageIO.read(new File("rsc\\Hero\\Bohater2Karta1.png"));

        this.h_Hero2Card1mala = ImageIO.read(new File("rsc\\Hero\\Bohater2Karta1mala.png"));
        this.h_Hero2Card2mala = ImageIO.read(new File("rsc\\Hero\\Bohater2Karta1mala.png"));
        this.h_Hero2Card3mala = ImageIO.read(new File("rsc\\Hero\\Bohater2Karta1mala.png"));
        this.h_Hero2Card4mala = ImageIO.read(new File("rsc\\Hero\\Bohater2Karta1mala.png"));

        this.h_Hero3Card1 = ImageIO.read(new File("rsc\\Hero\\Bohater3Karta1.png"));
        this.h_Hero3Card2 = ImageIO.read(new File("rsc\\Hero\\Bohater3Karta1.png"));
        this.h_Hero3Card3 = ImageIO.read(new File("rsc\\Hero\\Bohater3Karta1.png"));
        this.h_Hero3Card4 = ImageIO.read(new File("rsc\\Hero\\Bohater3Karta1.png"));

        this.h_Hero3Card1mala = ImageIO.read(new File("rsc\\Hero\\Bohater3Karta1mala.png"));
        this.h_Hero3Card2mala = ImageIO.read(new File("rsc\\Hero\\Bohater3Karta1mala.png"));
        this.h_Hero3Card3mala = ImageIO.read(new File("rsc\\Hero\\Bohater3Karta1mala.png"));
        this.h_Hero3Card4mala = ImageIO.read(new File("rsc\\Hero\\Bohater3Karta1mala.png"));

        this.h_Hero4Card1 = ImageIO.read(new File("rsc\\Hero\\Bohater4Karta1.png"));
        this.h_Hero4Card2 = ImageIO.read(new File("rsc\\Hero\\Bohater4Karta1.png"));
        this.h_Hero4Card3 = ImageIO.read(new File("rsc\\Hero\\Bohater4Karta1.png"));
        this.h_Hero4Card4 = ImageIO.read(new File("rsc\\Hero\\Bohater4Karta1.png"));

        this.h_Hero4Card1mala = ImageIO.read(new File("rsc\\Hero\\Bohater4Karta1mala.png"));
        this.h_Hero4Card2mala = ImageIO.read(new File("rsc\\Hero\\Bohater4Karta1mala.png"));
        this.h_Hero4Card3mala = ImageIO.read(new File("rsc\\Hero\\Bohater4Karta1mala.png"));
        this.h_Hero4Card4mala = ImageIO.read(new File("rsc\\Hero\\Bohater4Karta1mala.png"));

        this.h_nothing = ImageIO.read(new File("rsc\\Hero\\nothing.png"));

        this.h_ImageHealt = ImageIO.read(new File("rsc\\Hero\\Healtsmall.png"));
        this.h_ImageMana = ImageIO.read(new File("rsc\\Hero\\Manasmall.png"));

    }

    public Image getCard1() {
        return this.h_Card1;
    }

    public Image getCard2() {
        return this.h_Card2;
    }

    public Image getCard3() {
        return this.h_Card3;
    }

    public Image getCard4() {
        return this.h_Card4;
    }

    public Image getCard1small() {
        return this.h_Card1mala;
    }

    public Image getCard2small() {
        return this.h_Card2mala;
    }

    public Image getCard3small() {
        return this.h_Card3mala;
    }

    public Image getCard4small() {
        return this.h_Card4mala;
    }

    public Image getImageHealt(){
        return this.h_ImageHealt;
    }

    public Image getImageMana(){
        return this.h_ImageMana;
    }

    public int getHealt(){
        return this.h_healt;
    }

    public int getMana(){
        return this.h_mana;
    }

    public void setCard(String hero) {
        this.h_hero = hero;
        if (hero.equals("Red")) {
            System.out.println("Bohater czerwony");
            this.h_Card1 = this.h_Hero1Card1;
            this.h_Card2 = this.h_Hero1Card2;
            this.h_Card3 = this.h_Hero1Card3;
            this.h_Card4 = this.h_Hero1Card4;
            this.h_Card1mala = this.h_Hero1Card1mala;
            this.h_Card2mala = this.h_Hero1Card2mala;
            this.h_Card3mala = this.h_Hero1Card3mala;
            this.h_Card4mala = this.h_Hero1Card4mala;
            this.h_ActualCard1 = this.h_Hero1Card1;
            this.h_ActualCard2 = this.h_Hero1Card2;
            this.h_ActualCard3 = this.h_Hero1Card3;
            this.h_ActualCard4 = this.h_Hero1Card4;
            this.h_ActualCard1mala = this.h_Hero1Card1mala;
            this.h_ActualCard2mala = this.h_Hero1Card2mala;
            this.h_ActualCard3mala = this.h_Hero1Card3mala;
            this.h_ActualCard4mala = this.h_Hero1Card4mala;
        } else if (hero.equals("Green")) {
            System.out.println("Bohater Zielony");
            this.h_Card1 = this.h_Hero2Card1;
            this.h_Card2 = this.h_Hero2Card2;
            this.h_Card3 = this.h_Hero2Card3;
            this.h_Card4 = this.h_Hero2Card4;
            this.h_Card1mala = this.h_Hero2Card1mala;
            this.h_Card2mala = this.h_Hero2Card2mala;
            this.h_Card3mala = this.h_Hero2Card3mala;
            this.h_Card4mala = this.h_Hero2Card4mala;
            this.h_ActualCard1 = this.h_Hero2Card1;
            this.h_ActualCard2 = this.h_Hero2Card2;
            this.h_ActualCard3 = this.h_Hero2Card3;
            this.h_ActualCard4 = this.h_Hero2Card4;
            this.h_ActualCard1mala = this.h_Hero2Card1mala;
            this.h_ActualCard2mala = this.h_Hero2Card2mala;
            this.h_ActualCard3mala = this.h_Hero2Card3mala;
            this.h_ActualCard4mala = this.h_Hero2Card4mala;
        } else if (hero.equals("Blue")) {
            System.out.println("Bohater niebieski");
            this.h_Card1 = this.h_Hero3Card1;
            this.h_Card2 = this.h_Hero3Card2;
            this.h_Card3 = this.h_Hero3Card3;
            this.h_Card4 = this.h_Hero3Card4;
            this.h_Card1mala = this.h_Hero3Card1mala;
            this.h_Card2mala = this.h_Hero3Card2mala;
            this.h_Card3mala = this.h_Hero3Card3mala;
            this.h_Card4mala = this.h_Hero3Card4mala;
            this.h_ActualCard1 = this.h_Hero3Card1;
            this.h_ActualCard2 = this.h_Hero3Card2;
            this.h_ActualCard3 = this.h_Hero3Card3;
            this.h_ActualCard4 = this.h_Hero3Card4;
            this.h_ActualCard1mala = this.h_Hero3Card1mala;
            this.h_ActualCard2mala = this.h_Hero3Card2mala;
            this.h_ActualCard3mala = this.h_Hero3Card3mala;
            this.h_ActualCard4mala = this.h_Hero3Card4mala;
        } else if (hero.equals("Purple")) {
            System.out.println("Bohater fioletowy");
            this.h_Card1 = this.h_Hero4Card1;
            this.h_Card2 = this.h_Hero4Card2;
            this.h_Card3 = this.h_Hero4Card3;
            this.h_Card4 = this.h_Hero4Card4;
            this.h_Card1mala = this.h_Hero4Card1mala;
            this.h_Card2mala = this.h_Hero4Card2mala;
            this.h_Card3mala = this.h_Hero4Card3mala;
            this.h_Card4mala = this.h_Hero4Card4mala;
            this.h_ActualCard1 = this.h_Hero4Card1;
            this.h_ActualCard2 = this.h_Hero4Card2;
            this.h_ActualCard3 = this.h_Hero4Card3;
            this.h_ActualCard4 = this.h_Hero4Card4;
            this.h_ActualCard1mala = this.h_Hero4Card1mala;
            this.h_ActualCard2mala = this.h_Hero4Card2mala;
            this.h_ActualCard3mala = this.h_Hero4Card3mala;
            this.h_ActualCard4mala = this.h_Hero4Card4mala;
        }
    }
    public void Update(int x, int y, boolean mouseClicked) {
        this.h_Card1 = this.h_nothing;
        this.h_Card2 = this.h_nothing;
        this.h_Card3 = this.h_nothing;
        this.h_Card4 = this.h_nothing;
        if (this.h_frame.getScene() == 4) {

            if (x >= 400 && x <= (400 + 145) && y >= 550 && y <= (550 + 208)) {
                this.h_Card1 = this.h_ActualCard1;
                this.h_Card1mala = this.h_ActualCard1mala;
            } else {
                //this.h_Card1mala = this.h_nothing;
                this.h_Card1 = this.h_nothing;
            }
            if (x >= 550 && x <= (550 + 145) && y >= 550 && y <= (550 + 208)) {
                this.h_Card2 = this.h_ActualCard2;
                this.h_Card2mala = this.h_ActualCard2mala;
            } else {
                //this.h_Card2mala = this.h_nothing;
                this.h_Card2 = this.h_nothing;
            }
            if (x >= 700 && x <= (700 + 145) && y >= 550 && y <= (550 + 208)) {
                this.h_Card3 = this.h_ActualCard3;
                this.h_Card3mala = this.h_ActualCard3mala;
            } else {
                //this.h_Card3mala = this.h_nothing;
                this.h_Card3 = this.h_nothing;
            }
            if (x >= 850 && x <= (850 + 145) && y >= 550 && y <= (550 + 208)) {
                this.h_Card4 = this.h_ActualCard4;
                this.h_Card4mala = this.h_ActualCard4mala;
            } else {
                //this.h_Card4mala = this.h_nothing;
                this.h_Card4 = this.h_nothing;
            }
        }
    }
}
