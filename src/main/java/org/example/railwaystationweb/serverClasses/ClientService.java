package org.example.railwaystationweb.serverClasses;

import org.example.railwaystationweb.dataClass.Clients;
import org.example.railwaystationweb.repositoryClasses.ClientsRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientsRepository clientsRepository;

    public ClientService(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    public Clients addNewClient(String lastName, String firstName, String typeDoc) {
        Clients newClient = new Clients();
        newClient.setLastName(lastName);
        newClient.setFirstName(firstName);
        newClient.setTypeDoc(typeDoc);

        return clientsRepository.save(newClient);  // Збереження в базу даних
    }
}
