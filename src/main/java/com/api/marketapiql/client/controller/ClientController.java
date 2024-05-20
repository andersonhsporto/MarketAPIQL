package com.api.marketapiql.client.controller;

import com.api.marketapiql.client.domain.Client;
import com.api.marketapiql.client.domain.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @QueryMapping
    public Client clientById(@Argument Long id) {
        return clientService.findById(id);
    }
}
