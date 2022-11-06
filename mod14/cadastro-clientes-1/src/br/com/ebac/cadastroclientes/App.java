package br.com.ebac.cadastroclientes;

import br.com.ebac.cadastroclientes.dao.ClienteSetDAO;
import br.com.ebac.cadastroclientes.dao.IClienteDAO;
import br.com.ebac.cadastroclientes.domain.Cliente;

import javax.swing.*;

public class App {
    private static IClienteDAO iClienteDAO;

    public static void main(String[]args){

        //iClienteDAO = new ClienteMapDAO();
        iClienteDAO = new ClienteSetDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite:\n 1 para cadastro\n 2 para consulta\n 3 para exclusão\n 4 para alteração\n 5 para exibir todos\n 0 para sair",
                "Escolha uma opção",
                JOptionPane.INFORMATION_MESSAGE);

        while(isOpcaoCadastro(opcao)){
            if (isOpcaoSair(opcao)) {
                sair();
            }else if(isCadastro(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vírgula\nExemplo: Nome,CPF,Telefone,Endereço,Numero,Cidade,Estado",
                        "Cadastro",
                        JOptionPane.INFORMATION_MESSAGE);
                cadastar(dados);

            }else if(isConsultar(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o cpf",
                        "Consultar",
                        JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);

            }else if(isExcluir(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o cpf",
                        "Exclusao",
                        JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            }else if(isAlterarCadastro(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vírgula\nExemplo: Nome,CPF,Telefone,Endereço,Numero,Cidade,Estado",
                        "Alterar Cadastro",
                        JOptionPane.INFORMATION_MESSAGE);
                alterarCadastro(dados);

            }else if(isMostrarTodos(opcao)){
                JOptionPane.showMessageDialog(null, mostrarTodos(), "Todos os clientes", JOptionPane.INFORMATION_MESSAGE);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite:\n 1 para cadastro\n 2 para consulta\n 3 para exclusão\n 4 para alteração\n 5 para exibir todos\n 0 para sair",
                    "Escolha uma opção",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        //Validar se foi passado o CPF
        Cliente cliente = iClienteDAO.consultar(Long.valueOf(dados));
        if(cliente != null)
            JOptionPane.showMessageDialog(null, cliente.toString(), "Cliente encontrado", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Cliente Não encontrado", "Não foi possível localizar o cliente", JOptionPane.ERROR_MESSAGE);
    }

    private static void cadastar(String dados) {
        String[] dadosSeparados = dados.split(",");

        if(dadosSeparados.length != 7){
            JOptionPane.showMessageDialog(null, "Dados preenchidos incorretamente", "Dados incorretos", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente(dadosSeparados[0],
                dadosSeparados[1],
                dadosSeparados[2],
                dadosSeparados[3],
                dadosSeparados[4],
                dadosSeparados[5],
                dadosSeparados[6]);

        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);

        if(isCadastrado){
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado", "Mensagem", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void alterarCadastro(String dados){
        String[] dadosSeparados = dados.split(",");

        if(dadosSeparados.length != 7){
            JOptionPane.showMessageDialog(null, "Dados preenchidos incorretamente", "Dados incorretos", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente(dadosSeparados[0],
                dadosSeparados[1],
                dadosSeparados[2],
                dadosSeparados[3],
                dadosSeparados[4],
                dadosSeparados[5],
                dadosSeparados[6]);

        iClienteDAO.alterar(cliente);
        JOptionPane.showMessageDialog(null, "Dados alterados com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

    }

    private static void excluir(String cpf){
        iClienteDAO.excluir(Long.parseLong(cpf));
        JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String mostrarTodos(){
        String clientes = "";
        int cont = 1;
        for(Cliente cliente : iClienteDAO.buscarTodos()){
            clientes += cont + " - " + cliente.toString() + "\n";
            cont++;
        }
        return clientes;
    }

    private static boolean isOpcaoSair(String opcao) {
        if("0".equals(opcao)) return true;
        return false;
    }

    private static boolean isOpcaoCadastro(String opcao) {
        if("0".equals(opcao)
                || "1".equals(opcao)
                || "2".equals(opcao)
                || "3".equals(opcao)
                || "4".equals(opcao)
                || "5".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isCadastro(String opcao) {
        if("1".equals(opcao)) return true;
        return false;

    }

    private static boolean isConsultar(String opcao) {
        if("2".equals(opcao)) return true;
        return false;
    }

    private static boolean isExcluir(String opcao) {
        if("3".equals(opcao)) return true;
        return false;
    }

    private static boolean isAlterarCadastro(String opcao) {
        if("4".equals(opcao))return true;
        return false;
    }

    private static boolean isMostrarTodos(String opcao) {
        if("5".equals(opcao))return true;
        return false;
    }
    
    private static void sair(){
        JOptionPane.showMessageDialog(null,
                "Até logo",
                "Sair",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
