package beratz.utilizacion;

import beratz.framework.Accion;

public class Accion2 implements Accion {

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando");
        System.out.println("Devuelve un dato");
    }

    @Override
    public String nombreItemMenu() {
        return "Ejecutar accion 2";
    }

    @Override
    public String descripcionItemMenu() {
        return "Prueba nro2";
    }
}
