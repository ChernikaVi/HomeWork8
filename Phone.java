package HW;

import java.util.Arrays;
import java.util.StringJoiner;

public class Phone {
    int number;
    String model;
    int weight;


    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public Phone (int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Phone.class.getSimpleName() + "[", "]")
                .add("Number: " + number)
                .add("Model: " + model)
                .add("Weight: " + weight)
                .toString();
    }

    public void receiveCall(String name) {
        System.out.println("Call from: " + name);
    }

    public int getNumber() {
        System.out.println("Phone number: " + number);
        return number;
    }

    public void receiveCall(String name, int number) {
        System.out.println("\n" + "Call from " + name + "\t" + number + "\n");
    }

    public void sendMessage(int... numbers){
        System.out.println("Message is sent to phone numbers: " + Arrays.toString(numbers));
    }
}
