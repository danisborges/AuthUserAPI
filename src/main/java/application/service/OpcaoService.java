package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.record.OpcaoDTO;
import application.repository.OpcaoRepository;


@Service
public class OpcaoService {
    @Autowired
    private OpcaoRepository opcaoRepo;

    public Iterable<OpcaoDTO> getAll() {
        return opcaoRepo.findAll().stream().map(OpcaoDTO::new).toList(); 
    }
}
