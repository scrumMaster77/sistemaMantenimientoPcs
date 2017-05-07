/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientocomputadores.interfaz;

import javax.swing.table.AbstractTableModel;
import mantenimientocomputadores.mundo.Computador;
import mantenimientocomputadores.mundo.Mantenimiento;

/**
 *
 * @author Luis Eduardo
 */
public class TablaMantenimientos extends AbstractTableModel
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
	private Computador pComputador;
      	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------
	/**
	 * Método constructor del AbstractableModel.<br>
    <b>post: </b> Se inicializan los atributos de la clase.
     * @param elModelo
	 */
	public TablaMantenimientos(Computador elModelo)
	{
		super();
		pComputador = elModelo;
		String[] nombreColumnasAux = { "codigo", "fecha", "descripcion", "nombreTecnicoMantenimiento" };
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
		return pComputador.getMantenimientos().size();
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
		Object datoMantenimiento = null;
		Object[] mantenimientos = pComputador.getMantenimientos().toArray();
		Mantenimiento mantenimiento = (Mantenimiento) mantenimientos[rowIndex];
		if (columnIndex == -1)
		{
			datoMantenimiento = mantenimiento;
		}
		else if (columnIndex == 0)
		{
			datoMantenimiento = mantenimiento.getCodigo();
		}
		else if (columnIndex == 1)
		{
			datoMantenimiento = mantenimiento.getDescripcion();
		}
                else if (columnIndex == 2)
		{
			datoMantenimiento = mantenimiento.getFecha();
		}
                else if (columnIndex == 3)
		{
			datoMantenimiento = mantenimiento.getNombreTecnicoMantenimiento();
		}
		return datoMantenimiento;
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
