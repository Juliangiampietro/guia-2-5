public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("41854082", "julian", "giampietro", "juliangiampietor@gmail.com", "9 de julio", 2024, 25000.00, "Progra");
        Student s2 = new Student("41853082", "Pepe", "Lopez", "pepelopez@gmail.com", "belgrano", 2014, 365000.00, "Ing.Naval");

        StaffEmployee st1 = new StaffEmployee("54545454", "Julieta", "Perez", "juliperez23@gmail.com", "11 de septiembre 2323", 5442.00, "morning");
        StaffEmployee st2 = new StaffEmployee("47020166", "Mike", "Besancenet", "besancenetmicael2@gmail.com", "Rateriy 36", 0.00, "night");


        Person persons[] = {s1, s2, st1, st2};


        for(Person p1 : persons){
            System.out.println(p1.showPerson());
        }


}

}