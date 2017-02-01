import java.awt.*;

public class Button3 extends WindowDecorator{
    public Button3(TestButton button){
        super(button);
        button.setFont(button.getFont().deriveFont(Font.BOLD & Font.ITALIC & Font.PLAIN,1));
    }
}
