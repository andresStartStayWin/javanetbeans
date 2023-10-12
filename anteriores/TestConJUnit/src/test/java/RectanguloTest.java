/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import andres.testconjunit.entities.Rectangulo;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 *
 * @author andre
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
 
  
    @Test
    public void deberiaInicializarConColor(){
        assertNotNull(new Rectangulo(10,10).getColor());
    }
}

