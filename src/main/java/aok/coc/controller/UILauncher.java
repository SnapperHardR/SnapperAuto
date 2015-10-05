package aok.coc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

//This is a check to see if I can push everything right
//Double check to see if I can push straight through
public class UILauncher extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {

		primaryStage.setTitle("RichardBot");

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(UILauncher.class.getResource("/fxml/MainWindow.fxml"));
		AnchorPane scene = loader.load();
		loader.<aok.coc.controller.MainWindowController>getController().setHostServices(this.getHostServices());

		primaryStage.setScene(new Scene(scene));
		primaryStage.show();
	}

	public static void main(String[] args) {
		try (InputStream inputStream = UILauncher.class.getResourceAsStream("/logging.properties")) {
			LogManager.getLogManager().readConfiguration(inputStream);
		} catch (final IOException e) {
			Logger.getAnonymousLogger().severe("Could not load default logging.properties file");
			Logger.getAnonymousLogger().severe(e.getMessage());
		}

		try {
			launch(args);
		} finally {
			for (Handler h : Logger.getLogger("").getHandlers()) {
				h.close();
			}
		}
	}
}