package Clases;

public class Precios {


    private int farenheith;
    private int revival;
    private int elAlquimista;

    //Constructor
    public  Precios()
    {
        farenheith = 5000;
        revival = 12000;
        elAlquimista = 45000;
    }

    //Accesadores y Mutadores
    public int getFarenheith() {
        return farenheith;
    }

    public void setFarenheith(int farenheith) {
        this.farenheith = farenheith;
    }

    public int getRevival() {
        return revival;
    }

    public void setRevival(int revival) {
        this.revival = revival;
    }

    public int getElAlquimista() {
        return elAlquimista;
    }

    public void setElAlquimista(int elAlquimista) {
        this.elAlquimista = elAlquimista;
    }


}
