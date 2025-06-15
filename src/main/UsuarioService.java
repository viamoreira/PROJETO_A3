package src.main;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

public class UsuarioService {

    public static List<Usuario> carregarUsuarios() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream input = UsuarioService.class.getClassLoader().getResourceAsStream("src/resources/data/Usuario.json");

            if (input == null) {
                System.err.println("Arquivo Usuario.json não encontrado no classpath!");
                return null;
            }

            return mapper.readValue(input, new TypeReference<List<Usuario>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}