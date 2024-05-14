import java.util.Random;

class Airplane {
    private static int serialNumberCounter = 1000;
    protected int serialNumber;
    protected int capacity;

    public Airplane(int capacity) {
        this.serialNumber = generateSerialNumber();
        this.capacity = capacity;
    }

    private static int generateSerialNumber() {
        return serialNumberCounter++;
    }

    @Override
    public String toString() {
        return "Type: " + getClass().getSimpleName() + ", Serial Number: " + serialNumber + ", Capacity: " + capacity;
    }
}

class B747 extends Airplane {
    public B747(int capacity) {
        super(capacity);
    }
}

class B757 extends Airplane {
    public B757(int capacity) {
        super(capacity);
    }
}

class B767 extends Airplane {
    public B767(int capacity) {
        super(capacity);
    }
}

public class AirplaneDemo {
    public static void main(String[] args) {
        Airplane[] airplanes = new Airplane[5];
        airplanes[0] = new B747(400);
        airplanes[1] = new B757(200);
        airplanes[2] = new B767(300);
        airplanes[3] = new B747(350);
        airplanes[4] = new B757(220);

        for (Airplane airplane : airplanes) {
            System.out.println(airplane);
        }
    }
}
