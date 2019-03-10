package buscaMinas;

public class Control {
	private Celda[][] celdas;
	private boolean ganador;
	private static final int MINAS = 40;
	private static final int BOARD = 16;
	
	public Control() {
		celdas = new Celda[BOARD][BOARD];
		ganador=false;
		instanciarCeldas();
		setMinas();
	}
	
	private void instanciarCeldas() {
		for(int fila=0; fila<BOARD; fila++) {
			for(int col=0; col<BOARD; col++) {
				celdas[fila][col] = new Celda(fila, col);
			}
		}
	}
	
	private void setMinas() {
		
	}
	
	
	
	public Celda[][] getCeldas() {
		return celdas;
	}

	public boolean isGanador() {
		return ganador;
	}

	public static int getMinas() {
		return MINAS;
	}

	public static int getBoard() {
		return BOARD;
	}
}
