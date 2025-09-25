public class CuentaBancaria {
    
    String titular;
    double saldo;

    CuentaBancaria(String t, double s){
        titular = t;
        saldo = s;
    }

    public static void main() {

        CuentaBancaria cuenta1 = new CuentaBancaria("José Perez", 12000);

        cuenta1.depositar(2000);
        cuenta1.mostrarSaldo(cuenta1);
        System.out.println(cuenta1.retirar(20000));
        cuenta1.mostrarSaldo(cuenta1);
        System.out.println(cuenta1.retirar(200));
        cuenta1.mostrarSaldo(cuenta1);
        System.out.println(cuenta1.retirar(10000));
        cuenta1.mostrarSaldo(cuenta1);

    }


    void depositar(double monto) {
        saldo += monto;
    }

    boolean retirar(double monto) {
        if (saldo < monto) {
            return false;
        } else {
            saldo -= monto;
            return true;
        }
    }

    void mostrarSaldo(CuentaBancaria cuenta) {
        System.out.println(cuenta.titular +" $"+ cuenta.saldo);
    }

}
