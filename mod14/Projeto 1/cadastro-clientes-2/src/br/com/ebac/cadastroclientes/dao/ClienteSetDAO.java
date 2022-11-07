package br.com.ebac.cadastroclientes.dao;

import br.com.ebac.cadastroclientes.domain.Cliente;

import java.util.*;

public class ClienteSetDAO implements IClienteDAO{
    private Set<Map.Entry<Long, Cliente>> set;

    public ClienteSetDAO(){
        set = new HashSet<Map.Entry<Long, Cliente>>();
    }
    @Override
    public Boolean cadastrar(Cliente cliente) {

        Map.Entry<Long, Cliente> entry = getCliente(cliente.getCpf());
        if(entry != null){
            return false;
        }
        set.add(new AbstractMap.SimpleEntry<>(cliente.getCpf(), cliente));
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        this.set.remove(getCliente(cpf));
    }

    @Override
    public void alterar(Cliente cliente) {

        Map.Entry<Long, Cliente> entry = getCliente(cliente.getCpf());

        if(entry != null){
            Cliente clienteCadastrado = entry.getValue();
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setCpf(cliente.getCpf());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        Map.Entry<Long, Cliente> entry = getCliente(cpf);
        if (entry != null)
            return entry.getValue();
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        Collection<Cliente> collection = new HashSet<>();
        for(Map.Entry<Long, Cliente> entry : this.set){
            collection.add(entry.getValue());
        }
        return collection;
    }

    private Map.Entry<Long, Cliente> getCliente(Long cpf){
        for(Map.Entry<Long, Cliente> entry : this.set){
            if(entry.getKey().equals(cpf)){
                return entry;
            }
        }
        return null;
    }
}
