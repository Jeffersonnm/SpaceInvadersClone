package SpaceInvadersClone;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FonteBit {

    public Font fonte(float tam) {
        Font fonte = null;
        try {
            fonte = Font.createFont(Font.TRUETYPE_FONT, new File(System.getProperty("user.dir") + System.getProperty("file.separator") + "8bitoperator.ttf"));
            fonte = fonte.deriveFont(fonte.getSize() * tam);
            return fonte;
        } catch (FontFormatException ex) {
            Logger.getLogger(FonteBit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FonteBit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fonte;
    }
    
}