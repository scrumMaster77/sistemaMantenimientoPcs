package mantenimientocomputadores.mundo;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.07997858-A13A-FD24-4980-909BA16D8B20]
// </editor-fold> 
/**
 * Completar
 * @author Luis Eduardo
 */
public class ProgramaInstalado {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6DB183B3-3D53-BB8F-9063-009F9281CD77]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String SISTEMA_OPERATIVO = "Sistema operatívo";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E8D2EFB0-74B9-4C91-B762-3F55F59CBCB2]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String OFIMATICA = "Ofimática";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1099F1D5-6B6F-6D60-0358-CCABD4107D57]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String GRAFICOS = "Gráficos";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DA264026-139A-C3EA-E5AE-5994741FA00C]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String ANTIVIRUS = "Antivirus";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6CEA3926-0569-FEBC-60AC-DEB26B5F88B3]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String LENGUAJE_PROGRAMACION = "Lenguaje programacion";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.187C794C-57E6-7621-F911-1F2E5932FBC0]
    // </editor-fold> 
    /**
     * Completar
     */
    public static final String IDE = "IDE";
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.13E45DD6-D867-FD13-C06A-DCF15CE4B759]
    // </editor-fold> 
    /**
     * Completar
     */
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.523DBE67-B14C-A13A-9690-A11726CAE2D5]
    // </editor-fold> 
    /**
     * Completar
     */
    private String descripcion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2FA6CF04-DE04-1D10-4DD8-8CD46153F474]
    // </editor-fold> 
    /**
     * Completar
     */
    private String categoria;
    
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.24877C5D-1270-4923-DE67-4192599C5C60]
    // </editor-fold> 
    /**
     * Completar
     * @param elCodigo
     * @param laCategoria 
     * @param laDescripcion
     */
    public ProgramaInstalado (int elCodigo, String laCategoria,String laDescripcion)
    {
        codigo = elCodigo;
        categoria = laCategoria;
        descripcion = laDescripcion;
       
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FB371F91-B69C-9F39-083F-3D2B388345CB]
    // </editor-fold> 
    /**
     * Completar
     * @return 
     */
    public String getCategoria () {
        return categoria;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6B535BBB-22D2-750E-0B25-EECE2CC056F0]
    // </editor-fold> 
    /**
     * Completar
     * @param val 
     */
    public void setCategoria (String val) {
        this.categoria = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.392642B3-99A0-C43A-A590-89023B5CDCC1]
    // </editor-fold> 
    /**
     * Completar
     * @return 
     */
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7469200F-0FCF-FB07-42CE-ACB724170B73]
    // </editor-fold> 
    /**
     * Completar
     * @param val 
     */
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4F319EF7-E98E-6E6A-EFF4-42C03FA2E368]
    // </editor-fold> 
    /**
     * Completar
     * @return 
     */
    public String getDescripcion () {
        return descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3068AF29-55B9-0F33-7BC8-1054BCAA36E1]
    // </editor-fold> 
    /**
     * Completar
     * @param val 
     */
    public void setDescripcion (String val) {
        this.descripcion = val;
    }

    public String getSISTEMA_OPERATIVO() {
        return SISTEMA_OPERATIVO;
    }

    public String getOFIMATICA() {
        return OFIMATICA;
    }

    public String getGRAFICOS() {
        return GRAFICOS;
    }

    public String getANTIVIRUS() {
        return ANTIVIRUS;
    }

    public String getLENGUAJE_PROGRAMACION() {
        return LENGUAJE_PROGRAMACION;
    }

    public String getIDE() {
        return IDE;
    }

}

