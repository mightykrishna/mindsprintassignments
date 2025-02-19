package assign.to.us;


class FactorialTask implements Runnable {
    private int num;
    
    public FactorialTask(int num) {
        this.num = num;
    }
    
    private long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Factorial of " + num + " is: " + factorial(num));
    }
}

class AdditionTask implements Runnable {
    private int a, b;
    
    public AdditionTask(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Sum of " + a + " and " + b + " is: " + (a + b));
    }
}

public class AssignProcess {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new FactorialTask(5), "t1");
        Thread t2 = new Thread(new AdditionTask(10, 20), "t2");
        Thread t3 = new Thread(new FactorialTask(6), "t3");
        Thread t4 = new Thread(new AdditionTask(15, 25), "t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        
        t2.join();
        t4.join();
        t1.join();
        t3.join();
    }
}