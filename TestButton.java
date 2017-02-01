import javax.swing.*;

public class TestButton extends JButton implements WindowInterface {
    public TestButton(String texte) {
        super(texte);
    }

    @Override
    public TestButton get() {
        return this;
    }
}
