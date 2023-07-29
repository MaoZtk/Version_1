import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld1 extends World
{

    /**
     * Constructor for objects of class MazeWorld1.
     * 
     */
    public MazeWorld1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(12, 12, 50); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,11,9);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,10,9);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,9,9);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,9,10);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,8,10);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,7,10);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,7,9);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,6,10);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,5,10);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,4,10);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,7,8);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,6,8);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,7,7);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,5,8);
        MazeBlock mazeBlock15 = new MazeBlock();
        addObject(mazeBlock15,4,8);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,3,8);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,2,8);
        MazeBlock mazeBlock18 = new MazeBlock();
        addObject(mazeBlock18,1,8);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,1,9);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,1,10);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,2,10);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,1,7);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,1,6);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,1,5);
        MazeBlock mazeBlock25 = new MazeBlock();
        addObject(mazeBlock25,1,4);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,1,3);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,1,2);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,1,1);
        MazeBlock mazeBlock29 = new MazeBlock();
        addObject(mazeBlock29,2,1);
        MazeBlock mazeBlock30 = new MazeBlock();
        addObject(mazeBlock30,3,2);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,4,2);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,4,0);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,5,0);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,6,1);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,7,1);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,8,1);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,9,1);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,10,1);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,10,2);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,10,3);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,10,4);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,7,6);
        MazeBlock mazeBlock43 = new MazeBlock();
        addObject(mazeBlock43,7,5);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,8,4);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,5,3);
        MazeBlock mazeBlock46 = new MazeBlock();
        addObject(mazeBlock46,6,3);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,4,4);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,3,4);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,3,5);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,3,6);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,4,6);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,5,6);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,10,6);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,10,7);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,9,7);
        MazeBlock mazeBlock56 = new MazeBlock();
        addObject(mazeBlock56,11,7);
        MazeRunner mazeRunner = new MazeRunner(3);
        addObject(mazeRunner,6,0);
        mazeRunner.setLocation(6,0);
        removeObject(mazeRunner);
    }
}
