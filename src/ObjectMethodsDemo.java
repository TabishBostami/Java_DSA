public class ObjectMethodsDemo {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        // toString() method
        Object obj1 = new Object();
        System.out.println("toString(): " + obj1.toString());

        // equals() method
        Object obj2 = new Object();
        Object obj3 = obj2;
        System.out.println("equals(): " + obj2.equals(obj3));

        // hashCode() method
        System.out.println("hashCode(): " + obj1.hashCode());

        // getClass() method
        System.out.println("getClass(): " + obj1.getClass().getName());

        // clone() method
        Object obj4 = obj1;
        Object obj5 = obj1.clone();
        System.out.println("clone(): " + (obj1 == obj4)); // true - same reference
        System.out.println("clone(): " + (obj1 == obj5)); // false - different reference

        // finalize() method (deprecated)
        Object obj6 = new Object();
        obj6 = null;
        System.gc(); // Calls the garbage collector

        // wait(), notify(), notifyAll() methods (used in a synchronized context)
        final Object lock = new Object();
        new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(); // Thread waits until notify() or notifyAll() is called
                    System.out.println("Thread awakened.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.sleep(1000); // Wait to ensure the other thread starts waiting
        synchronized (lock) {
            lock.notify(); // Wakes up one waiting thread
            // lock.notifyAll(); // Wakes up all waiting threads
        }

        // getClassLoader() method
        ClassLoader classLoader = obj1.getClass().getClassLoader();
        System.out.println("getClassLoader(): " + classLoader);

        // wait(long timeout), wait(long timeout, int nanos) methods (used in a synchronized context)
        synchronized (lock) {
            lock.wait(1000); // Thread waits for 1 second or until notify() or notifyAll() is called
            System.out.println("Thread awakened after waiting for 1 second.");
        }
    }
}
