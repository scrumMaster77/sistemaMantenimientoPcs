package mantenimientocomputadores.mundo;


import java.util.Date;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.C7DBF8E9-9384-2068-3162-D221892A60F3]
// </editor-fold> 
/**
 * Completar
 * @author Luis Eduardo
 */
public class Mantenimiento {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3650C814-2D54-6C00-548D-44A6D414AA3A]
    // </editor-fold> 
    /**
     * Completar
     */
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B8EEF842-D057-DD1E-49B6-4067A7352F21]
    // </editor-fold> 
    /**
     * Completar
     */
    private Date fecha;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5C8AC7FF-F42F-6050-7544-68CEB218B269]
    // </editor-fold> 
    /**
     * Completar
     */
    private String descripcion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B9E874CA-205B-5326-0B03-34456726F17E]
    // </editor-fold> 
    /**
     * Completar
     */
    private String nombreTecnicoMantenimiento;

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D158B618-3A2E-59BE-DAAB-A52761A51159]
    // </editor-fold> 
    /**
     * Completar
     * @param elCodigo
     * @param laFecha
     * @param laDescripcion
     * @param elNombreTecnico 
     */
    public Mantenimiento (int elCodigo, Date laFecha,String elNombreTecnico,String laDescripcion)
    {
        codigo = elCodigo;
        fecha = laFecha;
        descripcion = laDescripcion;
        nombreTecnicoMantenimiento = elNombreTecnico;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B2D4984F-F9D5-74B2-A875-CFBD622E1865]
    // </editor-fold> 
    /**
     * Completar
     * @return 
     */
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.52E9E7C7-E32F-6D57-521F-E7614E320519]
    // </editor-fold> 
    /**
     * Completar
     * @param val 
     */
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D55F7CDB-F16F-24BA-BE4E-75B325D4DE8A]
    // </editor-fold> 
    /**
     * Completar
     * @return 
     */
    public String getDescripcion () {
        return descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.20635731-58D5-5A17-3098-9806E856BEC0]
    // </editor-fold> 
    /**
     * Completar
     * @param val 
     */
    public void setDescripcion (String val) {
        this.descripcion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.140057B5-9C85-4FE7-33BC-82225A73AF2B]
    // </editor-fold> 
    /**
     * Completar
     * @return 
     */
    public Date getFecha () 
    {
        return fecha;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.615B365D-E794-112B-0760-212CDCF12C95]
    // </editor-fold> 
    /**
     * Completar
     * @param val 
     */
    public void setFecha (Date val) {
        this.fecha = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.30BB26C3-62DB-C87A-F085-04C9C8DFA170]
    // </editor-fold> 
    /**
     * Completar
     * @return 
     */
    public String getNombreTecnicoMantenimiento () {
        return nombreTecnicoMantenimiento;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.701DC38A-E12C-825A-EA03-9151A7898ACA]
    // </editor-fold> 
    /**
     * Completar
     * @param val 
     */
    public void setNombreTecnicoMantenimiento (String val) {
        this.nombreTecnicoMantenimiento = val;
    }

}

