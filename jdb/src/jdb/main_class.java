package jdb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class main_class {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		operation object = new operation();
		Scanner S = new Scanner(System.in);
		do {
		System.out.println("Enter 1 for inserting a record:");
		System.out.println("Enter 2 for deleting a record:");
		System.out.println("Enter 3 for updating a record:");
		System.out.println("Enter 4 for displaying one record:");
		System.out.println("Enter 5 for displaying all records:");
		int reply = S.nextInt();
		switch(reply) {
		case 1:
			object.insert_record();
			break;
		case 2:
			object.delete();
			break;
		case 3:
			object.update();
			break;
		case 4:
			object.display_one();
			break;
		case 5:
			object.display_All();
			break;
		default:
			System.out.println("Invalid Input");
		}}while(true);	
	}
}

