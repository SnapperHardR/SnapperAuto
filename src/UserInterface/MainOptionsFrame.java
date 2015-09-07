package UserInterface;

import javax.swing.*;

/**
 * Created by wmcnama on 9/6/2015.
 */
public class MainOptionsFrame extends JFrame {

    private JPanel mainOptionsPanel;

    public MainOptionsFrame(String label) {
        super(label);

        //frame settings
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainOptionsPanel mainOptionsPanel = new MainOptionsPanel();
        this.add(mainOptionsPanel);
    }
}
