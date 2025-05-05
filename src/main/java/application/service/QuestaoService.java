package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Questao;
import application.record.QuestaoDTO;
import application.repository.QuestaoRepository;

@Service
public class QuestaoService {
    @Autowired
    private QuestaoRepository questaoRepo;

    public Iterable<QuestaoDTO> getAll() {
        return questaoRepo.findAll().stream().map(QuestaoDTO::new).toList();
    }

    public QuestaoDTO insert(QuestaoDTO questao) {
        return new QuestaoDTO(questaoRepo.save(new Questao(questao)));
    } 
}