public class EjemploParadigmaEventosJava {
    public static void main(String[] args) {
        Emisor emisor = new Emisor();

        // Agregar un observador (listener)
        emisor.agregarListener(new Listener() {
            @Override
            public void eventoOcurrido(Evento evento) {
                System.out.println("Evento ocurrido: " + evento.getMensaje());
            }
        });

        // Emitir un evento
        emisor.notificarEventos("Esto es un evento de ejemplo.");
    }
}
