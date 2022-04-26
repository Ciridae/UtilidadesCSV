package com.dual.filewriter;

public class ExportarFichero {

	public static void main(String[] args) {

		String file = "logs/file.csv";
		String separador = ";";
		String[][] datos = { { "ABEL", "DOMINGUEZ", "MOREJON", "TRFFFO@GMAIL.COM", "MM342OR", "1234" },
				{ "MANUEL", "PEREZ", "SALGADO", "TEMAAASDADFO@GMAIL.COM", "ADPER", "1234" },
				{ "PEDRO", "CAMACHO", "RODRIGUEZ", "PEDRASS@GMAIL.COM", "PEDR", "1234" },
				{ "SARA", "TORO", "JIMENEZ", "SRAFS@GMAIL.COM", "SARAR", "1234" } };

		try {

			UtilidadesCsv utilidadesCsv = new UtilidadesCsv();
			utilidadesCsv.exportarCsv(datos, file, separador);

			System.out.println("Fin de la escritura");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
