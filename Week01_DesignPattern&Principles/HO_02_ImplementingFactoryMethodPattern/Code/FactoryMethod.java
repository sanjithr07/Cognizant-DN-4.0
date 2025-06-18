// Product interface
interface Product {
    void use();
}

// ConcreteProductA class
class ConcreteProductA implements Product {
    public void use() {
        System.out.println("Using Product A");
    }
}

// ConcreteProductB class
class ConcreteProductB implements Product {
    public void use() {
        System.out.println("Using Product B");
    }
}

// FactoryMethod class
public class FactoryMethod {
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}