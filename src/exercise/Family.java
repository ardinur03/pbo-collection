/**
 * Nama : Muhamad Ardi Nur Insan 
 * NIM : 211511022
 * Filename : Family.java
 */
package exercise;

import java.util.*;

public class Family {
	private final Set<Uncle> uncles;
	private final Set<Niece> nieces;

	public Family() {
		uncles = new HashSet<>();
		nieces = new HashSet<>();
	}

	public boolean addNiece(String name, int day, int month) {
		Niece temp;
		temp = new Niece();
		temp.setName(name);
		temp.setDay(day);
		temp.setMonth(month);
		if (nieces.add(temp)) {
			this.updatePresentList();
			return true;
		}
		return false;
	}

	public boolean addUncle(String name) {
		Uncle temp;
		temp = new Uncle();
		temp.setName(name);
		if (uncles.add(temp)) {
			this.updatePresentList();
		}
		return false;
	}

	public Niece findNiece(String name) {
		for (Iterator<Niece> it = nieces.iterator(); it.hasNext();) {
			Niece n = it.next();
			if (n.getName().equals(name)) {
				return n;
			}
		}
		return null;
	}

	public Uncle findUncle(String name) {
		for (Iterator<Uncle> it = uncles.iterator(); it.hasNext();) {
			Uncle u = it.next();
			if (u.getName().equals(name)) {
				return u;
			}
		}
		return null;
	}

	public void listNieces() {
		System.out.println("=========================================");
		System.out.println("List of Nieces ");
		System.out.println("=========================================");

		TreeSet<Niece> sortedNieces = new TreeSet<>(nieces);
		System.out.println(sortedNieces);
		System.out.print("\n\n");
	}

	public void listUncles() {
		System.out.println("=========================================");
		System.out.println("List of Uncles ");
		System.out.println("=========================================");
		TreeSet<Uncle> sortedUncles = new TreeSet<>(uncles);
		System.out.println(sortedUncles);
		System.out.print("\n\n");
	}

	private void updatePresentList() {
		for (Uncle uncle : uncles) {
			for (Niece niece : nieces) {
				if (!uncle.getPresents().containsKey(niece)) {
					uncle.addPresent(niece, null);
				}
			}
		}
	}
}