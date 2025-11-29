public interface AgendaMedicaDAO {

    void inserir(AgendaMedica agenda);
    void atualizar(AgendaMedica agenda);
    void deletar(int id);
    AgendaMedica buscarPorId(int id);
}
