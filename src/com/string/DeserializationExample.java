package com.string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Nimap infotech\\Desktop\\myclass.ser");
				ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

		) {
			User test = (User) inputStream.readObject();
			System.out.println("id : " + test.getId());
			System.out.println("name : " + test.getName());
		} catch (IOException | ClassNotFoundException e) {
			e.getStackTrace();
		}
	}

}
