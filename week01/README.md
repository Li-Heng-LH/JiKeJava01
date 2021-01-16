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

&nbsp;

### Class loaders ###
* `abstract class ClassLoader`
* `class URLClassLoader extends SecureClassLoader`
* `class SecureClassLoader extends ClassLoader`


* `class AppClassLoader extends URLClassLoader`
* `class ExtClassLoader extends URLClassLoader`


* 

&nbsp;

&nbsp;
----
### Useful links ###
* [The Java® Virtual Machine Specification](https://docs.oracle.com/javase/specs/jvms/se8/html/index.html)
* [Class Loaders in Java](https://www.baeldung.com/java-classloaders)
