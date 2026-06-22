package beratz.main;

import beratz.framework.Menu;

public class Main {

    public static void main(String args[]) {
        Menu m = new Menu("/config.properties");
//      Menu m = new Menu();
        m.iniciar();
    }
}
