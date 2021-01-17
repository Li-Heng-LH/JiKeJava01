package me.liheng.tryClassLoaders;

import com.sun.javafx.util.Logging;

import java.util.ArrayList;

public class TryClassLoaders {

    public static void main(String[] args) {

        //AppClassLoader
        System.out.println("Classloader of this class:" + TryClassLoaders.class.getClassLoader());

        //ExtClassLoader
        System.out.println("Classloader of Logging:" + Logging.class.getClassLoader());

        //null (bootstrap class loader)
        System.out.println("Classloader of ArrayList:" + ArrayList.class.getClassLoader());

        //getParent() on AppClassLoader -> ExtClassLoader
        System.out.println("getParent() on AppClassLoader: " + TryClassLoaders.class.getClassLoader().getParent());

        //getParent() on ExtClassLoader -> null(bootstrap class loader)
        System.out.println("getParent() on ExtClassLoader: " + Logging.class.getClassLoader().getParent());

        //getSuperclass() on AppClassLoader -> URLClassLoader
        System.out.println("getSuperclass() on AppClassLoader" + TryClassLoaders.class.getClassLoader().getClass().getSuperclass());

        //getSuperclass() on ExtClassLoader -> URLClassLoader
        System.out.println("getSuperclass() on ExtClassLoader" + Logging.class.getClassLoader().getClass().getSuperclass());
    }

}
