public class CuentaBancariaTest {
	public static void main( String args[] ) {
		CuentaBancaria cuenta1 = new CuentaBancaria( 0.0, 0.0, 123 );
		CuentaBancaria cuenta2 = new CuentaBancaria( 0.0, 0.0, 456 );
		
        //Primero en la cuenta corriente de la cuenta 1 
		cuenta1.depositar1( 1000.0 );
		System.out.println( cuenta1.toString() );
		cuenta1.retirar1(50.2); 
        System.out.println( cuenta1.toString() );
        //Primero en la cuenta de ahorro de la cuenta 1 
        cuenta1.depositar2( 300.5 );
		System.out.println( cuenta1.toString() );
		cuenta1.retirar2(8.2); 
        System.out.println( cuenta1.toString() );
        
        //Luego en la cuenta corriente de la cuenta 2 
        cuenta2.depositar1(500.0); 
        System.out.println( cuenta2.toString() );
		cuenta2.retirar1(50.2); 
        System.out.println( cuenta2.toString() );

        //Luego en la cuenta de ahorros de la cuenta 2 
        cuenta2.depositar2(700.0); 
        System.out.println( cuenta2.toString() );
		cuenta2.retirar2(200.7); 
        System.out.println( cuenta2.toString() );
		
	}
}