package io.github.mendesvalentim.service;

import io.github.mendesvalentim.model.Ocorrencia;
import io.github.mendesvalentim.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OcorrenciaService {

    private OcorrenciaRepository repository;

    @Autowired
    public OcorrenciaService(OcorrenciaRepository repository){
        this.repository = repository;
    }

    public void salvarOcorrencia(Ocorrencia ocorrencia){
        validarOcorrencia(ocorrencia);
        this.repository.persistir(ocorrencia);
    }

    public void validarOcorrencia(Ocorrencia ocorrencia){

    }

}
