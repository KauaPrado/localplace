package endereco.busca.localplace.controller;

import endereco.busca.localplace.domain.Endereco;
import endereco.busca.localplace.serve.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService service;

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> findByCep(@PathVariable String cep){
        return ResponseEntity.ok(service.findEnderecoByCep(cep));
    }
}
