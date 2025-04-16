package herneciaMult1;

public class D extends A {
    private B b;

    public D(int x, int y, int z) {
        super(x, z);       
        this.b = new B(y, z); 
    }

    public int getY() {
        return b.y;
    }

    public int getZ_A() {
        return this.z; 
    }

    public int getZ_B() {
        return b.z; 
    }

    public void incrementaXYZ() {
        this.incrementaXZ(); 
        b.incrementaYZ();    
    }

    public String mostrarValores() {
        return "x = " + x + ", y = " + b.y + ", z_A = " + z + ", z_B = " + b.z;
    }
}
