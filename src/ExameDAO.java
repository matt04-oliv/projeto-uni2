public interface ExameDAO {

    void inserir(Exame exame);
    void atualizar(Exame exame);
    void deletar(int id);
    Exame buscarPorId(int id);
}
