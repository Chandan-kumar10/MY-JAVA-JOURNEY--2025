
class SwappingNumber {

    public static void Swapping() {
        int a = 20;
        int b = 40;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Before Swapping: a was :" + b + " and b was: " + a);
        System.out.println("After Swapping a becomes:" + a);
        System.out.println("After Swpping b becomes:" + b);
    }

    public static void main(String[] args) {
        Swapping();
    }
}
