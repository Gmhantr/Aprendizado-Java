/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eletrodomesticos;



public class Televisor extends Eletrodomesticos {
    private int volume;

    public void aumentarVolume() {
        if (isLigado() && volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (isLigado() && volume > 0) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }
}

