import java.util.ArrayList;
import java.util.List;
// Definición de un evento personalizado
class Evento {
    private String mensaje;
    public Evento(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getMensaje() {
        return mensaje;
    }
}
// Clase que emite eventos
class Emisor {
    private List<Listener> listeners = new ArrayList<>();
    public void agregarListener(Listener listener) {
        listeners.add(listener);
    }
    public void notificarEventos(String mensaje) {
        Evento evento = new Evento(mensaje);
        for (Listener listener : listeners) {
            listener.eventoOcurrido(evento);
        }
    }
}
// Interfaz de un observador de eventos
interface Listener {
    void eventoOcurrido(Evento evento);
}


