package sr.unasat.pvc_buizen.App;

import sr.unasat.pvc_buizen.scanner_services.Scanner;
import sr.unasat.pvc_buizen.type_buis.Buis;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner();
        sc.type(new Buis(101));

    }
}
