package day62_Generics_Class_Method;

//Generic Box Class
//Logic: Store any type and retrieve it safely.

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class BoxMain {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);
        Box<String> strBox = new Box<>("Hello");

        System.out.println(intBox.getValue()); // 10
        System.out.println(strBox.getValue()); // Hello
    }
}

//Dry Run:
//intBox = Box<Integer>(10) → value = 10
//getValue() → returns 10