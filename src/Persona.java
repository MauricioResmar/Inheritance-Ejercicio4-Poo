public class Persona {
    // 1. Atributos

    protected String nameUser;
    protected String phoneNumber;
    protected String idUser;
    protected String passwordUser;

    // 2. Constructor vacío:
    public Persona(){}

    // Constructor con todos los parametros:

    public Persona(String nameUser, String phoneNumber, String idUser, String passwordUser) {
        this.nameUser = nameUser;
        this.phoneNumber = phoneNumber;
        this.idUser = idUser;
        this.passwordUser = passwordUser;
    }

    // 3. Metodos

    @Override
    public String toString() {
        return "Persona{" +
                "nameUser='" + nameUser + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", idUser='" + idUser + '\'' +
                ", passwordUser='" + passwordUser + '\'' +
                '}';
    }
}
