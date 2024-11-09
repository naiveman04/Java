class NumberPrinter extends Thread {
    private int start;
    private int end;

    // Constructor to set the range of numbers for this thread to print
    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds to simulate processing time
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        // Create two threads with different number ranges
        NumberPrinter printer1 = new NumberPrinter(1, 5);
        NumberPrinter printer2 = new NumberPrinter(6, 10);

        // Start both threads
        printer1.start();
        printer2.start();
    }
}
