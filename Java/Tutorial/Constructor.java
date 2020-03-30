class Constructor {

    private int x;

    private Constructor() {
        System.out.println("Construtor called");
        x = 5;
    }

    public static void main(String[] args) {
        
        Constructor obj = new Constructor();
        System.out.println("Value of x = " + obj.x);
    }
}