
public class NizoviGit {

	public double najmanjiBrojUNizu(double[] niz) {
		double min = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < min)
				min = niz[i];
		}
		return min;
	}

	public double najveciBrojUNizu(double[] niz) {
		double max = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < max)
				max = niz[i];
		}
		return max;
	}

	public double zbirSvihBrojevaUNizu(double[] niz) {
		return 0;
	}

	public double prosjekSvihBrojevaUNizu(double[] niz) {
		return 0;
	}

	public double[] sveUnikatneBrojeveUNizu(double[] niz) {
		return niz;
	}

	public double[] sortiraniOdManjegKaVecem(double[] niz) {
		return niz;

	}

}
