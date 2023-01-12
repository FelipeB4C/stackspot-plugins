package {{global_computed_inputs.base_package}}.security;

public class DadosTokenJWT {

    private String token;

    public DadosTokenJWT(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}