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
public class Delegacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SuperAuto superauto = new SuperAuto();
        System.out.println("Aplicacion Super Auto");
        superauto.arrancar();
        superauto.andar();
        System.out.println("--------------------------");
        superauto.descender();
        superauto.ascender();
        System.out.println("---------------------------");
       superauto.despegar();
       superauto.volar();
       superauto.aterrizar();
    }
    
}
