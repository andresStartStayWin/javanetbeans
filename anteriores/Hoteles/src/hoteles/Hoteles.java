
package hoteles;

import entidades.Hotel;
import entidades.hotel1;
import entidades.hotel2;
import entidades.hotel3;
import entidades.hotel4;
import entidades.hotel5;
import java.util.ArrayList;
import java.util.List;

public class Hoteles {

    public static void main(String[] args) {
        List<Hotel> hoteles = new ArrayList();
        
        hotel1 h1 = new hotel1(1500d, 9d, 10);
        hotel2 h2 = new hotel2(2500d, 12d, 15);
        hotel3 h3 = new hotel3(3500d, 15d, 20);
        hotel4 h4 = new hotel4(5000d, 20d, 30);
        hotel5 h5 = new hotel5(10000d, 30d, 50);
        
        
        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        hoteles.add(h5);
        
        for (Hotel aux : hoteles) {
            if (aux instanceof hotel5) {
                hotel5 object = (hotel5) aux;
                System.out.println("soy un hotel 5");
                continue;
            }
            if (aux instanceof hotel4) {
                hotel4 object = (hotel4) aux;
                System.out.println("soy un hotel 4");
                continue;
            }
            if (aux instanceof hotel3) {
                hotel3 object = (hotel3) aux;
                System.out.println("soy un hotel 3");
                continue;
            }
            if (aux instanceof hotel2) {
                hotel2 object = (hotel2) aux;
                System.out.println("soy un hotel 2");
                continue;
            }
            if (aux instanceof hotel1) {
                hotel1 object = (hotel1) aux;
                System.out.println("soy un hotel 1");
                continue;
            }
        }
    }
    
}
