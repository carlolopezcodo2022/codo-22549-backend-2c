package ar.com.codoacodo.interfaces;

public class MainIdiomas {

	public static void main(String[] args) {
		
		//nace la persona
		var persona = new Persona("carlos","español");

		persona.decir("hola","portuñol");
		
		persona.aprender("portuñol");//f5
		
		persona.decir("hola","portuñol");
	}

}
