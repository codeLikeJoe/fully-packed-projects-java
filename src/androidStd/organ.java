package androidStd;

public class organ {
    private String name;
    private String medicalCondition;

    public organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public void getDetails() {
        System.out.println("Name: " + this.getName());
        System.out.println("Medical Condition: " + this.getMedicalCondition());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
}
