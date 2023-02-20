public class Ram {

    // 1. Atributos
    protected String modelRam;
    protected float ramCapacity;

    // 2. Constructor vacío
    public Ram(){}

    //Constructor con todos los parámetros:

    public Ram(String modelRam, float ramCapacity) {
        this.modelRam = modelRam;
        this.ramCapacity = ramCapacity;
    }

    // 3. Metodos

    @Override
    public String toString() {
        return "Ram{" +
                "modelRam='" + modelRam + '\'' +
                ", ramCapacity=" + ramCapacity +
                '}';
    }
}
