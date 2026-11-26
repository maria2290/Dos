

import com.leidy.agendap.model.Cita;
import com.leidy.agendap.model.Servicio;




public class CitaDao {

    private ArrayList<Cita> citas = new ArrayList<>();

    public void agregar(Cita cita) {
        citas.add(cita);
    }

    public ArrayList<Cita> listar() {
        return citas;
    }

    public Cita buscar(int id) {
        for (Cita cita : citas) {
            if (cita.getIdCita() == id) {
                return cita;
            }
        }
        return null;
    }

    public boolean eliminar(int id) {
        Cita cita = buscar(id);

        if (cita != null) {
            citas.remove(cita);
            return true;
        }

        return false;
    }
}

    public boolean eliminar(int id) {
        Servicio servicio =  buscar(id);

        if (servicio != null) {
            Servicio.remove(servicio);
            return true;
        }

        return false;
    }

void main() {
}



