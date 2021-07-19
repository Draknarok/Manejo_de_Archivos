/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author shakb
 */
public class AddressBook {

    /**
     * @param args the command line arguments
     */
    public static void main()throws I0Exception {
            while(!Exit){
                System.out.println("Selecciones una opcion");
                System.out.println("1-Lista de contactos");
                System.out.println("2-Agregar contacto");
                System.out.println("3-Borrar contacto");
                System.out.println("4-Salir");
        try {
            opciones = sn.nextInt();
            switch(opciones){
                case 1:
                       lista();
                       break;
                case 2:
                       agregar();
                       break;
                case 3:
                       borrar();
                       break;
                case 4:
                      Exit = true;
                      System.out.println("Exit");
                      break;
                default:
                    throw new IllegalStateException("esta opcion es invalida" + opciones);
               }
             }   
            }catch (InputMismatchException e){
                    System.out.println("Seleccione una opcion de la lista");
                    sn.next();
                    }
                }catch (Exception e) {

    }
    
}
