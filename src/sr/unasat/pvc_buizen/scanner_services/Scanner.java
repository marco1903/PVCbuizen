package sr.unasat.pvc_buizen.scanner_services;

import sr.unasat.pvc_buizen.type_buis.Buis;

public class Scanner {

    public void type(Buis buis) {
        switch (buis.getIdNumber()) {
            case 101:
                System.out.println("Dit is type " + buis.getType());
                System.out.println("Gaat naar magazijn 1");
                break;
            case 102:
                System.out.println("Dit is type " + buis.getType());
                System.out.println("Gaat naar magazijn 2");
                break;
            case 103:
                System.out.println("Dit is type " + buis.getType());
                System.out.println("Gaat naar magazijn 3");
                break;
            default:
                System.out.println("Deze type buis is onbekend en wordt niet opgeslagen");
                break;

        }
    }
}
