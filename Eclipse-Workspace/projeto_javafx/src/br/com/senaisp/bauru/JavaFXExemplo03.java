package br.com.senaisp.bauru;




import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class JavaFXExemplo03 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group noRoot = new Group();
		LinearGradient lg = new LinearGradient(0, 1, 1, 0, true, CycleMethod.NO_CYCLE, new Stop[] {
				new Stop(0,Color.WHITE),new Stop(0.5, Color.YELLOW),new Stop(1,Color.BLUE)
		});
		Polygon triangulo = new Polygon(new double[] {
				210.0, 10.0,
				210.0, 210.0,
				10.0, 210.0
		});
		RadialGradient rg = new RadialGradient(0,0,0.5, 0.5, 1,true, CycleMethod.NO_CYCLE,new Stop[] {
				new Stop(0,Color.YELLOW),new Stop(0.25,Color.RED),new Stop(0.5,Color.TRANSPARENT)
		});
		//triangulo.setFill(Color.rgb(0,0,255,0.5));
		//triangulo.setFill(lg);
		triangulo.setFill(rg);
		triangulo.setLayoutX(50);
		triangulo.setLayoutY(50);
		noRoot.getChildren().addAll(triangulo);
		Scene cena = new Scene(noRoot,400,400,Color.LIGHTGRAY);
		primaryStage.setTitle("Formas em javaFX");
		primaryStage.setScene(cena);
		primaryStage.show();
				
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
