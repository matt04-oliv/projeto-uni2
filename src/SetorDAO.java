public interface SetorDAO {

    void inserir(Setor setor);
    void atualizar(Setor setor);
    void deletar(int id);
    Setor buscarPorId(int id);
}
