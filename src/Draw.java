import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class Draw extends JPanel {
    private Point d_mousePosition;
    private Menu d_menu;
    private GameFrame d_frame;
    private HeroChoose d_heroChoose;
    private LevelMap d_levelmap;
    private Gameplay d_gameplay;
    private Hero d_hero;
    private int d_fuel;

    Draw(GameFrame frame, Menu menu, HeroChoose heroChoose, LevelMap levelMap, Gameplay gameplay, Hero hero) {
        this.d_menu = menu;
        this.d_mousePosition = new Point();
        this.d_frame = frame;
        this.d_heroChoose = heroChoose;
        this.d_levelmap = levelMap;
        this.d_gameplay = gameplay;
        this.d_hero = hero;
        this.d_fuel = 5;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.PaintMenu(g);

        String napis = "X = " + this.d_mousePosition.x + " Y = " + this.d_mousePosition.y;

        g.setFont(new Font("Consolas", Font.PLAIN, 18));
        g.setColor(Color.WHITE);
        g.drawString(napis, this.d_mousePosition.x, this.d_mousePosition.y);

    }

    public void PaintMenu(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        if (this.d_frame.getScene() == 1) {
            Stroke stroke1 = new BasicStroke(6f);

            g.drawImage(this.d_menu.getBackground(), 0, 0, null);
            g.drawImage(this.d_menu.getNowaGra(), 400, 200, null);
            g.drawImage(this.d_menu.getWczytajGre(), 400, 310, null);
            g.drawImage(this.d_menu.getOpcje(), 400, 420, null);
            g.drawImage(this.d_menu.getWyjdz(), 400, 530, null);
        }
        if (this.d_frame.getScene() == 2) {

            g.drawImage(this.d_heroChoose.getBackground(), 0, 0, null);
            g.drawImage(this.d_heroChoose.getHero1(), 50, 200, null);
            g.drawImage(this.d_heroChoose.getHero2(), 383, 200, null);
            g.drawImage(this.d_heroChoose.getHero3(), 716, 200, null);
            g.drawImage(this.d_heroChoose.getHero4(), 1049, 200, null);
            g.drawImage(this.d_heroChoose.getPowrot(), 500, 600, null);
        }
        if (this.d_frame.getScene() == 3) {

            g.drawImage(this.d_levelmap.getBackground(), 0, 0, null);
            g.drawImage(this.d_levelmap.getLevel1(), 100, 300, null);
            g.drawImage(this.d_levelmap.getLevel2(), 300, 500, null);
            g.drawImage(this.d_levelmap.getLevel3(), 600, 500, null);
            g.drawImage(this.d_levelmap.getLevel4(), 700, 100, null);
            g.drawImage(this.d_levelmap.getLevel5(), 1000, 200, null);
            g.drawImage(this.d_levelmap.getPowrot(), 500, 600, null);
            g.drawImage(this.d_levelmap.getKart1(), 1000, 310, null);
            g.drawImage(this.d_levelmap.getKart2(), 1000, 310, null);
            g.drawImage(this.d_levelmap.getKart3(), 1000, 310, null);
            g.drawImage(this.d_levelmap.getKart4(), 1000, 310, null);
            g.drawImage(this.d_levelmap.getKart5(), 1000, 310, null);
            g.drawImage(this.d_levelmap.getArrow(), this.d_levelmap.getArrowPosX(), this.d_levelmap.getArrowPosY(), null);

            g.drawImage(this.d_levelmap.getStartImage(), 270, 170, null);
            if (this.d_levelmap.getStart() == true) {
                if (this.d_mousePosition.x >= 270 && this.d_mousePosition.x <= (270 + 400) && this.d_mousePosition.y > 170 && this.d_mousePosition.y <= (170 + 100)) {
                    g2D.setStroke(new BasicStroke(2f));
                    g2D.setColor(Color.GREEN);
                    g2D.drawRect(268, 168, 400, 100);
                } else {
                    g2D.setStroke(new BasicStroke(2f));
                    g2D.setColor(Color.RED);
                    g2D.drawRect(268, 168, 400, 100);
                }
            }
            g2D.setColor(Color.WHITE);
            g2D.setStroke(new BasicStroke(4f));
            float[] dashingPattern2 = {10f, 4f};
            Stroke stroke2 = new BasicStroke(4f, BasicStroke.CAP_BUTT,
                    BasicStroke.JOIN_MITER, 1.0f, dashingPattern2, 0.0f);
            g2D.setStroke(stroke2);
            g2D.drawLine(200, 400, 300, 500);
            g2D.drawLine(400, 550, 600, 550);
            g2D.drawLine(650, 500, 730, 200);
            g2D.drawLine(800, 160, 1000, 240);

            String napis = "FUEL:" + this.d_fuel;

            g.setFont(new Font("Arial", Font.PLAIN, 50));
            g.setColor(Color.WHITE);
            g.drawString(napis, 300, 70);

        }
        if (this.d_frame.getScene() == 4) {
            g.drawImage(this.d_gameplay.getBackground(), 0, 0, null);
            g.drawImage(this.d_hero.getCard1small(), 400, 550, null);
            g.drawImage(this.d_hero.getCard2small(), 550, 550, null);
            g.drawImage(this.d_hero.getCard3small(), 700, 550, null);
            g.drawImage(this.d_hero.getCard4small(), 850, 550, null);
            g.drawImage(this.d_hero.getCard1(), 550, 50, null);
            g.drawImage(this.d_hero.getCard2(), 550, 50, null);
            g.drawImage(this.d_hero.getCard3(), 550, 50, null);
            g.drawImage(this.d_hero.getCard4(), 550, 50, null);
            g.drawImage(this.d_hero.getImageHealt(), 20, 20, null);
            g.drawImage(this.d_hero.getImageMana(), 20, 120, null);
            g.setColor(Color.RED);
            g2D.setStroke(new BasicStroke(2f));
            g2D.drawRect(150, 70, 10 + (3 * this.d_hero.getHealt()), 10);
            g.setColor(Color.CYAN);
            g2D.drawRect(150, 170, 10 + (3 * 10 * this.d_hero.getMana()), 10);

            String napis = "HEALT: " + this.d_hero.getHealt();

            g.setFont(new Font("Consolas", Font.PLAIN, 20));
            g.setColor(Color.RED);
            g.drawString(napis, 250, 60);
            napis = "MANA: " + this.d_hero.getMana();

            g.setFont(new Font("Consolas", Font.PLAIN, 20));
            g.setColor(Color.CYAN);
            g.drawString(napis, 250, 160);
        }
    }

    public void setMousePosition(int x, int y) {
        this.d_mousePosition.x = x;
        this.d_mousePosition.y = y;
    }

}
