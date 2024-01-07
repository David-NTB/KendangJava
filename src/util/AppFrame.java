package util;

import javax.swing.JFrame;

public class AppFrame extends JFrame {
    public AppFrame() {
        setTitle("Keyboard Input Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void init() {
        getKeyboardInput keyboardInputHandler = new getKeyboardInput();
        addKeyListener(keyboardInputHandler);

        setFocusable(true);
        setVisible(true);
    }
}