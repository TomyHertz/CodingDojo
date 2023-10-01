package Bankacc;
import java.util.Random;
public class Cuenta {
	private String numeroCuenta = "";
    private Double saldoCorriente = 0.0;
    private Double saldoAhorros = 0.0;
    private static int cuentasCreadas = 0;
    private static Double dineroTotal = 0.0;

    // Constructor
    public Cuenta() {
        this.numeroCuenta = generarNumeroCuenta();
        this.saldoCorriente = 0.0;
        this.saldoAhorros = 0.0;
        cuentasCreadas += 1;
        System.out.println("Nuevo usuario creado con número de cuenta: " + numeroCuenta + ".");
        System.out.println("Total de cuentas creadas: " + cuentasCreadas + ".");
    }

    // Getters
    public Double getSaldoCorriente() {
        return saldoCorriente;
    }

    public Double getSaldoAhorros() {
        return saldoAhorros;
    }

    // Setters
    public void setSaldoCorriente(Double saldoCorriente) {
        this.saldoCorriente = saldoCorriente;
    }

    public void setSaldoAhorros(Double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    // Métodos
    private String generarNumeroCuenta() {
        String tablaNumeros = "0123456789";
        String numeroAleatorio = "";

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            char num = tablaNumeros.charAt(rand.nextInt(10));
            numeroAleatorio += num;
        }
        numeroCuenta = numeroAleatorio;
        return numeroAleatorio;
    }

    public void depositoCuenta(String tipo, Double montoDeposito) {
        if (tipo.equalsIgnoreCase("corriente") || tipo.equalsIgnoreCase("Checking")) {
            setSaldoCorriente(getSaldoCorriente() + montoDeposito);
            dineroTotal += montoDeposito;
        } else if (tipo.equalsIgnoreCase("ahorros") || tipo.equalsIgnoreCase("Savings")) {
            setSaldoAhorros(getSaldoAhorros() + montoDeposito);
            dineroTotal += montoDeposito;
        } else {
            System.out.println("Por favor, elija un tipo de cuenta válido.");
        }
    }

    public void retiroCuenta(String tipo, Double montoRetiro) {
        if (tipo.equalsIgnoreCase("corriente") || tipo.equalsIgnoreCase("Checking")) {
            if (getSaldoCorriente() < montoRetiro) {
                System.out.println("¡Fondos insuficientes!");
            } else {
                setSaldoCorriente(getSaldoCorriente() - montoRetiro);
                dineroTotal -= montoRetiro;
            }
        } else if (tipo.equalsIgnoreCase("ahorros") || tipo.equalsIgnoreCase("Savings")) {
            if (getSaldoAhorros() < montoRetiro) {
                System.out.println("¡Fondos insuficientes!");
            } else {
                setSaldoAhorros(getSaldoAhorros() - montoRetiro);
                dineroTotal -= montoRetiro;
            }
        } else {
            System.out.println("Por favor, elija un tipo de cuenta válido.");
        }
    }

    public Double miBalance() {
        Double balanceTotal = saldoCorriente + saldoAhorros;
        System.out.println(balanceTotal);
        return balanceTotal;
    }
}
