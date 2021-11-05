package co.edu.escuelaing.virtualization.SparkWebServer.Model;

public class NuevoMensaje {
    private String mensaje;
    private String fecha;

    public NuevoMensaje(String mensaje, String fecha) {
        setMensaje(mensaje);
        setFecha(fecha);
    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setFecha(String fecha) {

        this.fecha = fecha;
    }

    public String toString() {
        return "{\"mensaje\": " + "\"" + mensaje +  "\"" + ", \"fecha\": " + "\"" + fecha  +  "\"" + "}";
    }

    public String getFecha() {

        return fecha;
    }

    public String getMensaje() {
        return mensaje;
    }
}
