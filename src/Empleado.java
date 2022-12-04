import java.util.Date;

public class Empleado {

    final String nombre;
    Date birthDate;

    Empleado(String name, Date birthDate) {
        this.nombre = name;
        this.birthDate = birthDate;
    }

    public String toString() {
        return "Empleado: " + nombre + " (nacido en 19" + birthDate.getYear() + ")";
    }
}
