public class Networks {

    // 1. Atributos

    protected boolean wifi;
    protected String modelWifi;

    protected boolean bluetooth;
    protected boolean Gps;

    protected boolean Gprs;
    protected String modelGprs;

    // 2. Constructor vacío:
    public Networks(){}

    //Constructor con todos los parametros:

    public Networks(boolean wifi, String modelWifi, boolean bluetooth, boolean gps, boolean gprs, String modelGprs) {
        this.wifi = wifi;
        this.modelWifi = modelWifi;
        this.bluetooth = bluetooth;
        Gps = gps;
        Gprs = gprs;
        this.modelGprs = modelGprs;
    }

    // 3. Metodos

    @Override
    public String toString() {
        return "Networks{" +
                "wifi=" + wifi +
                ", modelWifi='" + modelWifi + '\'' +
                ", bluetooth=" + bluetooth +
                ", Gps=" + Gps +
                ", Gprs=" + Gprs +
                ", modelGprs='" + modelGprs + '\'' +
                '}';
    }
}
