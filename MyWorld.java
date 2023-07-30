import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private Musica musicaFondo;
    private boolean juegoIniciado;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        musicaFondo = new Musica("Dogs and Cats.mp3");
        juegoIniciado = false;
    }
    public void act()
    {
        if (!juegoIniciado) 
        {
            // Reproducir música solo si el juego aún no ha comenzado
            musicaFondo.reproducir();
            juegoIniciado = true;
        }
        if (Greenfoot.isKeyDown("space")) 
        {
            Greenfoot.setWorld(new MazeWorld1());
        }
    }
    public void detenerMusica() 
    {
        musicaFondo.detener();
    }
}
