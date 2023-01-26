package a_Ejercicios.E4;


public class SmartDevice {


    //Atributos
    protected String nombre;
    protected boolean waterProof;
    protected double storage;
    protected  double precio;
    protected double pixels;
    protected boolean camara;
    protected boolean microfono;
    protected boolean gps;

    //Constructor
    public SmartDevice() {
    }
    public SmartDevice
            (
                    String nombre,
                    boolean waterProof,
                    double storage,
                    double precio,
                    double pixels,
                    boolean camara,
                    boolean microfono,
                    boolean gps
            )
            {
                    this.nombre = nombre;
                    this.waterProof = waterProof;
                    this.storage = storage;
                    this.precio = precio;
                    this.pixels = pixels;
            }
    public void mostrarDatos(){
        System.out.println(nombre + waterProof + storage + precio + pixels + camara + microfono + gps);
    }

}
