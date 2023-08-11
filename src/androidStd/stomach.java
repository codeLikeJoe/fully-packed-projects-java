package androidStd;

public class stomach extends organ {
    private boolean isEmpty;

    public stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if (this.isEmpty()) {
            System.out.println("Need to be feed");
        } else {
            System.out.println("Stomach is full");
        }
    }

    public void digest() {
        System.out.println("Digesting...");
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
