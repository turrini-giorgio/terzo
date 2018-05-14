package it.giorgio.terzo.util;

import it.giorgio.terzo.entity.Utente;

//import it.giorgio.terzo.entity.Utente;

public class Prove {
	public static void P01() {
		Utente u = new Utente();
		u.setNome("Giorgio");
		u.setCognome("Turrini");
		System.out.println(u.toString());
	}

}
