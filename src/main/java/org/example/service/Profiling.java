package org.example.service;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Profiling {

	//This class was only there to demonstrate single method blocks

	public void readFile(String filePath) throws IOException {
		try (FileInputStream fis = new FileInputStream(filePath)) {
			int data = fis.read();
			while (data != -1) {
				data = fis.read();
			}
		}
	}

	public void writeFile(String filePath, byte[] data) throws IOException {
		try (FileOutputStream fos = new FileOutputStream(filePath)) {
			fos.write(data);
		}
	}

	public void openFile(String filePath, byte[] bytes) throws IOException {
		try (FileOutputStream fos = new FileOutputStream(filePath)) {
			fos.write(bytes);
		}
	}
}
