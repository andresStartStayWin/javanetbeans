
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andre
 */
public class NewMain {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 a 5");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
	
	switch (opinion) {
		case 1:
		case 2:
                    System.out.println("Que mal 2");
                    break;
                case 3:
                    System.out.println("Ok");
                    break;
                case 4:
                    System.out.println("Buena");
                    break;
                case 5:
                    System.out.println("Muy buena");
                    break;
                  
                        
                    }
    }   else if (opinion < 0) {
            System.out.println("Tan mala fue?");
    }   else if (opinion == 0) {
            System.out.println("El valor " + opinion + " no es válido");
    }   else {
            System.out.println("Muy alto");

}
        System.out.println(" ");
        System.out.println("Nos vemos");
        System.out.println(" ");
    }
}