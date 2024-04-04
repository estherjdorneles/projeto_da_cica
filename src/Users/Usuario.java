package Users;

public class Usuario {
    // Atributos
    public String name;
    public String email;
    public Boolean legalAge;

    /**
     * Construtor
     * @param name
     * @param email
     * @param legalAge
     */

    public Usuario(String name, String email, Boolean legalAge) {
        this.name = name;
        this.email = email;
        this.legalAge = legalAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getLegalAge() {
        return legalAge;
    }

    public void setLegalAge(Boolean legalAge) {
        this.legalAge = legalAge;
    }
}
