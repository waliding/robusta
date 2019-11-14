package org.robusta;

import org.robusta.compiler.JvsCompiler;

public class Main {

	public final static long COMPILATION_START_TIME = System.currentTimeMillis();
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Syntaxe error, command should be : java -jar robusta.jar file_path");
		} else {
			JvsCompiler.build(args[0]);
		}
	}

}
