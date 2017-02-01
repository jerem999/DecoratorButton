import java.awt.*;

public class Button2 extends WindowDecorator{
    public Button2(TestButton button){
        super(button);

        button.setMargin(new Insets(1, 1, 200, 200));

    }
}
