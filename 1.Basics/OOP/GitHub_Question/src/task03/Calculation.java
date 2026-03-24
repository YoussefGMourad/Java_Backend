package task03;

public class Calculation {
    private float numberone;
    private float numbertwo;
    private float numberthree;

    public void setNumberone(float numberone) {

        if (numberone % 2 == 0) {
            this.numberone = numberone;
        } else {
            throw new IllegalArgumentException("Enter an Even number");
        }
    }

    public void setNumbertwo(float numbertwo) {
        if (numbertwo % 2 == 0) {
            this.numbertwo = numbertwo;
        } else {
            throw new IllegalArgumentException("Enter an Even number");
        }
    }

    public void setNumberthree(float numberthree) {
        if (numberthree % 2 == 0) {
            this.numberthree = numberthree;
        } else {
            throw new IllegalArgumentException("Enter an Even number");
        }
    }

    public float getNumberone() {
        return numberone;
    }

    public float getNumbertwo() {
        return numbertwo;
    }

    public float getNumberthree() {
        return numberthree;
    }

    public void printTheSum(){
        System.out.println("The sum of the three even numbers is " + (getNumberone() +getNumbertwo()+getNumberthree()));
    }

}
