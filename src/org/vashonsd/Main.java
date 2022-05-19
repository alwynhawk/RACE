package org.vashonsd;

public class Main {

    public static void main(String[] args) {
        Race leMans = new Race("LeMans");
        leMans.addResult("Billy", 34.23);
        leMans.addResult("Aaron", 31.77);
        leMans.addResult("Cain", 42.01);
        leMans.addResult("jonas", 245.35);
        System.out.println(leMans.timeUnder(32.0));
        System.out.println(leMans.nameOfWinner());
    }
}
