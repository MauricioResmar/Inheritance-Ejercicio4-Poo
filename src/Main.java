public class Main {

    //Creación e instancias de objetos:
    public static void main(String[] args) {

        // 1. Creando Clases y objeto: Clase identificador = new Clase();

        // Creamos objeto de la clase SmartDevice utilizando el constructor vacío:

        SmartDevice Esp32 = new SmartDevice();

        //Creamos objeto de la clase SmartDevice utilizando el constructor con todos los parámetros:

        Cpu cpuEsp32 = new Cpu("Tensilica Xtensa LX6",240L);
        Memory memoryEsp32 = new Memory("SD Externa",4000);
        Ram ramEsp32 = new Ram("SRAM KiB",520);
        Networks networksEsp32 = new Networks(true,"802.11 b/g/n",true,false,true,"4GModule");
        Persona personaEsp32 = new Persona("Mauricio","3505730676","1094915147","1234567");

        SmartDevice microEsp32 = new SmartDevice("Espressif","Sigma Electronica","Esp32","iot",cpuEsp32,memoryEsp32,ramEsp32,networksEsp32,"3VDc",false,"Negro",personaEsp32);

        System.out.println("\nCreamos Objeto instanciado desde la superclase SmartDevice utilizando constructor con todos los parametros:\n");
        System.out.println(microEsp32.fabricante);
        System.out.println(microEsp32.marca);
        System.out.println(microEsp32.modelo);
        System.out.println(microEsp32.tipo);
        System.out.println(microEsp32.cpu);
        System.out.println(microEsp32.memory);
        System.out.println(microEsp32.Ram);
        System.out.println(microEsp32.networks);
        System.out.println(microEsp32.battery);
        System.out.println(microEsp32.color);
        System.out.println(microEsp32.persona);

        System.out.println("\nHacemos uso de metodo CheckUserSession el cual valida la clave de usuario: ");
        System.out.println("\nLos datos de inicio de sesion para tu SmartDevice son: " + microEsp32.CheckUserSession("1234567"));

        // 2. Herencia utilizando la clase derivada SmartPhone:

        SmartPhone motoE4 = new SmartPhone();
        Cpu cpuMotoE4 = new Cpu("Mediatek Quad-Core",1.3);

        motoE4.fabricante = "Motorola";
        motoE4.marca = "Moto";
        motoE4.modelo = "E4 Plus";
        motoE4.tipo = "SmartPhone";
        motoE4.cpu = cpuMotoE4;

        System.out.println("\nUtilizando la herencia de clases, creamos el objeto motoE4 de la clase derivada SmartPhone con algunos parametros:\n");
        System.out.println(motoE4.fabricante);
        System.out.println(motoE4.marca);
        System.out.println(motoE4.modelo);
        System.out.println(motoE4.tipo);
        System.out.println(motoE4.cpu);
        System.out.println("\nModoAvion: " + motoE4.modoAvion);

        // Polimorfismo para acceder al metodo Modo Avion de la SuperClase:
        SmartDevice smartDevice;

        smartDevice = new SmartPhone();
        smartDevice.SwitchModoAvion(1);
        System.out.println("\nModo avion activado haciendo uso de Polimorfismo y mediante el metodo SwitchModoAvion de la superclase SmartDevice: " + smartDevice.modoAvion);

        // Herencia utilizando la clase derivada SmartWatch:

        SmartWatch casioEWatch = new SmartWatch();
        Cpu cpuCasioE = new Cpu("CasioQuad",1.0);

        casioEWatch.fabricante = "Casio Company";
        casioEWatch.marca = "CasioWatchlife";
        casioEWatch.tipo = "SmartWatch";
        casioEWatch.bioLaserSensor = true;
        casioEWatch.cpu = cpuCasioE;

        System.out.println("\nUtilizando la herencia de clases, creamos el objeto casioEWatch de la clase derivada SmartWatch con algunos parametros especialiados:\n");
        System.out.println("Fabricante: " + casioEWatch.fabricante);
        System.out.println("Marca: " + casioEWatch.marca);
        System.out.println("Tipo: " + casioEWatch.tipo);
        System.out.println("Cpu: " + casioEWatch.cpu);
        System.out.println("Bio laser sensor estado: " + casioEWatch.bioLaserSensor);

        // Polimorfismo para acceder al metodo CheckUserSession de la SuperClase SmartDevice desde la clase derivada SmartWatch:

        smartDevice = new SmartWatch();

        System.out.println("\nAccedemos al metodo CheckUserSession de la superclase, utilizando Polimorfismo:\nLos datos de inicio de sesion para tu SmartWatch son: " + casioEWatch.CheckUserSession("12345867"));

    }
}