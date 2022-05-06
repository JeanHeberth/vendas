package com.github.jeanheberth.vendas.service;


import com.github.jeanheberth.vendas.model.Cliente;
import com.github.jeanheberth.vendas.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {


    private ClientesRepository clientesRepository;

    public ClienteService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }


    public void salvar(Cliente cliente) {
        validar_cliente(cliente);
        clientesRepository.persistir(cliente);

    }

    public void validar_cliente(Cliente cliente) {

        // Aplica validações
    }
}
