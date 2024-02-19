package POO.contar_empleados;

import java.util.ArrayList;
import java.util.Collections;

public class ListaEmplados {
    ArrayList<Empleado> lista;
    
    public ListaEmplados() {
        lista = new ArrayList<Empleado>();

        lista.add(new Empleado(1,"a","b",2000));
        lista.add(new Empleado(3,"bv","uqno",2171));
        lista.add(new Empleado(5,"we","ani",2678));
        lista.add(new Empleado(4,"da","abn",2849));
        lista.add(new Empleado(7,"ada","ghal",2529));
        lista.add(new Empleado(9,"fad","nfuk",2859));
        lista.add(new Empleado(8,"kjl","afnl",2527));
        lista.add(new Empleado(0,"ynvnu","daf",2989));
    }

    public void ordenarPorId() {
        Collections.sort(lista,new EmpleadosOrdenar());
    }

    public void mostar() {
        System.out.println(lista);
    }
}
