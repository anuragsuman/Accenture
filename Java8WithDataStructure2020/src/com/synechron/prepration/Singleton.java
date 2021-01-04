package com.synechron.prepration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Singleton implements Serializable, Cloneable {
    // private static Singleton soleInstance = new Singleton(); // Eager initialization
    // Lazy initialization
    private static volatile Singleton soleInstance = null;
    private Singleton(){
        // prevent from Reflection
        if(soleInstance != null){
            throw new RuntimeException("Can not create new instance");
        }
        System.out.println("Creating..");
    }
    //double check locking for multiple threads
    public static Singleton getInstance(){
        if(soleInstance == null){       //check1
            synchronized (Singleton.class) {
                if(soleInstance == null) {      // check 2
                    soleInstance = new Singleton();
                }
            }
        }
        return soleInstance;
    }
    private Object readResolve() throws ObjectStreamException{
        System.out.println("...read resolve..");
        return soleInstance;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //prevent from cloning
        //throw new CloneNotSupportedException("Can not clone singleton object.");
        return super.clone();
    }
}
class TestClass{
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        print("s1", s1);
        print("s2", s2);
        if(s1.hashCode() == s2.hashCode()){
            System.out.println("same");
        }
        // Reflection API to create another Single instance
        /*Class clazz = Class.forName("DesignPatterns.Singleton");
        Constructor<Singleton> ctor = clazz.getDeclaredConstructor();
        ctor.setAccessible(true);
        Singleton s3 = ctor.newInstance();
        print("s3", s3);*/

        // Serialize and Deserialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/aakas/Desktop/s2.ser"));
        oos.writeObject(s2);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/aakas/Desktop/s2.ser"));
        Singleton s4 = (Singleton) ois.readObject();
        print("s4", s4);
        // Cloneable
        Singleton s5 = (Singleton) s1.clone();
        print("s5", s5);
        // Multi-Threading
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(TestClass::useSingleton);
        service.submit(TestClass::useSingleton);
        service.shutdown();
    }

    // Multi-Threading
    public static void useSingleton(){
        Singleton thread = Singleton.getInstance();
        print(Thread.currentThread().getName(), thread);
    }

    static void print(String name, Singleton object){
        System.out.println(String.format("Object: %s, Hashcode: %d",
                name, object.hashCode()));
    }
}