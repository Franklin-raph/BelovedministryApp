package util;

import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;

    // Class from stack Overflow to enable dragging of window and it's styling.

public class WindowStyle {
    private static final Rectangle2D SCREEN_BOUNDS= Screen.getPrimary()
            .getVisualBounds();
    private static double[] pref_WH, offset_XY;
    private static String styleSheet;

    private WindowStyle(String css) {
        styleSheet= getClass().getResource(css).toString();
    }

// Method to enable dragging of window
public static void allowDrag(Parent root, Stage stage) {
    root.setOnMousePressed((MouseEvent p) -> offset_XY= new double[]{p.getSceneX(), p.getSceneY()});

    root.setOnMouseDragged((MouseEvent d) -> {
        //Ensures the stage is not dragged past the taskbar
        if (d.getScreenY()<(SCREEN_BOUNDS.getMaxY()-20))
            stage.setY(d.getScreenY() - offset_XY[1]);
        stage.setX(d.getScreenX() - offset_XY[0]);
    });

    root.setOnMouseReleased((MouseEvent r)-> {
        //Ensures the stage is not dragged past top of screen
        if (stage.getY()<0.0) stage.setY(0.0);
    });
}
}
