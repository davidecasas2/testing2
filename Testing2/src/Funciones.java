/**
 * 
 */


public class Funciones {
	
	
	public String diaSemana(int dia) {
		String res="Domingo";
		// Switch con int como condicion
		switch (dia) {
		    case 1:
		       res="Domingo";
		        break;
		    case 2:
		    	res="Lunes";
		        break;
		    case 3:
		    	res="Martes";
		        break;
		    case 4:
		    	res="Miercoles";
		        break;
		    case 5:
		    	res="Jueves";
		        break;
		    case 6:
		    	res="Viernes";
		        break;
		    case 7:
		    	res="Sabado";
		        break;

		}
		return res;
	}

	int getDiasMes(String mes, boolean bisiesto) {
		int dias = 30;
		
		if (mes.equalsIgnoreCase("enero") || mes.equalsIgnoreCase("marzo") || mes.equalsIgnoreCase("mayo") || 
				mes.equalsIgnoreCase("julio") ||mes.equalsIgnoreCase("agosto") || mes.equalsIgnoreCase("octubre") ||
				mes.equalsIgnoreCase("diciembre") ) {
			dias=30;
		} else if (mes.equalsIgnoreCase("febrero")){
			if (bisiesto) {
				dias=29;
			} else {
				dias=29;
			}
		}
		return dias;
	}
	
	public int [] devuelveParesACero(int v[]) {
		int paresCero [] = new int[v.length];
		
		for (int i = 0; i < v.length; i++) {
			if (v[i]%2 ==0 ) {
				paresCero[i] = 0;
			} else {
				paresCero[i]=v[i];
			}
		}
		return paresCero;
	}
	
	public boolean esTriangularSup(int matriz [][]) {
		boolean triangsup=true;
		
		for (int i = 1; i < matriz.length && triangsup; i++) {
			for (int j = 0; j <i && triangsup; j++) {
				if (matriz[i][j]!=0) {
					triangsup=false;
				} 
			}
		}
		return triangsup;
	}

	
}
