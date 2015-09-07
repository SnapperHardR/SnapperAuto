package Dispatch;

import UserInterface.MainOptionsGUI;

/**
 * Created by wmcnama on 9/6/2015.
 */
public class BotJob {
    public static void main(String[] args) {
        // initialize GUI
        MainOptionsGUI gui = new MainOptionsGUI();
         javax.swing.SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                  MainOptionsGUI gui = new MainOptionsGUI();
              }
         });
    }
}
