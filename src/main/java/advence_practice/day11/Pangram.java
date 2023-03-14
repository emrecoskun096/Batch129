package advence_practice.day11;

public class Pangram {
    /*
    Bir cümlenin pangram olup olamadığını kontrol eden bir kod yazınız.
    Not: Pangram, bir dilin alfabesi içerisindeki tüm harfleri içeren anlamlı cümledir.
    TR: Pijamalı hasta yağız şoföre çabucak güvendi.
    ENG: The quick brown fox jumps over the lazy dog.
    */
    public static void main(String[] args) {


        System.out.println("isPangram(\"Pijamalı hasta yağız şoföre çabucak güvendi\") = " + isPangram("Pijamalı hasta yağız şoföre çabucak güvendi"));


    }public static boolean isPangram(String str) {
        str=str.replaceAll(" ","").toLowerCase();
        String trAlfabe = "abcçdefghijklmnoöprstuüvyz";
        //1.yol:
        for (int i = 0; i < trAlfabe.length(); i++) {
            if(!str.contains(String.valueOf(trAlfabe.charAt(i)))){
                return false;

            }
        }

        return false;
    }

}
