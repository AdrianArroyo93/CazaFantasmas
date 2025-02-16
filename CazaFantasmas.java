package CazaFantasmas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CazaFantasmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// El usuario selecciona la entidad o categoria

		final String ERROR_LETRAS = "No se permite escribir palabras, solo números";
		final String ERROR_ENTIDAD = "Solo se permite entidad del 1 al 5";
		final String ERROR_NEGATIVO = "No se permiten números negativos";
		String Categoria = "";
		int Entidad = 0;
		int CazaFantasmas = 0;
		int BajoRiesgo = 0;
		int MedioRiesgo = 0;
		int AltoRiesgo = 0;
		int CivilesPeligro = 0;
		String Letras = "";

		try {

			
			/*if ((Entidad == Letras.indexOf(Entidad)) || (CivilesPeligro == Letras.indexOf(CivilesPeligro))) {

				throw new InputMismatchException(ERROR_LETRAS);
			}*/
			
			System.out.println("Seleccione dificultad de entidad (del 1 al 5)");
			Entidad = scanner.nextInt();
			System.out.println("Ahora ingrese la cantidad de civiles en peligro del 0 al 200");
			CivilesPeligro = scanner.nextInt();
			
			switch (Entidad) { 

			case 1:
				if ((Entidad == 1) || (Entidad == 2) && (CivilesPeligro < 50)) {
					System.out.println("Hay menos de 50 civiles en peligro, situación de Bajo Riesgo");
					if (CazaFantasmas == BajoRiesgo) {
						System.out.println("Hace falta un cazafantasma");
					} else {
						throw new InputMismatchException(ERROR_LETRAS);
					}
				}
				break;
			case 2:
				if ((Entidad == 1) || (Entidad == 2) && (CivilesPeligro < 50)) {
					System.out.println("Hay menos de 50 civiles en peligro, situación de Medio Riesgo");
					if (CazaFantasmas == MedioRiesgo) {
						System.out.println("Hace falta un cazafantasma");
					} else {
						throw new InputMismatchException(ERROR_LETRAS);
					}
				}
			case 3:
				if ((Entidad == 1) || (Entidad == 2) || (Entidad == 3) && (CivilesPeligro >= 50)) {
					System.out.println("Hay 50 civiles en peligro, situación de Medio Riesgo");
					if (CazaFantasmas == MedioRiesgo) {
						System.out.println("Hace falta dos cazafantasma");
					} else {
						throw new InputMismatchException(ERROR_LETRAS);
					}
				}
			case 4:
				if ((Entidad == 4) || (Entidad == 5) && (CivilesPeligro > 100)) {
					System.out.println("Hay mas de 50 civiles en peligro, situación de Alto Riesgo");
					if (CazaFantasmas == AltoRiesgo) {
						System.out.println("Hace falta tres cazafantasma");
					} else {
						throw new InputMismatchException(ERROR_LETRAS);
					}
				}
				break;
			case 5:
				if ((Entidad == 4) || (Entidad == 5) && (CivilesPeligro > 100)) {
					System.out.println("Hay mas de 100 civiles en peligro, situación de Alto Riesgo");
					if (CazaFantasmas == AltoRiesgo) {
						System.out.println("Hace falta tres cazafantasma");
					} else {
						throw new InputMismatchException(ERROR_LETRAS);
					}
					break;

				}
			default:
				System.out.println("Ingrese un valor correcto");
				break;

			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());

			scanner.close();

		}
	}
}
