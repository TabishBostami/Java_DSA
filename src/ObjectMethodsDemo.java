public class ObjectMethodsDemo {
    public static void main(String[] args) {
        // Creating two objects for demonstration
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 1. equals(Object obj)
        boolean isEqual = obj1.equals(obj2);
        System.out.println("Are obj1 and obj2 equal? " + isEqual);

        // 2. hashCode()
        int hashCode1 = obj1.hashCode();
        int hashCode2 = obj2.hashCode();
        System.out.println("HashCode of obj1: " + hashCode1);
        System.out.println("HashCode of obj2: " + hashCode2);

        // 3. toString()
        String str = obj1.toString();
        System.out.println("String representation of obj1: " + str);

        // 4. getClass()
        Class<? extends Object> classOfObj1 = obj1.getClass();
        System.out.println("Class of obj1: " + classOfObj1);

        // 5. clone()
        try {
            Object clonedObj = obj1.clone();
            System.out.println("Cloned obj1: " + clonedObj);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported for obj1.");
        }

        // 6. finalize()
        // Since calling finalize() explicitly is deprecated and unreliable,
        // this method is not recommended to be demonstrated here.

        // 7. notify()

        // 8. notifyAll()

        // 9. wait()

        // 10. wait(long timeout)

        // 11. wait(long timeout, int nanos)
    }
}
