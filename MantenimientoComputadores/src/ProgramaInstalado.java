
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.07997858-A13A-FD24-4980-909BA16D8B20]
// </editor-fold> 
public class ProgramaInstalado {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6DB183B3-3D53-BB8F-9063-009F9281CD77]
    // </editor-fold> 
    public static final String SISTEMA_OPERATIVO = "Sistema operativo";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E8D2EFB0-74B9-4C91-B762-3F55F59CBCB2]
    // </editor-fold> 
    public static final String OFIMATICA = "Ofimatica";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1099F1D5-6B6F-6D60-0358-CCABD4107D57]
    // </editor-fold> 
    public static final String GRAFICOS = "Graficos";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DA264026-139A-C3EA-E5AE-5994741FA00C]
    // </editor-fold> 
    public static final String ANTIVIRUS = "Antivirus";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6CEA3926-0569-FEBC-60AC-DEB26B5F88B3]
    // </editor-fold> 
    public static final String LENGUAJE_PROGRAMACION = "Lenguaje programacion";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.187C794C-57E6-7621-F911-1F2E5932FBC0]
    // </editor-fold> 
    public static final String IDE = "IDE";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C9BA177C-6120-31F5-98BB-96681AE7F524]
    // </editor-fold> 
    public static final String GRAFICO = "Graficos";

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.13E45DD6-D867-FD13-C06A-DCF15CE4B759]
    // </editor-fold> 
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.523DBE67-B14C-A13A-9690-A11726CAE2D5]
    // </editor-fold> 
    private String descripcion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2FA6CF04-DE04-1D10-4DD8-8CD46153F474]
    // </editor-fold> 
    private String categoria;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.24877C5D-1270-4923-DE67-4192599C5C60]
    // </editor-fold> 
    public ProgramaInstalado (int elCodigo, String laDescripcion, String laCategoria) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FB371F91-B69C-9F39-083F-3D2B388345CB]
    // </editor-fold> 
    public String getCategoria () {
        return categoria;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6B535BBB-22D2-750E-0B25-EECE2CC056F0]
    // </editor-fold> 
    public void setCategoria (String val) {
        this.categoria = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.392642B3-99A0-C43A-A590-89023B5CDCC1]
    // </editor-fold> 
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7469200F-0FCF-FB07-42CE-ACB724170B73]
    // </editor-fold> 
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4F319EF7-E98E-6E6A-EFF4-42C03FA2E368]
    // </editor-fold> 
    public String getDescripcion () {
        return descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3068AF29-55B9-0F33-7BC8-1054BCAA36E1]
    // </editor-fold> 
    public void setDescripcion (String val) {
        this.descripcion = val;
    }

}

