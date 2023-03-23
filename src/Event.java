import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Event extends MouseAdapter{

    private Point e_mousePosition;
    private Menu e_menu;
    private Draw e_draw;
    private HeroChoose e_heroChoose;
    private LevelMap e_levelMap;
    private GameFrame e_frame;
    private Hero e_hero;

    private int firstScene3 = 0;
    private int firstScene2 = 0;

    Event(GameFrame frame, Menu menu, Draw draw, HeroChoose herochoose, LevelMap levelMap, Hero hero){
        this.e_mousePosition = new Point();
        this.e_menu = menu;
        this.e_draw = draw;
        this.e_frame = frame;
        this.e_heroChoose = herochoose;
        this.e_levelMap = levelMap;
        this.e_hero = hero;
        this.firstScene2 = 0;
        this.firstScene3 = 0;
    }

    public void mouseClicked(MouseEvent e){
        this.e_draw.repaint();
        this.setMousePosition(e);
        this.e_draw.repaint();
        this.check(true);
        this.e_draw.repaint();
    }
    public void mouseMoved(MouseEvent e){
        this.e_draw.repaint();
        this.setMousePosition(e);
        this.e_draw.repaint();
        this.check(false);
        this.e_draw.repaint();
    }
    public void mouseDragged(MouseEvent e){
        this.e_draw.repaint();
        this.setMousePosition(e);
        this.e_draw.repaint();
        this.check(false);
        this.e_draw.repaint();
    }
    public void mousePressed(MouseEvent e){
        this.e_draw.repaint();
        this.setMousePosition(e);
        this.e_draw.repaint();
        this.check(false);
        this.e_draw.repaint();
    }
    public void mouseReleased(MouseEvent e){
        this.e_draw.repaint();
        this.setMousePosition(e);
        this.e_draw.repaint();
        this.check(false);
        this.e_draw.repaint();
    }
    public void mouseEntered(MouseEvent e){
        this.e_draw.repaint();
        this.setMousePosition(e);
        this.e_draw.repaint();
        this.check(false);
    }

    public Point getMousePosition(){
        return this.e_mousePosition;
    }

    public void setMousePosition(MouseEvent e){
        PointerInfo a;
        a = MouseInfo.getPointerInfo();
        Point p = new Point(a.getLocation());
        SwingUtilities.convertPointFromScreen(p, e.getComponent());
        int x,y;
        this.e_mousePosition.x=(int) p.getX();
        this.e_mousePosition.y=(int) p.getY();
        this.e_mousePosition.x -= 7;
        this.e_mousePosition.y -= 28;
        this.e_draw.setMousePosition(this.e_mousePosition.x, this.e_mousePosition.y);
    }

    public void check(boolean MouseClick){
        if(this.e_frame.getScene() == 1){
            this.e_menu.Update(this.e_mousePosition.x, this.e_mousePosition.y, MouseClick);
            return;
        }
        if(this.e_frame.getScene() == 2){
            this.e_heroChoose.UpdateHeroChoose(this.e_mousePosition.x, this.e_mousePosition.y, MouseClick);
            return;
        }
        if(this.e_frame.getScene() == 3){
            this.e_levelMap.UpdateLevelMap(this.e_mousePosition.x, this.e_mousePosition.y, MouseClick);
            return;
        }
        if(this.e_frame.getScene() == 4){
            this.e_hero.Update(this.e_mousePosition.x, this.e_mousePosition.y, MouseClick);
        }
    }
}
