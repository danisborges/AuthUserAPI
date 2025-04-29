package application.record;

import application.model.Opcao;

public record OpcaoDTO(long id, String descricao) {
    public OpcaoDTO(Opcao model) {
        this(model.getId(), model.getDescricao());
    }
}