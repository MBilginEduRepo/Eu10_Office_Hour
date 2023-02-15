package week14.polymorphism.hospital;

public class Practice {

    static Employee nurse = new Nurse();
    static Employee doctor = new Doctor();



    public static void main(String[] args) {
//        Employee employee = new Employee();
        Employee employee1 = nurse;  // upcasting

        Nurse nurse2 = (Nurse)employee1;   //down casting

        if (nurse instanceof Nurse)

        nurse.performJob();
        doctor.performJob();
    }
}
