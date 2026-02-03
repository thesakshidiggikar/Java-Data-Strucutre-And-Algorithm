class Stackcreating {
    
    //array to store element
    private int[] arr;

    //maximum size of stack
    private int capacity;

    //index of top element
    private int top;

    //constructor
    public Stackcreating(int cap) {
        capacity = cap;
        arr = new int[capacity];
        top = -1;
    }
}