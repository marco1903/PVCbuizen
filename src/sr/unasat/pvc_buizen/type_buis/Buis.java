package sr.unasat.pvc_buizen.type_buis;

public class Buis {
    private int type;
    private int idNumber;
    private int diameter;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    private int lengte;


    public Buis(int type, int idNumber, int diameter, int lengte) {
        this.type = type;
        this.idNumber = idNumber;
        this.diameter = diameter;
        this.lengte = lengte;
    }

    public Buis(int type) {
        this.type = type;
    }
}
