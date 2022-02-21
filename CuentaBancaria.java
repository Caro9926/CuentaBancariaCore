public class CuentaBancaria {
	private double saldocc;
	private double saldoca;
    private int numcuenta; 
    public static double numberofAccounts = 0;


    public CuentaBancaria(double saldoccParam, double saldocaParam, int numcuentaParam) { //Aquí ya no escribo el this porque lo llamo con el método estático
        saldocc = saldoccParam;
        saldoca = saldocaParam;
        numcuenta = numcuentaParam; 
        numberofAccounts++;
    }

       
        
    public static double accountsCount() {
        return numberofAccounts; 
    }
		
    
    public double getSaldocc() {
		return saldocc;
	}

	public void setSaldocc(double saldocc) {
		this.saldocc = saldocc;
	}

	public double getSaldoca() {
		return saldoca;
	}

	public void setSaldoca(double saldoca) {
		this.saldoca = saldoca;
	}
     
    public double getNumCuenta() {
		return numcuenta;
	}

	public void setNumCuenta(int numcuenta) {
		this.numcuenta = numcuenta;
	}
    
	public void depositar1( double cantidad ) {
		this.saldocc += cantidad; 
	}

    public void depositar2( double cantidad ) {
	    this.saldoca += cantidad; 
	}
	
	public boolean retirar1( double cantidad ) {
		if( cantidad <= this.saldocc ) {
            this.saldocc -= cantidad; 
			return true;
		}
		else {
			return false;
		}
	}


    public boolean retirar2( double cantidad ) {
		if( cantidad <= this.saldoca ) {
			this.saldoca -= cantidad;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return 	"Número de cuenta: " + this.numcuenta + "\n" +
                "Cuenta corriente : " + this.saldocc + "\n"  +
                "Cuenta de ahorros : " + this.saldoca + "\n";
	}


}