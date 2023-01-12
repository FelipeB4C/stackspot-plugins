package {{global_computed_inputs.base_package}}.security;

import org.springframework.validation.FieldError;

public class DadosErroValidacao {

    private String campo;
    private String mensagem;

    public DadosErroValidacao(FieldError erro) {
        this.campo = erro.getField();
        this.mensagem = erro.getDefaultMessage();
    }

}
