package endereco.busca.localplace.serve;

import endereco.busca.localplace.client.EnderecoClient;
import endereco.busca.localplace.domain.Endereco;
import endereco.busca.localplace.exception.DadosInvalidosException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoClient enderecoClient;

    public Endereco findEnderecoByCep(String cep){

        return enderecoClient.getEnderecoByCep(cep);

    }
}
