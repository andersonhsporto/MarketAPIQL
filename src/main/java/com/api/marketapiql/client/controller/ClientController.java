package com.api.marketapiql.client.controller;

import com.api.marketapiql.client.domain.Client;
import com.api.marketapiql.client.domain.ClientInputDTO;
import com.api.marketapiql.client.domain.ClientService;
import com.api.marketapiql.client.domain.Product;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.Collection;

@Controller
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @QueryMapping
    public Client clientById(@Argument Long id) {
        return clientService.findById(id);
    }

    @SchemaMapping
    public Collection<Client> clients(Product product) {
        return clientService.findAllByProductId(product.getId());
    }

    @MutationMapping
    public Client createClient(@Argument ClientInputDTO clientInputDTO) {
        return clientService.createClient(clientInputDTO);
    }

}
