package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        for (int i=0; i<4; i++)
        {
            Thread object = new Thread(new Multithread());
            object.start();
        }
        Input keyInit = new Input();
        keyInit.keyDect();
        


    }
    class Multithread implements Runnable
    {
        public void run()
        {
            try
            {
                // Displaying the thread that is running
                System.out.println ("Thread " +
                        Thread.currentThread().getId() +
                        " is running");

            }
            catch (Exception e)
            {
                // Throwing an exception
                System.out.println ("Exception is caught");
            }
        }

    }



    public static void main(String[] args) {
        launch(args);


    }



}
