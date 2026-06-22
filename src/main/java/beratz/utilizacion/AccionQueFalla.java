package beratz.utilizacion;

import beratz.framework.Accion;

// esta accion falla a proposito, para probar que el framework
// informe bien el error y no se cuelgue
public class AccionQueFalla implements Accion {

    @Override
    public void ejecutar() {
        System.out.println("Esto es parte de ejecutar");
        throw new RuntimeException("Fallo en algo");
    }

    @Override
    public String nombreItemMenu() {
        return "Accion con excepcion";
    }

    @Override
    public String descripcionItemMenu() {
        return "esto deberia tirar una excepcion y no romper todo";
    }
}
