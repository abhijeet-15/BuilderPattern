```java
public class Pizza() {
    
    public Pizza(int size) {
        this.size = size;
    }
    
    public Pizza(int size, boolean cheese) {
        this.size = size;
        this.cheese = cheese;
    }
    
    public Pizza(int size, boolean cheese, boolean panner) {
        this.size = size;
        this.cheese = cheese;
        this.panner = panner;
    }
}
```

This is constructor telescoping. For 10 types of optional parameters, 2^10 types of constructors would have to be created. User cannot remember the sequence of parameters as well.
