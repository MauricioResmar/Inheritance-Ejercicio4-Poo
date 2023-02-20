public class Cpu {

    // 1. atributos

    protected String cpu;
    protected double freqCpu;

    // 2. Metodo Constructor vacío
    public Cpu(){}

    //  Metodo constructor con Parametros

    public Cpu(String cpu, double freqCpu) {
        this.cpu = cpu;
        this.freqCpu = freqCpu;
    }

    // 3. Metodos

    @Override
    public String toString() {
        return "Cpu{" +
                "cpu='" + cpu + '\'' +
                ", freqCpu=" + freqCpu +
                '}';
    }
}
