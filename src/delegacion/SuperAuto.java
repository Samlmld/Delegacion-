/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegacion;

/**
 *
 * @author Samlml
 */
public class SuperAuto extends Automovil {
    
    private Sumergible sumergible;
    private Avion avion;
    
    public SuperAuto()
    {
        sumergible =  new Sumergible();
        }
            
        
        public void ascender(){
              sumergible.ascender();
        }
        
        public void descender(){
            sumergible.descender();
    }
          public void despegar(){
        System.out.println("SuperAuto: Despegar");
        
    }
    public void aterrizar(){
        System.out.println("SuperAuto: Aterrizar");
    }
    
    public void volar(){
        System.out.println("SuperAuto: Volar");
    }
       
}
