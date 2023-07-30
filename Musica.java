import greenfoot.*;

public class Musica extends Actor {
    private GreenfootSound music;
    public void act()
    {
        reproducir();
        detener();
    }
    // Constructor
    public Musica(String nombreArchivo) {
        // Carga la música desde el archivo proporcionado
        music = new GreenfootSound(nombreArchivo);
    }

    // Método para reproducir la música
    public void reproducir() {
        music.play();
    }

    // Método para detener la reproducción de la música
    public void detener() {
        music.stop();
    }

    // Método para pausar la música
    public void pausar() {
        music.pause();
    }

    // Método para continuar la reproducción de la música pausada
    public void continuar() {
        music.play();
    }

    // Método para ajustar el volumen de la música
    public void ajustarVolumen(int volumen) {
        music.setVolume(volumen);
    }

    // Método para verificar si la música está reproduciéndose
    public boolean estaReproduciendo() {
        return music.isPlaying();
    }
}