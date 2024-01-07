package util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import playSound.PlaySound;

public class getKeyboardInput implements KeyListener {
    PlaySound playSound = new PlaySound();
    String audioFilePath;

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();

        // memutar musik
        audioFilePath = playSound.getAudioFilePath(keyChar);
        playSound.playAudio(audioFilePath);
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        // int keyCode = e.getKeyCode();
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        // int keyCode = e.getKeyCode();
    }
}