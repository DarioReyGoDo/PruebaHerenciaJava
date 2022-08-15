package juego;

import java.util.Comparator;

public class PuntosVidaComparatorInverso implements Comparator<Personaje> {
	public int compare(Personaje p1, Personaje p2) {
		return p2.getPuntos_vida_actuales() - p1.getPuntos_vida_actuales();
	}
}
