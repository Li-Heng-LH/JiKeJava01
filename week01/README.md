# 学习笔记


## Some Learning Notes ##

### JDK VS JRE VS JVM ###
* JDK = JRE + development tools 
(an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc))
* JRE = JVM + core classes, and supporting files  
  If we need to execute java programmes on a machine, can just install JRE. 

&nbsp;

### Lifecycle of a class in JVM ###
* Loading -> Linking -> Initialising -> Using -> Unloading
* Linking is: Verification -> Preparation -> Resolution

&nbsp;

### Loading ###
* Class loaders are responsible for loading classes into memory.
* They are part of the JRE. 
* Hence, the JVM doesn't need to know about the underlying files or file systems in order to run Java programs.
* When the JVM requests a class, the class loader tries to locate the class and load the class definition into 
the runtime using the fully qualified class name.

&nbsp;

### Class loaders ###
* `abstract class ClassLoader`
* `class URLClassLoader extends SecureClassLoader`
* `class SecureClassLoader extends ClassLoader`


* `class AppClassLoader extends URLClassLoader`
* `class ExtClassLoader extends URLClassLoader`


* `public final ClassLoader getParent()` in ClassLoader.java:   
  Returns the parent class loader for delegation.

&nbsp;

### Bootstrap class loader ###
* part of the core JVM and is written in native code (C++). 
* serves as a parent of all the other ClassLoader instances.
* does not extend java.lang.ClassLoader. 
* loads typically `rt.jar` and other core libraries located in `$JAVA_HOME/jre/lib` directory

&nbsp;

### Extension class loader ###
* loads usually `$JAVA_HOME/lib/ext` directory

&nbsp;

### System/Application class loader ###
* loads all the application level classes
* It loads files found in the classpath environment variable, -classpath or -cp command line option.

&nbsp;

### Delegation Model ### 
* The java.lang.ClassLoader.loadClass() method is responsible for loading the class definition into runtime. 
* If the class isn't already loaded, it delegates the request to the parent class loader. This process happens recursively.
* Eventually, if the parent class loader doesn’t find the class, 
then the child class will call java.net.URLClassLoader.findClass() method to look for classes 
**in the file system** itself.
* If the **last child class loader** isn't able to load the class either, 
it throws java.lang.NoClassDefFoundError or java.lang.ClassNotFoundException.

&nbsp;

&nbsp;
----
### Useful links ###
* [The Java® Virtual Machine Specification](https://docs.oracle.com/javase/specs/jvms/se8/html/index.html)
* [Class Loaders in Java](https://www.baeldung.com/java-classloaders)
