

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import br.unifacol.loja.Pessoa;
import br.unifacol.loja.Vendedor;

public class Main {
	public static void main(String []args) throws ParseException {
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		DateFormat f = DateFormat.getDateInstance();		
		 
		Vendedor v1 = new Vendedor("Fulano", f.parse("12/01/1995"),"FG7898");
		
		Vendedor v2 = new Vendedor("a",  f.parse("12/01/1995"), "Sds", "DSD", "ASD", "25", "ASDASD", "ASDSA", "ASD", "ASD");						
		
		Vendedor v3 = new Vendedor("a",  f.parse("12/01/1995"), "a", "a", "a", "a", "a", "a", "a", "a", "a",f.parse("12/01/1995"),f.parse("12/01/1995"),false,1, 0, 1, 5, 
				"a", "a", "a", "a", "a", "a", "a", "a", "a");
		
		 
		
		
	}

}
