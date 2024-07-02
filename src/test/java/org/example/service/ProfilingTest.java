package org.example.service;

import org.junit.Test;
import java.io.IOException;

public class ProfilingTest {

	//Folgende 3 Tests demonstrieren wie man einzelne Methoden blocken könnte
	@Test(expected = SecurityException.class)
	public void testReadFileBlocked() throws IOException {
		Profiling app = new Profiling();
		app.readFile("test.txt");
	}

	/*
	@Test(expected = SecurityException.class)
	public void testWriteFileBlocked() throws IOException {
		Profiling app = new Profiling();
		app.writeFile("test.txt", new byte[]{1, 2, 3});
	}

	 */

	@Test(expected = SecurityException.class)
	public void testOpenFileBlocked() throws IOException {
		Profiling profiling = new Profiling();
		profiling.openFile("test.txt", new byte[]{1, 2, 3});
	}




}
