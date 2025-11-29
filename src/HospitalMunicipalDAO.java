public interface HospitalMunicipalDAO {

    void inserir(HospitalMunicipal hospital);
    void atualizar(HospitalMunicipal hospital);
    void deletar(int id);
    HospitalMunicipal buscarPorId(int id);
}
