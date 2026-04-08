/** 
 * Clase: cuenta bancaria
 * Nos da información del titular (nombre), el saldo y el tipo de interés
 */
public class CCuenta {

/**
 * Nombre del titular de la cuenta
 */
    private String nombre;
/**
 * Número de la cuenta bancaria
 */
    private String cuenta;
/**
 * Saldo actual disponible
 */
    private double saldo;
/**
 * Tipo de interés de la cuenta
 */
    private double tipoInterés;

    public CCuenta()
    {
    }
/**
 * Se crea la clase CCuenta: creo una cuenta bancaria con los datos facilitados del cliente
 * @param nom Nombre del titular de la cuenta
 * @param cue Número de la cuenta 
 * @param sal Saldo con el que se abre la cuenta
 * @param tipo Tipo de interés de la cuenta 
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Nos dice el saldo disponible en la cuenta 
 * @return saldo actual en formato double (con decimales)
 */
    public double estado()
    {
        return saldo;
    }
/**
 * Método que sirve para ingresar dinero en la cuenta 
 * @param cantidad dinero que se ingresa
 * @throws Exception no se puede introducir una cantidad de saldo negativa 
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * Método para retirar dinero de la cuenta bancaria, al finalizar indica el saldo restante. 
 * @param cantidad Cantidad que el cliente quiere retirar
 * @throws Exception Si la cantidad a retirar es negativa o superior al saldo diponible salta un error. 
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
/**
 * Nos dice el nombre del titular
 * @return Nombre completo del titular de la cuenta
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Cambia el nombre del titular 
 * @param nombre nuevo nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Nos dice el número de cuenta
 * @return número de cuenta bancaria 
 */
    public String getCuenta() {
        return cuenta;
    }
/**
 * Modifica el número de cuenta bancaria
 * @param cuenta el nuevo número de la cuenta
 */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
/**
 * Nos dice el saldo actual
 * @return importe de saldo
 */
    public double getSaldo() {
        return saldo;
    }
/**
 * Modifica el saldo actual
 * @param saldo el nuevo saldo
 */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/**
 * Nos indica el tipo de interés de la cuenta bancaria
 * @return tipo de Interés
 */
    public double getTipoInterés() {
        return tipoInterés;
    }
/**
 * Modifica el tipo de interés 
 * @param tipoInterés nuevo tipo de interés
 */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
}
