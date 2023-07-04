/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author andre
 */
public class MatematicaServicio {
   public Matematica crearMatematica () {

        double num1 = (double) (Math.random() * 10 + 1);
        double num2 = (double) (Math.random() * 10 + 1);

        return new Matematica(num1,num2);
    }

    public double devolverMayor (Matematica _matematica) {

        if (_matematica.getNum1() > _matematica.getNum2()) {
            return _matematica.getNum1();
        } else if (_matematica.getNum2() > _matematica.getNum1()) {
            return _matematica.getNum2();
        } else {
            return 0;
        }
    }

    public double calcularPotencia (Matematica _matematica) {

        double num1, num2;

        if (_matematica.getNum1() > _matematica.getNum2()) {

            num1 = Math.round(_matematica.getNum1());
            num2 = Math.round(_matematica.getNum2());

            return Math.pow(num1,num2);

        } else if (_matematica.getNum2() > _matematica.getNum1()) {

            num1 = Math.round(_matematica.getNum1());
            num2 = Math.round(_matematica.getNum2());

            return Math.pow(num2,num1);

        } else {

            num1 = Math.round(_matematica.getNum1());

            return Math.pow(num1,num1);

        }
    }

    public double calcularRaiz (Matematica _matematica) {

        double num;

        if (_matematica.getNum1() > _matematica.getNum2()) {

            num = Math.abs(_matematica.getNum2());
            return Math.sqrt(num);

        } else if (_matematica.getNum2() > _matematica.getNum1()) {

            num = Math.abs(_matematica.getNum1());
            return Math.sqrt(num);

        } else {

            num = Math.abs(_matematica.getNum1());
            return Math.sqrt(num);

        }
    }
}