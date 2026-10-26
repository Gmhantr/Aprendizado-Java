
package eletrodomesticos;


public class Main {
    public static void main(String[] args) {

        // Criando um objeto Televisor
        Televisor tv = new Televisor();

        // Mesmo sem declarar "ligado" na classe Televisor,
        // ele EXISTE porque foi herdado de Eletrodomestico
        System.out.println("TV ligada? " + tv.isLigado());

        // Ligando a TV (método da classe pai)
        tv.ligar();
        System.out.println("TV ligada? " + tv.isLigado());

        // Aumentando volume (método da classe filha)
        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.println("Volume atual: " + tv.getVolume());

        // Diminuindo volume
        tv.diminuirVolume();
        System.out.println("Volume após diminuir: " + tv.getVolume());

        // Desligando a TV
        tv.desligar();
        System.out.println("TV ligada? " + tv.isLigado());

        // Tentando aumentar volume desligada (não vai mudar)
        tv.aumentarVolume();
        System.out.println("Volume com TV desligada: " + tv.getVolume());
    }
}

