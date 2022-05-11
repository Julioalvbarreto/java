package Concessionaria;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Fabricante chevrolet = new Fabricante("Chevrolet", "123.456.789-89", "719999");
		
		
		
		Cliente alison = new Cliente("Alison", "022.444.555-88", "beco da cebola", "7199999", "alisondeles@deles.com");
		
		Opcional ar =  new Opcional(1, "ar");
		
		
		Automovel celta = new Automovel(chevrolet, "Celta 1.0", "999.888.444", "Vermelho", 20.000);
		
		celta.addopcional(ar);

	}

}
