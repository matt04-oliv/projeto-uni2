package java.br.com.hospital.model;

public class AgendaMedica {

    private String data;
    private String horarioFimInicio;

    public AgendaMedica() {}

    public AgendaMedica(String data, String horarioFimInicio) {
        this.data = data;
        this.horarioFimInicio = horarioFimInicio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorarioFimInicio() {
        return horarioFimInicio;
    }

    public void setHorarioFimInicio(String horarioFimInicio) {
        this.horarioFimInicio = horarioFimInicio;
    }

    // toString
    @Override
    public String toString() {
        return "AgendaMedica{" +
                "data='" + data + '\'' +
                ", horarioFimInicio='" + horarioFimInicio + '\'' +
                '}';
    }

}
