package andres.mascotapp.entidades;

import andres.mascotapp.enumeraciones.RazaPerruna;
import andres.mascotapp.enumeraciones.SexoAnimal;

/**
 * MascotAPP
 * @author andre
 */
public class Mascota <T>{

    private String nombre;
    private String apodo;
    //Conejo, Perro, Gato, Loro, Carpincho
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private T raza;
    private SexoAnimal sexo;

    private int energia;
    
    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho")) {
            this.tipo = tipo;
        }
        this.energia = 1000;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", sexo=" + sexo + ", energia=" + energia + '}';
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, T raza, SexoAnimal sexo, int energia) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.sexo = sexo;
        this.energia = energia;
    }

    
    
    
    public void setNombre(String nombre) {
        if (nombre.length()>0) {
            this.nombre = nombre;
        }
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public T getRaza() {
        return raza;
    }

    public void setRaza(T raza) {
        this.raza = raza;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    
    
   

    /**
     * Funcion pasear 
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar) {
        energia -= energiaRestar;
        return energia;
    }   

    /**
     * Funcion pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas) {
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;     
        }
        return energia;
    }   
       
   
     
    
    

}
