/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientocomputadores.interfaz;

import javax.swing.table.AbstractTableModel;
import mantenimientocomputadores.mundo.Computador;
import mantenimientocomputadores.mundo.SistemaPrincipal;

/**
 *
 * @author Luis Eduardo
 */
public class TablaComputadores extends AbstractTableModel
{
    // -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------
	/**
	 * Títulos de las columnas
	 */
	private  String[] nombreColumnas;

	/**
	 * Empresa
	 */
	private SistemaPrincipal principal;
      	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------
	/**
	 * Método constructor del AbstractableModel.<br>
    <b>post: </b> Se inicializan los atributos de la clase.
     * @param elModelo
	 */
	public TablaComputadores(SistemaPrincipal elModelo)
	{
		super();
		principal = elModelo;
		String[] nombreColumnasAux = { "Código" , "Precio", "Encargado", "Ubicación" };
		nombreColumnas = nombreColumnasAux;
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	/**
	 * Sobrecarga el método de Table Model y retorna el número de filas para ajustar la tabla de personas.
	 * @return número de filas.
	 */
        @Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return principal.getComputadores().size();
	}

	/**
	 * Sobrecarga el método de Table Model y retorna el número de columnas para ajustar la tabla de personas.
	 * @return número de columnas.
	 */
        @Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return nombreColumnas.length;
	}

	/**
	 * Sobrecarga el método de Table Model y retorna el objeto de la casilla indicada.
	 * @param rowIndex Índice de la fila. rowIndex >= 0.
	 * @param columnIndex Índice de la columna. columnIndex >= -1.
	 * @return dato de la celda. Si columnIndex es -1 retorna el objeto de la persona completo.
	 */
        @Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Object datoComputador = null;
		Object[] computadores = principal.getComputadores().toArray();
		Computador computador = (Computador) computadores[rowIndex];
		if (columnIndex == -1)
		{
			datoComputador = computador;
		}
		else if (columnIndex == 0)
		{
			datoComputador = computador.getCodigo();
		}
		else if (columnIndex == 1)
		{
			datoComputador = computador.getPrecio();
		}
                else if (columnIndex == 2)
		{
			datoComputador = computador.getEncargado();
		}
                else if (columnIndex == 3)
		{
			datoComputador = computador.getUbicacion();
		}
		return datoComputador;
	}

	/**
	 * Sobrecarga el método de Table Model y retorna el nombre de la columna.
	 * @param columnIndex Columna de la cual se quiere saber el nombre. columnIndex >= 0.
	 * @return nombre de la columna
	 */
        @Override
	public String getColumnName( int columnIndex )
	{
		return nombreColumnas[ columnIndex ];
	}        
}
