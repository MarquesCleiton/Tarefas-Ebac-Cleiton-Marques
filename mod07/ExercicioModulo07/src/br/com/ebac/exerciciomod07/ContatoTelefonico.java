package br.com.ebac.exerciciomod07;

/**
 * @author Cleiton Marques
 */
public class ContatoTelefonico {
    private String nome;
    private String apelido;
    private int telefoneFixo;
    private int celular;
    private String endereco;
    private String email;

    /**
     * @return retorna o nome do contato.
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome guarda o nome do contato.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return retorna o apelido do contato.
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido guarda o apelido do contato.
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * @return retorna o número do telefone fixo do contato.
     */
    public int getTelefoneFixo() {
        return telefoneFixo;
    }

    /**
     * @param telefoneFixo guarda o apelido do contato.
     */
    public void setTelefoneFixo(int telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    /**
     * @return retorna o número do telefone celular do contato.
     */
    public int getCelular() {
        return celular;
    }

    /**
     *
     * @param celular guarda o número do telefone celular do contato.
     */
    public void setCelular(int celular) {
        this.celular = celular;
    }
    /**
     * @return retorna o endereço do contato.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     *
     * @param endereco guarda o endereço do contato.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return retorna o endereço de email do contato.
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email guarda o endereco de email do contato.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna uma mensagem com as informações do contato salvo na agenda.
     * @deprecated
     * @see ContatoTelefonico#exibeContatoTelefonico()
     */
    public void exibeContato(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Apelido: " + this.apelido);
        System.out.println("Telefone fixo: " + this.telefoneFixo);
        System.out.println("Celular: " + this.celular);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Email: " + this.email);

    }

    /**
     * Retorna uma mensagem com as informações do contato salvo na agenda.
     */
    public void exibeContatoTelefonico(){
        System.out.println("****************************************");
        System.out.println("Contato_telefônico_de: " + this.getNome());
        System.out.println("Apelido_____________: " + this.getApelido());
        System.out.println("Telefone_fixo_______: " + this.getTelefoneFixo());
        System.out.println("Celular_____________: " + this.getCelular());
        System.out.println("Endereço____________: " + this.getEndereco());
        System.out.println("Email_______________: " + this.getEmail());
        System.out.println("****************************************");

    }
}
