package mantenimientocomputadores.mundo;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.7ED2444D-DCDF-0656-9593-3A6D9011B5F9]
// </editor-fold> 
/**
 * Completar
 * @author Luis Eduardo
 */
public class CaracteristicaFisica {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.22605DF9-E907-723A-ADDC-97BFBF858073]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String CPU = "CPU";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4B915EB7-C5DC-BC2B-6955-FC92512A6FED]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String RAM = "RAM";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4CDADEFA-2A4C-B662-9553-436DCCE7B823]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String DISCO_DURO = "Disco duro";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FD5CD9E5-A0E1-EDF5-F075-DC6559E84067]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String TECLADO = "Teclado";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BEB2D043-5E5F-7365-822D-9D1620ECF1B3]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String MOUSE = "Mouse";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E145F2A4-F6A7-8BFE-A21C-983A3F1A4589]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String UNIDAD_OPTICA = "Unidad óptica";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C2A35C8C-2835-1F12-A6AC-F19EEE627851]
    // </editor-fold> 
    /**
     * Completar
     */
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1FDD18D9-53BA-7541-50D6-CB0DCC342759]
    // </editor-fold> 
    /**
     * Completar
     */
    private String descripcion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0A4A37AF-9F96-48E1-A2AF-38A736E38AA5]
    // </editor-fold> 
    /**
     * Completar
     */
    private String categoria;

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A90901FA-19D9-07DD-288E-1403089C4F13]
    // </editor-fold> 
    /**
     * Completar
     * @param elCodigo
     * @param laDescripcion
     * @param laCategoria 
     */
    public CaracteristicaFisica (int elCodigo, String laCategoria,String laDescripcion)
    {
        codigo = elCodigo;
        categoria = laCategoria;
        descripcion = laDescripcion;
        
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D338B20A-8DB5-A587-81AA-91F3B323E749]
    // </editor-fold> 
    /**
     * Completar
     * @return 
     */
    public String getCategoria () {
        return categoria;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3736445D-E748-F0BD-C696-AFD6D4B052E8]
    // </editor-fold> 
    /**
     * Completar
     * @param val 
     */
    public void setCategoria (String val) {
        this.categoria = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DDCD2912-8727-65C3-2412-46202E457F4F]
    // </editor-fold> 
    /**
     * Completar
     * @return 
     */
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5524324E-5254-5C9C-13CA-E3DB62D9543F]
    // </editor-fold> 
    /**
     * Completar
     * @param val 
     */
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B6D8B8A0-635C-3401-76BB-867D4D9E2C40]
    // </editor-fold> 
    /**
     * Completar
     * @return 
     */
    public String getDescripcion () {
        return descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D1FDCC7D-3B28-DBA2-1080-1F09D5DD857A]
    // </editor-fold> 
    /**
     * Completar
     * @param val 
     */
    public void setDescripcion (String val) {
        this.descripcion = val;
    }

    /**
     * Completar
     * @return 
     */
    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getDISCO_DURO() {
        return DISCO_DURO;
    }

    public String getTECLADO() {
        return TECLADO;
    }

    public String getMOUSE() {
        return MOUSE;
    }

    public String getUNIDAD_OPTICA() {
        return UNIDAD_OPTICA;
    }

}

