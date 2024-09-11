public class StaffEmployee extends Person {
    private Double salary;
    private String shift;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        if (shift.compareTo("morning") == 0 || shift.compareTo("night") == 0) {
            this.shift = shift;
        } else {
            System.out.println("no se puede xd");
        }
    }


    public StaffEmployee(String DNI, String name, String surname, String email, String adress, Double salary, String shift) {
        super(DNI, name, surname, email, adress);
        this.salary = salary;
        if (shift.compareTo("morning") == 0 || shift.compareTo("night") == 0) {
            this.shift = shift;
        } else {
            System.out.println("no se puede xd");
        }
    }

    public StaffEmployee(Double salary, String shift) {
        this.salary = salary;
        if (shift.compareTo("morning") == 0 || shift.compareTo("night") == 0) {
            this.shift = shift;
        } else {
            System.out.println("no se puede xd");
        }
    }

    public StaffEmployee() {
    }
    @Override
    public String showPerson(){
        return "El dni es: " + super.getDNI() + " El nombre es: " + super.getName() + " El apellido es: " + super.getSurname()+ " El email es: " + super.getEmail() + " La direccion es: " + super.getAdress() + " El turno es: " + this.shift + "El salario es: " + this.salary;
    }
}
