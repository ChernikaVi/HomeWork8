package HW;
public class main {
    public static void main(String[] args) {

        Phone samsung = new Phone(336464230,"Samsung",250);
        Phone onePlus = new Phone(298932119,"OnePlus", 232);
        Phone huawei = new Phone(448767123,"Huawei", 270);

        System.out.println(samsung + "\n" + onePlus + "\n" + huawei + "\n");

        samsung.receiveCall("Chernika");
        onePlus.receiveCall("Honey");
        huawei.receiveCall("Unknown" + "\n");

        samsung.getNumber();
        onePlus.getNumber();
        huawei.getNumber();

        samsung.receiveCall( "Chernika", 336464230);

        onePlus.sendMessage(336464230,448767123,293456732);
    }
}
