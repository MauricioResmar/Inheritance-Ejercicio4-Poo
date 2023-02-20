public class Memory {

    // 1. Atributos
    protected String memory;
    protected float capacityMemory;

    // 2. Constructor vacío
    public Memory(){}

    // Constructor con todos los parámetros:


    public Memory(String memory, float capacityMemory) {
        this.memory = memory;
        this.capacityMemory = capacityMemory;
    }
    //3. Metodos

    @Override
    public String toString() {
        return "Memory{" +
                "memory='" + memory + '\'' +
                ", capacityMemory=" + capacityMemory +
                '}';
    }
}
