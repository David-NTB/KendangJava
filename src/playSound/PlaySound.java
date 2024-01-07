package playSound;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlaySound {
    public void playAudio(String pathname) {
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
            // Thread.sleep(clip.getMicrosecondLength() / 1000);

            // // Tutup AudioInputStream dan Clip
            // audioInputStream.close();
            // clip.close();

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public String getAudioFilePath(char keyChar) {
    
        return switch (Character.toLowerCase(keyChar)) {
            // LEFT INPUT
            case 'a' -> "src/sound/PLO_Audio_118.wav";
            case 's' -> "src/sound/PLO_Audio_119.wav";
            case 'd' -> "src/sound/PLO_Audio_120.wav";
            case 'f' -> "src/sound/PLO_Audio_117.wav";
            case 'z' -> "src/sound/PLO_Audio_073.wav";
            case 'x' -> "src/sound/PLO_Audio_072.wav";
            case 'c' -> "src/sound/PLO_Audio_085.wav";

            // RIGHT INPUT
            case 'k' -> "src/sound/PLO_Audio_096.wav";
            case 'l' -> "src/sound/PLO_Audio_105.wav";
            case ';' -> "src/sound/PLO_Audio_122.wav";
            case '\'' -> "src/sound/PLO_Audio_121.wav";
            case 'm' -> "src/sound/PLO_Audio_095.wav";
            case ',' -> "src/sound/PLO_Audio_104.wav";
            case '.' -> "src/sound/PLO_Audio_123.wav";
            case '/' -> "src/sound/PLO_Audio_124.wav";

            default -> "src/sound/PLO_Audio_072.wav";
        };
    }
}
