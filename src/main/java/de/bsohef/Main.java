package de.bsohef;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wie voll ist der Tank");
        double tankinhalt = s.nextDouble();
        System.out.println("wie hoch ist der Verbrauch auf 100KM");
        double verbrauch = s.nextDouble();
        System.out.println("wie viele Kilometer sollen gefahren werden?");
        double distanz = s.nextDouble();
        System.out.println("was ist der Aktuelle Literpreis für Benzin");
        double benzinpreis = s.nextDouble();
        double rest = tankinhalt-distanz*(verbrauch/100);
        System.out.println("Der restliche tankinhalt nach der Strecke ist "+ rest);
        if (rest < 0){
            System.out.println("Tank wird nicht reichen");
        }
        if (tankinhalt < 0){
            System.out.println("Tankinhalt darf nicht negativ sein");
        }
        if (verbrauch < 0){
            System.out.println("Verbrauch darf nicht negativ sein");
        }
        if (distanz < 0){
            System.out.println("Distanz darf nicht negativ sein");
        }
        if (benzinpreis < 0){
            System.out.println("Benzinpreis darf nicht negativ sein");
        }
        double kosten = distanz*(verbrauch/100)*benzinpreis;
        System.out.println("Die kosten betragen");
    }
}
