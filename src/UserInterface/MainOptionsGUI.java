package UserInterface;

/**
 * Created by wmcnama on 9/6/2015.
 */
public class MainOptionsGUI {

    private static String MAIN_OPTIONS_NAME = "COCBOT";

    //main components
    private MainOptionsFrame mainFrame;
    private ConfigureOptionsFrame configureFrame;

    public MainOptionsGUI() {
        //initialize components
        mainFrame = new MainOptionsFrame(MAIN_OPTIONS_NAME);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
