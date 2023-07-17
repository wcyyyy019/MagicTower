package test;

public class Test1 {
    public static void main(String[] args) {
        Boolean[] isFirst = new Boolean[30];
        for (Boolean aBoolean : isFirst) {
            aBoolean = true;
        }
        System.out.println(isFirst[3]);
    }
}
