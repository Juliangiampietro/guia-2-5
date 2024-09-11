public class Student extends Person{
    private Integer inscriptionYear;
    private Double monthlyFee;
    private String career;

    public Integer getInscriptionYear() {
        return inscriptionYear;
    }

    public void setInscriptionYear(Integer inscriptionYear) {
        this.inscriptionYear = inscriptionYear;
    }

    public Double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(Double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Student(String DNI, String name, String surname, String email, String adress, Integer inscriptionYear, Double monthlyFee, String career) {
        super(DNI, name, surname, email, adress);
        this.inscriptionYear = inscriptionYear;
        this.monthlyFee = monthlyFee;
        this.career = career;
    }

    public Student(Integer inscriptionYear, Double monthlyFee, String career) {
        this.inscriptionYear = inscriptionYear;
        this.monthlyFee = monthlyFee;
        this.career = career;
    }

    public Student() {
    }
    @Override
    public String showPerson(){
        return "El dni es: " + super.getDNI() + " El nombre es: " + super.getName() + " El apellido es: " + super.getSurname()+ " El email es: " + super.getEmail() + " La direccion es: " + super.getAdress() + "La carrera es : " + this.career + "Inicio en : " + this.inscriptionYear + "Cuota mensual es: " + this.monthlyFee;

    }

    @Override
    public String toString() {
        return "Student{" +
                "inscriptionYear=" + inscriptionYear +
                ", monthlyFee=" + monthlyFee +
                ", career='" + career + '\'' +
                '}';
    }
}
