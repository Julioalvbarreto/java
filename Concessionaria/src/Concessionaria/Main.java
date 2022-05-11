package Concessionaria;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Fabricante chevrolet = new Fabricante("Chevrolet", "123.456.789-89", "719999");
		
		
		
		Cliente alison = new Cliente("Alison", "022.444.555-88", "beco da cebola", "7199999", "alisondeles@deles.com");
		
		Opcional ar =  new Opcional(1, "ar");
		Opcional alarme =  new Opcional(2, "alarme");
		
		
		Automovel celta = new Automovel(chevrolet, "Celta 1.0", "999.888.444", "Vermelho", 20000.00);
		
		celta.addopcional(ar);
		celta.addopcional(alarme);
		
		
		//System.out.println(celta.getOpcional().get(0).getNome());
		
		//System.out.println(celta.getTotal());

		Venda venda1 = new Venda();
		
		
		//System.out.println(venda1.compraCarroZero(alison, celta));
		
		
		AutomovelUsado usado = new AutomovelUsado(chevrolet, celta.getModelo() , celta.getChassi(), celta.getCor(), 20000, 2020, 10000);
		usado.addopcional(alarme);
		usado.addopcional(ar);
		Venda vendaUsado = new Venda();
		String str = String.format("%.2f", vendaUsado.compraCarroUsado(alison, usado));
		System.out.println(str);
	}

}
