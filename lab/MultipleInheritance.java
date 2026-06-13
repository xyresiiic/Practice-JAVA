public class MultipleInheritance implements Bike, Car {

    @Override
    public void honda() {
        System.out.println("Honda");
    }

    @Override
    public void verna() {
        System.out.println("Hyndai Verna");
    }

    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.honda();
        mi.verna();
    }


}

interface Bike {
    void honda();
    
}

interface Car {
    void honda();
    void verna();
}