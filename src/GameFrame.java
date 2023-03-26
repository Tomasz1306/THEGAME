import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameFrame extends JFrame {
    private final Point g_windowSize;
    private final Dimension g_monitorSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final String g_title;

    private Event g_event;
    private Draw g_draw;
    private Menu g_menu;
    private HeroChoose g_heroChoose;
    private LevelMap g_levelMap;
    private Gameplay g_gameplay;
    private Hero g_hero;
    public Connect g_connect;
    private int g_scene;

    GameFrame(String title, int windowSizeX, int windowSizeY) throws IOException {
        this.g_scene = 1;

        this.g_connect = new Connect(this);
        this.g_hero = new Hero(this);
        this.g_windowSize = new Point();
        this.g_gameplay = new Gameplay();
        this.g_heroChoose = new HeroChoose(this);
        this.g_levelMap = new LevelMap(this);
        this.g_menu = new Menu(this);
        this.g_draw = new Draw(this, this.g_menu, this.g_heroChoose, this.g_levelMap, this.g_gameplay,this.g_hero,this.g_connect);
        this.g_event = new Event(this, this.g_menu,this.g_draw,this.g_heroChoose,this.g_levelMap,this.g_hero);

        this.g_title = title;
        this.g_windowSize.x = windowSizeX;
        this.g_windowSize.y = windowSizeY;

        this.setWindowSizeAndLocation();

        this.add(g_draw);
        this.addMouseListener(g_event);
        this.addMouseMotionListener(g_event);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public int getScene(){
        return g_scene;
    }
    public void setScene(int x){
        this.g_scene = x;
    }

    public void setWindowSizeAndLocation(){
        this.setSize(this.g_windowSize.x, this.g_windowSize.y);
        int x, y;
        x = this.g_monitorSize.width;
        y = this.g_monitorSize.height;
        this.setLocation( (x/2) - (this.g_windowSize.x/2) , (y/2) - (this.g_windowSize.y/2));

    }
    public Draw getDraw(){
        return this.g_draw;
    }
    public Menu getMenu(){
        return this.g_menu;
    }
    public HeroChoose getHeroChoose(){
        return this.g_heroChoose;
    }
    public Hero getHero(){
        return this.g_hero;
    }
    public LevelMap getLevelMap(){
        return this.g_levelMap;
    }
    public Gameplay getGamePlay(){
        return this.g_gameplay;
    }
    public Point getWindowSize(){
        return g_windowSize;
    }

    public void setHero(String hero){
        this.g_hero.setCard(hero);
    }

    public void setArrow(String arrow){
        this.g_levelMap.setArrow(arrow);
    }
}
