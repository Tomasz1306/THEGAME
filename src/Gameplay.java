import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Gameplay {
    private final BufferedImage g_background;

    public Gameplay() throws IOException {
        this.g_background = ImageIO.read(new File("C:\\Users\\bogda\\OneDrive\\Pulpit\\JavaProjekt\\THEGAME\\rsc\\Gameplay\\Background.png"));
    }

    public Image getBackground(){
        return this.g_background;
    }
}
