package com.string;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		User user = new User();
		user.setId(1);
		user.setName("prajit");

		try (FileOutputStream fileOutputStream = new FileOutputStream(
				"C:\\Users\\Nimap infotech\\Desktop\\myclass.ser");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		) {
			objectOutputStream.writeObject(user);
			System.out.println("serlization objectOutputStream");
		} catch (IOException exception) {
			exception.getMessage();
		}

	}

}
