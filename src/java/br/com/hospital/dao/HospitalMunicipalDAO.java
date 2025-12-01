package java.br.com.hospital.dao;

import java.br.com.hospital.model.HospitalMunicipal;

public interface HospitalMunicipalDAO {

    void inserir(HospitalMunicipal hospital);
    void atualizar(HospitalMunicipal hospital);
    void deletar(int id);
    HospitalMunicipal buscarPorId(int id);
}
