package lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        // Criando Clientes
        Cliente jean = new Cliente("Jean Barcellos", "jeanbarcellos@hotmail.com");
        Cliente joao = new Cliente("João da Slva Santos", "joaosilva@hotmail.com");
        
        // Adicionando uma lista de clientes
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(jean);
        clientes.add(joao);
        
        // Exibindo a lista de clientes
        for(Cliente clienteExibir : clientes){
            System.out.println(clienteExibir.getNome());
        }
                

    }
    
}
