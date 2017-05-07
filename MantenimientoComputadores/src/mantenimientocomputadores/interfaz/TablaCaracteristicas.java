/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientocomputadores.interfaz;

import javax.swing.table.AbstractTableModel;
import mantenimientocomputadores.mundo.CaracteristicaFisica;
import mantenimientocomputadores.mundo.Computador;

/**
 *
 * @author Luis Eduardo
 */
public class TablaCaracteristicas extends AbstractTableModel {

    // -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------
	/**
	 * Títulos de las columnas
	 */
	private  String[] nombreColumnas;

	/**
	 * Computador
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
	public TablaCaracteristicas(Computador elModelo)
	{
		super();
		pComputador = elModelo;
		String[] nombreColumnasAux = { "codigo", "categoria", "descripcion" };
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
        return pComputador.getCaracteristicas().size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object datoCaracteristica = null;
        Object[] caracteristicas = pComputador.getCaracteristicas().toArray();
        CaracteristicaFisica caracteristicaFisica = (CaracteristicaFisica) caracteristicas[rowIndex];
        if (columnIndex == -1)
        {
            datoCaracteristica = caracteristicaFisica;
        }
        else if (columnIndex == 0)
        {
            datoCaracteristica = caracteristicaFisica.getCodigo();
        }
        else if (columnIndex == 1)
        {
            datoCaracteristica = caracteristicaFisica.getCategoria();
        }
        else if (columnIndex == 2)
        {
            datoCaracteristica = caracteristicaFisica.getDescripcion();
        }
        return datoCaracteristica;
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
