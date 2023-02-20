

// SubClase 1
public class SmartPhone extends SmartDevice {

    // Atributos especializados de la clase :

    String contactName;
    int contactNumber;
    boolean photoCamera;
    boolean light;
    boolean dactilarSensor;
    boolean fmRadio;
    int screenBright;
    int audiVolume;
    int multimediaVolume;
    int alarmVolume;
    int notifications;

    // Constructor vacio de la clase

    public SmartPhone(){}

    // Constructor con todos los parametros
    public SmartPhone(String fabricante, String marca, String modelo, String tipo, Cpu cpu, Memory memory, Ram ram, Networks networks, String battery, boolean modoAvion, String color, Persona persona, String contactName, int contactNumber, boolean photoCamera, boolean light, boolean dactilarSensor, boolean fmRadio, int screenBright, int audiVolume, int multimediaVolume, int alarmVolume, int notifications) {
        super(fabricante, marca, modelo, tipo, cpu, memory, ram, networks, battery, modoAvion, color, persona);
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.photoCamera = photoCamera;
        this.light = light;
        this.dactilarSensor = dactilarSensor;
        this.fmRadio = fmRadio;
        this.screenBright = screenBright;
        this.audiVolume = audiVolume;
        this.multimediaVolume = multimediaVolume;
        this.alarmVolume = alarmVolume;
        this.notifications = notifications;
    }

    // Metodos
}
