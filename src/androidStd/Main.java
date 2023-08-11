package androidStd;

public class Main {
    public static void main(String[] args) {
        patient patient = new patient("AJ", 20,
                new Eye("left Eye", "Normal", "Blue", true),
                new Eye("right Eye", "short Sighted", "Light Blue", false),
                new skin("Skin", "Warm", "Brown", 65),
                new stomach("Stomach", "Normal", false),
                new Heart("Heart", "Normal", 68));
        System.out.println("Name : " + patient.getName());
        System.out.println("Age : " + patient.getAge());
    }
}
