import java.util.Scanner;

public class NizoviGit {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out.println("unesi niz duzine 5");
		// unos.close();
		double[] niz = new double[5];

		for (int i = 0; i < niz.length; i++) {

			niz[i] = unos.nextDouble();
		}
		System.out.println("najmanji je");
		System.out.println(najmanjiBrojUNizu(niz));
		System.out.println();
		System.out.println("najveci je");
		System.out.println(najveciBrojUNizu(niz));
		System.out.println();
		System.out.println("zbir svih brojeva");
		System.out.println(zbirSvihBrojevaUNizu(niz));
		System.out.println();
		System.out.println("prosjek");
		System.out.println(prosjekSvihBrojevaUNizu(niz));
		System.out.println();
		System.out.println("sortirani");
		sortiraniOdManjegKaVecem(niz);

		for (int i = 0; i < niz.length; i++) {

			System.out.print(niz[i] + " ");
		}

	}

	public static double najmanjiBrojUNizu(double[] niz) {
		double min = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < min)
				min = niz[i];
		}
		return min;
	}

	public static double najveciBrojUNizu(double[] niz) {
		double max = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] > max)
				max = niz[i];
		}
		return max;
	}

	public static double zbirSvihBrojevaUNizu(double[] niz) {

		double zbir = 0;

		for (int i = 0; i < niz.length; i++) {

			zbir += niz[i];
		}

		return zbir;
	}

	public static double prosjekSvihBrojevaUNizu(double[] niz) {

		double zbir = 0, prosjek = 0;

		for (int i = 0; i < niz.length; i++) {

			zbir += niz[i];
		}

		prosjek = zbir / niz.length;

		return prosjek;
	}

	public static double[] sveUnikatneBrojeveUNizu(double[] niz) {
		return niz;
	}

	public static double[] sortiraniOdManjegKaVecem(double[] niz) {

		double[] broj = new double[niz.length];
		double n, temp;

		for (int i = 0; i < niz.length; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[i] > niz[j]) {
					temp = niz[i];
					niz[i] = niz[j];
					niz[j] = temp;
				}
			}
		}
		return broj;
	}

}
