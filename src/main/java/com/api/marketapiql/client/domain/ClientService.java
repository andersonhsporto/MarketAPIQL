package com.api.marketapiql.client.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client findById(Long id) {
        return clientRepository.findById(id).orElse(tempFactory());
    }

    private Client tempFactory() {
        return new Client(1L, "Frodo Baggins", "test", "test", null);
    }
}

