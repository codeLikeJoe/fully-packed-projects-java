package androidStd;

public class patient {
    private String name;
    private int age;
    private Eye leftEye;
    private Eye rightEye;
    private skin skin;
    private stomach stomach;
    private Heart heart;

    public patient(String name, int age, Eye leftEye, Eye rightEye,
                   androidStd.skin skin, androidStd.stomach stomach,
                   Heart heart) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.skin = skin;
        this.stomach = stomach;
        this.heart = heart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public void setRightEye(Eye rightEye) {
        this.rightEye = rightEye;
    }

    public androidStd.skin getSkin() {
        return skin;
    }

    public void setSkin(androidStd.skin skin) {
        this.skin = skin;
    }

    public androidStd.stomach getStomach() {
        return stomach;
    }

    public void setStomach(androidStd.stomach stomach) {
        this.stomach = stomach;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }
}
