/**
 * Nama : Muhamad Ardi Nur Insan 
 * NIM : 211511022
 * Filename : Niece.java
 */
package exercise;

import java.util.*;

public class Niece implements Comparable<Niece> {
	private String name;
	private int day, month;

	Map<Uncle, String> presents;

	public Niece() {
		presents = new HashMap<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public Map<Uncle, String> getPresents() {
		return this.presents;
	}

	public int clearPresents() {
		int totalPresent = presents.size();
		presents.clear();
		return totalPresent;
	}

	public void listPresents() {
		System.out.println("=========================================");
		System.out.println("List of presents for " + this.name + ":");
		System.out.println("=========================================");
		for (Map.Entry<Uncle, String> entry : presents.entrySet()) {
			System.out.print("- ");
			System.out.print(entry.getKey().getName());
			System.out.println((entry.getValue() == null ? " hasn't given present" : " give " + entry.getValue()));
		}
		System.out.print("\n\n");
	}

	@Override
	public String toString() {
		return "[Name: " + getName() + " | BoD: " + getDay() + " " + getMonth() + "]";
	}

	@Override
	public boolean equals(Object p) {
		if (p == this)
			return true;
		if (p == null)
			return false;
		if (p.getClass() != this.getClass())
			return false;
		return name.equals(((Niece) p).name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public int compareTo(Niece other) {
		if (this.month > other.month)
			return 1;
		if (this.month == other.month) {
			return (this.day > other.day ? 1 : -1);
		}
		return -1;
	}
}