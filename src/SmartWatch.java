// Subclase 2
public class SmartWatch extends SmartDevice {

    // 1. Atributos especializados de la clase:

    String date;
    String hhmmss;
    boolean bioLaserSensor;
    boolean alarm;


    // 2. Constructor vacio

    public SmartWatch(){}

    // Constructor con todos los parametros:

    public SmartWatch(String fabricante, String marca, String modelo, String tipo, Cpu cpu, Memory memory, Ram ram, Networks networks, String battery, boolean modoAvion, String color, Persona persona, String date, String hhmmss, boolean bioLaserSensor, boolean alarm) {
        super(fabricante, marca, modelo, tipo, cpu, memory, ram, networks, battery, modoAvion, color, persona);
        this.date = date;
        this.hhmmss = hhmmss;
        this.bioLaserSensor = bioLaserSensor;
        this.alarm = alarm;
    }


    // 3.Metodos
}
