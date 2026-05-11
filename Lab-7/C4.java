class Complex {
    private double real;
    private double imag;

    public Complex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public Complex(double real) {
        this.real = real;
        this.imag = 0.0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImag = this.imag + other.imag;
        return new Complex(newReal, newImag);
    }

    public void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}

public class C4 {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);   // 3 + 4i
        Complex c2 = new Complex(1, -2);  // 1 - 2i

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();
    }
}