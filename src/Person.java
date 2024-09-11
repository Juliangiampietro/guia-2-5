public class Person {
    private String DNI;
    private String name;
    private String surname;
    private String email;
    private String adress;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Person(String DNI, String name, String surname, String email, String adress) {
        this.DNI = DNI;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.adress = adress;
    }

    public Person() {
    }

    public String showPerson(){
        return "El dni es: " + this.DNI + " El nombre es: " + this.name + " El apellido es: " + this.surname + " El email es: " + this.email + " La direccion es: " + this. adress;

    }
}
