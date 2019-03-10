package buscaMinas;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

// TODO: Auto-generated Javadoc
/**
 * Clase modelo del juego BuscaMinas.
 */
public class Celda extends JButton{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The Constant SIZE. */
	private static final int SIZE = 15;
	
	/** The estado. */
	private int minasCercanas, fila, col, estado;
	
	/** The es mina. */
	private boolean esMina;
	
	/** The color. */
	private String color;
	
	/**
	 * Instancia una nueva celda.
	 *
	 * @param fila the fila
	 * @param col the col
	 * @param esMina the es mina
	 */
	public Celda(int fila, int col) {
		this.fila=fila;
		this.col=col;
		estado=0;
		minasCercanas=0;
		this.setPreferredSize(new Dimension(SIZE, SIZE));
		this.setOpaque(true);
		this.setIcon(new ImageIcon("src/resources/10.png"));
		//this.setBackground(Color.DARK_GRAY);
	}
	
	/**
	 * Cambia el estado de la celda. Los estados son:
	 * 0 -> Estado inicial (tapada);
	 * 1 -> Destapada
	 * 2 -> Marcada
	 *
	 * @param estado the new state
	 */
	public void setState(int estado) {
		this.estado=estado;
	}
	
	public void beMine() {
		esMina=true;
	}
	
	public void increaseMineCount() {
		minasCercanas++;
	}
	/**
	 * "Destapa" la celda seleccionada. En realidad lo que sucede es que se le asigna
	 * un icono al botón dependiendo del número de minas cercanas.
	 */
	public void revelar() {
		if(estado==0) {
			this.setIcon(new ImageIcon("src/resources/"+minasCercanas+".png"));
			estado=1;
		}
	}
	
	/**
	 * Gets the minas cercanas.
	 *
	 * @return the minas cercanas
	 */
	public int getMinasCercanas() {
		return minasCercanas;
	}

	/**
	 * Gets the fila.
	 *
	 * @return the fila
	 */
	public int getFila() {
		return fila;
	}

	/**
	 * Gets the col.
	 *
	 * @return the col
	 */
	public int getCol() {
		return col;
	}

	/**
	 * Gets the estado.
	 *
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Checks if is mina.
	 *
	 * @return true, if is mina
	 */
	public boolean isMina() {
		return esMina;
	}

	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public String getColor() {
		return color;
	}	
}
