import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es un clase que será el enemigo y aparece con
 * intervalo de tiempo
 * 
 * @author Soto Avila Carolina, Escobar Chavez Jose Emmanuel Escobar Chavez 
 * @version 4 de Noviembre del 2016
 */
public class Jake extends Actor
{
    /** the amount of change in x during each act */
    private int velX=2;    
   private GifImage jakeAnimado = new GifImage("JakeAnimado.gif");
    /**
     * Act - do whatever the Jake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setImage(jakeAnimado.getCurrentImage());
       setLocation( getX()-velX , getY());
       mueveJake();
       
    }  
    
    /**
     * Este metodo tiene como objetivo desplazar al objeto y eliminarlo
     * del mundo si llega al inicio de este y decrementar vidas si es tocado
     * por el rey helado.
     */
    public void mueveJake()
    {
      World mundo = getWorld();
       
       if(getX()<2){
           ((MyWorld)mundo).enemigojake();
            getWorld().removeObject(this);
            return;
        }
       if(isTouching(ReyHelado.class))
        {
            ((MyWorld)mundo).decrementaVidas();
             getWorld().removeObject(this);
            return;
        }
    }
    
   
}
