import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WellDone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WellDone extends Actor
{
    /**
     * Act - do whatever the WellDone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WellDone() //CREATING CLASS FOR WellDone.
    {
      setImage(new GreenfootImage("WELLDONE! mission success"
      ,80, Color.GRAY, Color.GREEN));
      //ADDING IMAGE,COLOR ,SIZE,ENDING MESSAGE WHEN BALL REACH TO THE GRAY BLOCK
    }   
}
