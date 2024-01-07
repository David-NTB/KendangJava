package playSound;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class getSound {
    public static void playSound(String pathname) {
        try {
            // Tentukan path file .wav
            File file = new File(pathname);

            // Buat AudioInputStream dari file .wav
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

            // Dapatkan Clip
            Clip clip = AudioSystem.getClip();

            // Buka AudioInputStream ke dalam Clip
            clip.open(audioInputStream);

            // Putar Clip
            clip.start();

            // Tunggu hingga Clip selesai diputar
            Thread.sleep(clip.getMicrosecondLength() / 1);

            // Tutup AudioInputStream dan Clip
            audioInputStream.close();
            clip.close();

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
