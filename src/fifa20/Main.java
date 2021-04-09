package fifa20;

public class Main {

	public static void main(String[] args) {

		BDController controladorBD = new BDController();

	
		for (int i = 0; i < controladorBD.dameJugadores().size(); i++) {
			System.out.println("Codigo jugador: " + controladorBD.dameJugadores().get(i).getCod_jugador() + " Nombre: " + controladorBD.dameJugadores().get(i).getNombre() + " Codigo equipo: " + controladorBD.dameJugadores().get(i).getCod_equipo() + " Pierna: " + controladorBD.dameJugadores().get(i).getPierna() + " Altura: " + controladorBD.dameJugadores().get(i).getAltura() + " Pais: " + controladorBD.dameJugadores().get(i).getPais());
		}
	}

}
