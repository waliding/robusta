package org.javascool;

import org.javascool.compiler.JvsCompiler;
import org.javascool.macros.Stdout;

public class Main {

	private final static String COMPILE_GOAL = "compile";

	public static void main(String[] args) {
		if (args.length == 2) {
			handleActions(args);
		} else {
			Stdout.printError("Erreur dans la commande.\nla syntaxe est : java -jar a.jar compile java_file_path");
		}

	}

	private static void handleActions(String[] args) {
		String goal = args[0];
		switch (goal) {
		case COMPILE_GOAL:
			String javaFilePath = args[1];
			if (verifyExtention(javaFilePath)) {
				JvsCompiler.build(javaFilePath);
			} else {
				Stdout.printError("Le fichier doit avoir l'extension .jvs");
			}

			break;
		}
	}


	public static boolean verifyExtention(String path) {
		// TODO : verify extension efficiently.
		return path.contains(".jvs");

	}

}