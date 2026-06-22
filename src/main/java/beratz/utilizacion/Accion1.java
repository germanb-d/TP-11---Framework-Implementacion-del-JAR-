package beratz.utilizacion;

import beratz.framework.Accion;

public class Accion1 implements Accion {

    @Override
    public void ejecutar() {
        System.out.println("aca entraria a la bd y retornaria");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion1";
    }

    @Override
    public String descripcionItemMenu() {
        return "retornar algo de la bd";
    }
}
