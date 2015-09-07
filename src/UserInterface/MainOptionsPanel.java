package UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wmcnama on 9/6/2015.
 */
public class MainOptionsPanel extends JPanel implements ActionListener {
    private static String CONFIGURE_OPTIONS_FRAME_LABEL = "Configuration";

    private static String FIRST_BARRACKS_LABEL = "Select a barracks";
    private static String CONFIGURE_LABEL = "Configure";
    private static String BEGIN_LABEL = "Begin";


    //inner components
    private JButton firstBarracks;
    private JButton configure;
    private JButton begin;

    //layout
    private GridLayout layout;

    MainOptionsPanel() {
        super();
        initializeComponents();
    }

    private void initializeComponents() {
        //initialize layout
        layout = new GridLayout(0,2);

        //set layout
        this.setLayout(layout);

        //initialize components
        firstBarracks = createFirstBarracksButton();
        configure = createConfigureButon();
        begin = createBeginButton();

        //add components
        this.add(firstBarracks);
        this.add(configure);
        this.add(begin);
    }

    private JButton createFirstBarracksButton() {
        JButton button = new JButton(FIRST_BARRACKS_LABEL);
        button.setVerticalAlignment(AbstractButton.CENTER);
        button.addActionListener(this);
        return button;
    }

    private JButton createConfigureButon() {
        JButton button = new JButton(CONFIGURE_LABEL);
        button.setVerticalAlignment(AbstractButton.CENTER);
        button.addActionListener(this);
        return button;
    }

    private JButton createBeginButton() {
        JButton button = new JButton(BEGIN_LABEL);
        button.setVerticalAlignment(AbstractButton.CENTER);
        button.addActionListener(this);
        return button;
    }

    public void actionPerformed(ActionEvent e) {
        //If the configure button is pressed
        if(e.getActionCommand().equals(CONFIGURE_LABEL)) {
            ConfigureOptionsFrame configureFrame = createConfigurationFrame();
            configureFrame.pack();
            configureFrame.setVisible(true);
        }
    }

    private ConfigureOptionsFrame createConfigurationFrame() {
        return new ConfigureOptionsFrame(CONFIGURE_OPTIONS_FRAME_LABEL);
    }
}
