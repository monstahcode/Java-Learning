package POO.contar_empleados;

import java.util.Comparator;

public class EmpleadosOrdenar implements Comparator<Empleado> {
    
    @Override
    public int compare(Empleado o1, Empleado o2) {
        if (o1.getId() < o2.getId()){
            return -1;
        } else {
            if (o1.getId() > o2.getId()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
