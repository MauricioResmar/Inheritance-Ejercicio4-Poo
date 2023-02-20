
//SuperClase
public class SmartDevice {

    // 1. Atributos Generales y protegidos
    protected String fabricante;
    protected String marca;
    protected String modelo;
    protected String tipo; // ?
    Cpu cpu;
    Memory memory;

    Ram Ram;

    Networks networks;

    protected String battery;

    protected boolean modoAvion;
    protected String color;

    Persona persona;

    // 2. Metodos Constructores

    //Metodo Constructor vacio
    public SmartDevice(){};

    //Metodo constructor con todos los parametros

    public SmartDevice(String fabricante, String marca, String modelo, String tipo, Cpu cpu, Memory memory, Ram ram, Networks networks, String battery, boolean modoAvion, String color, Persona persona) {
        this.fabricante = fabricante;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cpu = cpu;
        this.memory = memory;
        Ram = ram;
        this.networks = networks;
        this.battery = battery;
        this.modoAvion = modoAvion;
        this.color = color;
        this.persona = persona;
    }


    // 3. Metodos / Funciones (Comportamiento)

        /*public void RunOs(){
        return;
        }*/

        public boolean CheckUserSession(String passwordUser ){
            if( passwordUser.equals("1234567")){
               return true;
            }
            else{
            return false;
            }
        }

        public void SwitchModoAvion(int estado){
            if(estado == 1) {
                this.modoAvion = true;
            }
            else{
                this.modoAvion = false;
            }

        }

}
