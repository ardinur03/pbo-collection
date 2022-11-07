/**
 * Nama : Muhamad Ardi Nur Insan 
 * NIM : 211511022
 * Filename : Excercise.java
 */
package exercise;

import java.util.*;

public class Excercise {
	public static void main(String[] args) {
		Family family = new Family(); // Declare and instantiate a Family object

		// Add Nieces to the Family object
		family.addNiece("Nova", 1, 1);
		family.addNiece("Alzio", 2, 2);
		family.addNiece("Azka", 3, 3);
		family.addNiece("Azka", 3, 3);
		family.addNiece("Azka", 2, 2);

		// add Uncles to the Family object
		family.addUncle("Budi");
		family.addUncle("Budi");
		family.addUncle("Doni");
		family.addUncle("Ari");

		Uncle doni = family.findUncle("Doni"); // Find Uncle Doni
		doni.addPresent(family.findNiece("Nova"), "Cybertruck"); // Add a present to Nova from Doni

		Uncle budi = family.findUncle("Budi"); // Find Uncle Budi

		// Add presents from Niece 
		budi.addPresent(family.findNiece("Nova"), "Mouse Gaming"); 
		budi.addPresent(family.findNiece("Azka"), "Tupperware");
		budi.addPresent(family.findNiece("Alzio"), "Task Jeiger");
		budi.addPresent(family.findNiece("Nova"), "Dompet Keren");

		family.listNieces();
		family.listUncles();
		doni.listPresents();
		budi.listPresents();

		family.findNiece("Nova").listPresents();
		family.findNiece("Azka").listPresents();
		family.findNiece("Nova").clearPresents();
		family.findNiece("Nova").listPresents();
	}
}