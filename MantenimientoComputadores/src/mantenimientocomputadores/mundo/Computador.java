package mantenimientocomputadores.mundo;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import java.util.ArrayList; 
import java.util.Date;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.263D1C73-FCF0-D0F0-A4A0-9A5C6025613C]
// </editor-fold> 
/**
 * Clase Computador que contiene a las clases:
 * Características Fisicas.
 * Programas Instalados.
 * Mantenimientos.
 * @author Luis Eduardo
 */
public class Computador {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F56FB90D-6C3F-AC89-CCBC-963864E49768]
    // </editor-fold> 
    /**
     * Codigo: El código del computador 
     */
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.26C3E05D-D6E4-0060-BA4A-C55979A1C8B5]
    // </editor-fold> 
    /**
     * precio: El precio del computador 
     */
    private double precio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AE32D37C-014C-4175-A4A4-222DD5AEF3A9]
    // </editor-fold> 
    /**
     * encargado: El encargado del computador 
     */
    private String encargado;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D8049699-3DC1-9B26-E31C-9FB25A6289EA]
    // </editor-fold> 
    /**
     * ubicación : La ubicación donde se encuentra el computador
     */
    private String ubicacion;
    
    private int totalMantenimientos;
  
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.084C142F-2373-0860-8774-7D7BD1AAB2D0]
    // </editor-fold> 
    /**
     * Arraylist de la clase CaracteristicaFisica que contiene todas las características
     * del computador.
     */
    private ArrayList<CaracteristicaFisica> caracteristicas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D3EB4F04-246A-9999-A6E7-B70BD891B5AB]
    // </editor-fold> 
    /**
     *  Arraylist de la clase ProgramaInstalado que contiene todos los programas instalados
     * del computador.
     */
    private ArrayList<ProgramaInstalado> programas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DAE9DE82-2809-BFBC-ECEF-8A5BDBA3BFD1]
    // </editor-fold> 
    /**
     * ArrayList de la clase Mantenimiento que contiene todos los mantenimientos de un 
     * computador.
      */
    private ArrayList<Mantenimiento> mantenimientos;
    
    /**
     * ArrayList de la clase Computador que contiene todos los computadores.
     */
    private ArrayList computadores;
    
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //---Constructor de la clase Computador
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F75894AC-2DE3-9207-A609-6D88250B1A7D]
    // </editor-fold> 
    /**
     * Completar
     * @param elCodigo: Código para agregar un computador que se pasa como parámetro.
     * @param elPrecio: Precio del computador que se pasa como parámetro.
     * @param elEncargado: Encargado del computador que se pasa como parámetro.
     * @param laUbicacion : Ubicación donde se encuentra el computador y que se pasa como parámetro.
     */
    public Computador (int elCodigo, int elPrecio, String elEncargado, String laUbicacion) 
    {
        codigo = elCodigo;
        precio = elPrecio;
        encargado = elEncargado;
        ubicacion = laUbicacion;
        
        //Inicializar lista de características fisicas del computador
        caracteristicas = new ArrayList<CaracteristicaFisica>();
        
         //Inicializar lista de programas instalados del computador
        programas = new ArrayList<ProgramaInstalado>();
        
         //Inicializar lista de mantenimientos del computador
        mantenimientos = new ArrayList<Mantenimiento>();
        
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0B6B0203-97FC-C712-F636-9443AA6DAEB6]
    // </editor-fold> 
    /**
     * Método encargado de obtener el código de un computador. 
     * @return : retorna el código del computador.
     */
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.49397215-B14D-D37B-61A9-DD57A947335E]
    // </editor-fold> 
    /**
     * Método encargado de dar el código de un computador. 
     * @param val: valor del código de un computador que se pasa como parámetro.
     */
    public void setCodigo (int val) {
        this.codigo = val;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.96DDB507-752F-4CB6-D300-4667633CD38A]
    // </editor-fold> 
    /**
     * Método encargado de obtener el precio de un computador
     * @return : Retorna el precio de un computador
     */
    public double getPrecio () {
        return precio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.25DB6D6D-3D5B-4236-E620-E8485B3824F0]
    // </editor-fold> 
    /**
     * Método encargado de dar el precio de un computador 
     * @param val : Valor tipo double de un computador 
     */
    public void setPrecio (double val) {
        this.precio = val;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.355B37CE-8CC8-40BD-B976-B5A27ECEC1D8]
    // </editor-fold> 
    /**
     * Método encargado de obtener el encargado de un computador o responsable de un 
     * computador.
     * @return: Retorna el encargado de un computador.
     */
    public String getEncargado () {
        return encargado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E53CC9D3-049D-F5D4-3434-97DE7E2B1E7E]
    // </editor-fold> 
    /**
     * Método encargado de dar el encargado de un computador. 
     * @param val : valor del encargado de un computador.
     */
    public void setEncargado (String val) {
        this.encargado = val;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F2088934-B14C-E4F6-2103-F4E0DE77741E]
    // </editor-fold> 
    /**
     * Método encargado de obtener la ubicación de un computador.
     * @return : Retorna la ubicación de un computador.
     */
    public String getUbicacion () {
        return ubicacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.380635A7-6182-845A-4AFA-79FA010C461C]
    // </editor-fold> 
    /**
     * Metodo encargado de dar la ubicación de un computador.
     * @param val : valor de la ubicación de un computador.
     */
    public void setUbicacion (String val) {
        this.ubicacion = val;
    }

    //--------------------------------------------------------------------------
    //Metodos de la clase computador
    //--------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1A2A7AF0-B787-E8F1-33FE-24B371127921]
    // </editor-fold> 
    /**
     * Método encargado de agregar una característica fisica a un computador que ya existe.
     * Se debe buscar una característica por el código y la categoria para agregarle una característica fisica
     * @param codigo: El código de un computador para agregar una característica fisica
     * @param laCategoria: La categoria de la característica ejemplo: RAM, CPU, Disco duro.... etc.
     * @param laDescripcion: La descripción de la característica fisica: ejemplo: 2GB, 500 GB....etc.
     * @throws java.lang.Exception: característica == null: si la característica esta vacia se agrega la característica
     * de lo contrario lanza una excepción "Ya existe esta característica".
     */
    public void agregarCaraceristicaFisica (int codigo,String laCategoria,String laDescripcion) throws Exception 
    {
        CaracteristicaFisica caracteristica = buscarCaracteristicaPorCategoria(codigo,laCategoria);
        if(caracteristica == null)
        {
            caracteristica = new CaracteristicaFisica(codigo,laCategoria,laDescripcion);
            caracteristicas.add(caracteristica);
        }
        else
        {
            throw new Exception("Ya existe esta caracteristica para este computador con código: "+ codigo +"\n"+"Por favor elija la opción 'Modificar'");
        }
      
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F27E48F8-E254-9A71-79AB-80C5A3C1CDA7]
    // </editor-fold> 
    
    /**
     * Busca una característica fisica de un computador por el código que se pasa como parámetro
     * @param codigo: el código de la característica fisica.
     * @return caracaterística: Retorna la característica de un computador.
     */
    public CaracteristicaFisica buscarCaracteristica(int codigo)
    {
        CaracteristicaFisica caracteristica = null;
        boolean encontrado = false;
        
        for(int indice = 0; indice < caracteristicas.size() && !encontrado; indice ++){
            
            if(caracteristicas.get(indice).getCodigo()==codigo){
                caracteristica = (CaracteristicaFisica) caracteristicas.get(indice);
                encontrado=true;
            }
            
        }
        return caracteristica;
    }
    
    /**
     * Busca una característica fisica por código y categoria que se pasan como parámetros.
     * @param codigo: el código de la característica fisica.
     * @param categoria: la categoria de la característica fisica de un computador.
     * @return Retorna la caracteristica buscada.
     */
     public CaracteristicaFisica buscarCaracteristicaPorCategoria(int codigo, String categoria)
    {
        CaracteristicaFisica caracteristica = null;
        boolean encontrado = false;
        
        for(int indice = 0; indice < caracteristicas.size() && !encontrado; indice ++){
            
            if(caracteristicas.get(indice).getCodigo()==codigo && caracteristicas.get(indice).getCategoria().equals(categoria)){
                caracteristica = (CaracteristicaFisica) caracteristicas.get(indice);
                encontrado=true;
            }
            
        }
        return caracteristica;
    }
     
      // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DB22F53A-18FC-EE82-7D9B-89D87B9BEC70]
    // </editor-fold> 
    /**
     * Agregar un programa instalado a un computador que ya existe con el código, la categoria y una descripción que se pasan 
     * como párametros.
     * @param codigo: el código del computador al cual se le va a agregar el programa instalado. 
     * @param laCategoria: la categoria del programa instalado que se va a agregar.
     * @param laDescripcion: la descripción del programa instalado que se va a agregar.
     * @throws java.lang.Exception : Excepción: si el computador buscado por código y categoria ya tiene un programa instalado, se
     * lanza una excepción informando sobre el error.
     */
    public void agregarProgramaInstalado (int codigo,String laCategoria, String laDescripcion) throws Exception 
    {
        ProgramaInstalado programaInstalado = buscarProgramaPorCategoria(codigo,laCategoria);
        if(programaInstalado == null)
        {
            programaInstalado = new ProgramaInstalado(codigo,laCategoria,laDescripcion);
            programas.add(programaInstalado);
        }
        else
        {
            throw new Exception("Ya existe este programa  para este computador con código: "+ codigo +"\n"+"Por favor elija la opción 'Modificar'");
        }
    }
    
    /**
     * Busca un programa por el código que se pasa como párametro
     * @param codigo: el código del programa instalado 
     * @return : Retorna el program buscado. 
     */
    public ProgramaInstalado buscarPrograma(int codigo){
        ProgramaInstalado programa = null;
        boolean encontrado = false;
        
        for(int indice = 0; indice < programas.size() && !encontrado; indice ++){
            
            if(programas.get(indice).getCodigo()==codigo){
                programa = (ProgramaInstalado) programas.get(indice);
                encontrado=true;
            }
        }
        return programa;
    }

    /**
     * Busca un programa instalado por código y categoria que se pasan como párametros.
     * @param codigo: El código del programa a buscar.
     * @param categoria: La categoria del programa a buscar.
     * @return : Retorna el programa buscado con los párametros.
     */
     public ProgramaInstalado buscarProgramaPorCategoria(int codigo, String categoria)
    {
        ProgramaInstalado programa = null;
        boolean encontrado = false;
        
        for(int indice = 0; indice < programas.size() && !encontrado; indice ++){
            
            if(programas.get(indice).getCodigo()==codigo && programas.get(indice).getCategoria().equals(categoria)){
                programa = (ProgramaInstalado) programas.get(indice);
                encontrado=true;
            }
            
        }
        return programa;
    }
     
     // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8EC1A95D-DA74-D579-7E38-70C9580D04B3]
    // </editor-fold> 
    /**
     * Agrega un mantenimiento a un computador con el código, la fecha, el nombre del técnico y una descripción que se pasan
     * como párametros.
     * @param codigo: El código  del computador al cual se va a agregar un mantenimiento.
     * @param laFecha: La fecha la cual se ha hecho el mantenimiento. la Fecha debe ser menor o igual a la fecha actual a la
     * que se hace el mantenimiento.
     * @param elNombreTecnico: El nombre del técnico quien hace el mantenimiento a un computador.
     * @param laDescripcion : La descripción del mantenimiento que hace el técnico a un computador.
     * @throws java.lang.Exception :Excepción. Si el computador buscado por el código ya tiene un mantenimiento agregado en fecha específica, se debe 
     * lanzar una excepción informando este error.
     */
    public void agregarMantenimiento(int codigo,Date laFecha, String elNombreTecnico, String laDescripcion) throws Exception
    {
        Mantenimiento mantenimiento = buscarMantenimiento(codigo);
        if(mantenimiento == null)
        {
            mantenimiento = new Mantenimiento(codigo,laFecha,elNombreTecnico,laDescripcion);
            mantenimientos.add(mantenimiento);
        }
        else
        {
            throw new Exception("En este día ya se registró un mantenimiento para el computador con código: "+ codigo +"\n"+"Por favor elija la opción 'Modificar'");
        }
    }

    /**
     * Busca un mantenimiento por el código  que se pasa como párametro.
     * @param codigo: El código del mantenimiento que se va a buscar.
     * @return : Retorna el mantenimiento de un computador.
     */
     public Mantenimiento buscarMantenimiento(int codigo)
    {
        Mantenimiento mantenimiento = null;
        boolean encontrado = false;
        
        for(int indice = 0; indice < mantenimientos.size() && !encontrado; indice ++){
            
            if(mantenimientos.get(indice).getCodigo()==codigo){
                mantenimiento = (Mantenimiento) mantenimientos.get(indice);
                encontrado=true;
            }
            
        }
        return mantenimiento;
    }
     
     
      public int darTotalMantenimientos(){
         return mantenimientos.size();
     }
     
    
     
     
             
     public int darman(){
         int posicion=0;
         for (int i = 0; i < mantenimientos.size(); i++) {
             
             if(mantenimientos.size()==0){
                 posicion++;
             }
         }
         return posicion;
     }
    /**
     * Completar
     */
    public void eliminarMantenimiento () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E24B06C3-BA8C-AB3D-EC92-A5E0BE328CEC]
    // </editor-fold> 
    /**
     * Completar
     */
    public void eliminarProgramaInstalado () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.806ACAF4-F5A4-4147-E23C-FFA225CDB7E8]
    // </editor-fold> 
    /**
     * Completar
     */
    public void eliminarCaracteristicaFisica () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0D26F689-41A3-78C6-F8BE-26F0FFD0230E]
    // </editor-fold> 
    /**
     * Completar
     */
    public void modificarMantenimiento (int codigo, Mantenimiento nueva) throws Exception
        {
            Mantenimiento miMantenimiento = buscarMantenimiento(codigo);
            if(miMantenimiento != null)
            {
                nueva.getCodigo();
                nueva.getFecha();
                nueva.getDescripcion();
                nueva.getNombreTecnicoMantenimiento();
                mantenimientos.remove(miMantenimiento);
                mantenimientos.add(nueva);
            }
            else
            {
                throw new Exception("No se pudo modificar el Mantenimiento, verifique la información");
            }
        }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.521ED7A6-A809-BF89-0328-564F91A3F53B]
    // </editor-fold> 
    /**
     * Completar
     */
    public void modificarProgramaInstalado (int codigo, ProgramaInstalado nuevo) throws Exception
        {
            ProgramaInstalado miProgramaInstalado = buscarPrograma(codigo);
            if(miProgramaInstalado != null)
            {
                nuevo.getCodigo();
                nuevo.getDescripcion();
                nuevo.getCategoria();
                programas.remove(miProgramaInstalado);
                programas.add(nuevo);
            }
            else
            {
                throw new Exception("No se pudo modificar el Programa Instalado, verifique la información");
            }
        }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.035164BD-9837-71F4-5242-0B322F670408]
    // </editor-fold> 
    /**
     * Completar
     */
    public void modificarCaracteristicaFisica (int codigo, CaracteristicaFisica nueva) throws Exception {
        CaracteristicaFisica miCaracteristicaFisica = buscarCaracteristica(codigo);
        if(miCaracteristicaFisica != null)
        {
            nueva.getCodigo();
            nueva.getDescripcion();
            nueva.getCategoria();
            caracteristicas.remove(miCaracteristicaFisica);
            caracteristicas.add(nueva);
        }
        else
        {
            throw new Exception("No se pudo modificar la Caracteristica Física, verifique la información");
        }
}

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.45F00FEF-3E4F-8486-E9EF-77DCF2B31361]
    // </editor-fold> 
    /**
     * Método encargado de retornar un ArrayList con las caracteristicas fisicas de un computador
     * @return :Retorna un ArrayList de tipo caracteristicas.
     */
    public ArrayList<CaracteristicaFisica> getCaracteristicas () {
        return caracteristicas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.966F1E5B-A572-61A7-CFF5-3EDB4E22ACA8]
    // </editor-fold> 
    /**
     * Método encargado de dar las caracteristicas fisicas de un computador.
     * @param val Valor de las caracteristicas que se pasa como párametros.
     */
    public void setCaracteristicas (ArrayList<CaracteristicaFisica> val) {
        this.caracteristicas = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.64F264DA-7BAD-658D-ACFD-FDF35A2E5D89]
    // </editor-fold> 
    /**
     * Método encargado de retornar un ArrayList con los mantenimientos de un computador.
     * @return : Retorna un ArrayList de tipo mantenimientos.
     */
    public ArrayList<Mantenimiento> getMantenimientos () {
        
        return mantenimientos;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.05831DE9-B9C4-6F1B-A99B-F2261AF961DC]
    // </editor-fold> 
    /**
     * Método encargado de dar un ArrayList con los mantenimientos de un computador.
     * @param val: Valor del mantenimiento que se pasa como párametros.
     */
    public void setMantenimientos (ArrayList<Mantenimiento> val) {
        this.mantenimientos = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6A8823D2-2E52-199C-C7DC-0ADBFF6300E2]
    // </editor-fold> 
    /**
     * Método encargado de retornar un ArrayList con los programas instalados a un computador.
     * @return : Retorna un ArrayList con los programas instalados a un computador.
     */
    public ArrayList<ProgramaInstalado> getProgramas () {
        return programas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FA1B595A-852A-36A6-2F6D-5F9C8A953EC0]
    // </editor-fold> 
    /**
     * Método encargado de dar un ArrayList con los programas instalados a un computador.
     * @param val : Valor del programa instalado que se pasa como párametro.
     */
    public void setProgramas (ArrayList<ProgramaInstalado> val) {
        this.programas = val;
    }

    /**
     * Método encargado de retornar el código convertido a string para 
     * agregarlo al combo computadores que se encuentran en las:
     * Caracteristicas fisicas
     * Programas instalados
     * Mantenimientos.
     * @return : Retorna el código del computador.
     */
   @Override
    public String toString() {
        return ""+codigo;
    }
       
       public int getTotalMantenimientos() {
        return totalMantenimientos;
    }

    public void setTotalMantenimientos(int totalMantenimientos) {
        this.totalMantenimientos = totalMantenimientos;
    }
      
}

