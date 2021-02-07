
class SalarioMinimo{
    double ObtenerSalarioMinimo(){
        return 123.22;
    }
}

class Trabajador{
    SalarioMinimo salarioMinimo = new SalarioMinimo();
    private int horasTrabajadas = 40;

    public void Pagar(){
        System.out.println(40 * salarioMinimo.ObtenerSalarioMinimo());
    }
}

public class Main {
    public static void main(String args []){
        Trabajador trabajador00231 = new Trabajador();

        System.out.println("El salario del Trabajador es:");
        trabajador00231.Pagar();
    }
}
