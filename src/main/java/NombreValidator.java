import java.util.InputMismatchException;

public class NombreValidator{
    public String esNombreValido(String mensaje) throws ExcepcionNombre {
        if (mensaje.matches("[a-zA-Z]+")) {
            return mensaje;
        } else {
            throw new ExcepcionNombre();
        }

    }
}
