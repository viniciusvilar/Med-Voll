package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
    @NotNull
    long id, 
    String nome, 
    String telefone, 
    DadosEndereco endereco) {
    
}
