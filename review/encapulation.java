class encapsulation {
    private int a;

    public void set(int a) {
        if (a < 0) {
            System.out.println("Invalid value");
            return;
        }
        this.a = a;
    }

    public int get() {
        return a;
    }
}
