package endereco.busca.localplace.client;

import endereco.busca.localplace.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface EnderecoClient {
    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
    Endereco getEnderecoByCep(@PathVariable("cep") String cep);
}
