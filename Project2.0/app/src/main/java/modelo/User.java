package modelo;

/**
 * Created by atecdroid on 7/27/16.
 */
public class User {

    // login
    protected String username, password;
    // personal details
    protected String nome, apelido;

    // constructors
    public User() {}
    public User(String username, String password, String nome, String apelido) {
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.apelido = apelido;
    }
    //getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getNome() { return nome; }
    public String getApelido() { return apelido; }

    //setters
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setNome(String nome) {this.nome = nome;}
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
