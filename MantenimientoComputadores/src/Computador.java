import java.util.ArrayList; 
import java.util.Date;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.263D1C73-FCF0-D0F0-A4A0-9A5C6025613C]
// </editor-fold> 
public class Computador {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F56FB90D-6C3F-AC89-CCBC-963864E49768]
    // </editor-fold> 
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.26C3E05D-D6E4-0060-BA4A-C55979A1C8B5]
    // </editor-fold> 
    private double precio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AE32D37C-014C-4175-A4A4-222DD5AEF3A9]
    // </editor-fold> 
    private String encargado;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D8049699-3DC1-9B26-E31C-9FB25A6289EA]
    // </editor-fold> 
    private String ubicacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.084C142F-2373-0860-8774-7D7BD1AAB2D0]
    // </editor-fold> 
    private ArrayList<CaracteristicaFisica> caracteristicas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D3EB4F04-246A-9999-A6E7-B70BD891B5AB]
    // </editor-fold> 
    private ArrayList<ProgramaInstalado> programas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DAE9DE82-2809-BFBC-ECEF-8A5BDBA3BFD1]
    // </editor-fold> 
    private ArrayList<Mantenimiento> mantenimientos;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F75894AC-2DE3-9207-A609-6D88250B1A7D]
    // </editor-fold> 
    public Computador (int elCodigo, double elPrecio, String elEncargado, String laUbicacion) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0B6B0203-97FC-C712-F636-9443AA6DAEB6]
    // </editor-fold> 
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.49397215-B14D-D37B-61A9-DD57A947335E]
    // </editor-fold> 
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.355B37CE-8CC8-40BD-B976-B5A27ECEC1D8]
    // </editor-fold> 
    public String getEncargado () {
        return encargado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E53CC9D3-049D-F5D4-3434-97DE7E2B1E7E]
    // </editor-fold> 
    public void setEncargado (String val) {
        this.encargado = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.96DDB507-752F-4CB6-D300-4667633CD38A]
    // </editor-fold> 
    public double getPrecio () {
        return precio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.25DB6D6D-3D5B-4236-E620-E8485B3824F0]
    // </editor-fold> 
    public void setPrecio (double val) {
        this.precio = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F2088934-B14C-E4F6-2103-F4E0DE77741E]
    // </editor-fold> 
    public String getUbicacion () {
        return ubicacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.380635A7-6182-845A-4AFA-79FA010C461C]
    // </editor-fold> 
    public void setUbicacion (String val) {
        this.ubicacion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8EC1A95D-DA74-D579-7E38-70C9580D04B3]
    // </editor-fold> 
    public void agregarMantenimiento (Date laFecha, String elNombreTecnico, String laDescripcion) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DB22F53A-18FC-EE82-7D9B-89D87B9BEC70]
    // </editor-fold> 
    public void agregarProgramaInstalado (String elNombre, String laCategoria) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1A2A7AF0-B787-E8F1-33FE-24B371127921]
    // </editor-fold> 
    public void agregarCaraceristicaFisica (String elNombre, String laDescripcion) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F27E48F8-E254-9A71-79AB-80C5A3C1CDA7]
    // </editor-fold> 
    public void eliminarMantenimiento () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E24B06C3-BA8C-AB3D-EC92-A5E0BE328CEC]
    // </editor-fold> 
    public void eliminarProgramaInstalado () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.806ACAF4-F5A4-4147-E23C-FFA225CDB7E8]
    // </editor-fold> 
    public void eliminarCaracteristicaFisica () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0D26F689-41A3-78C6-F8BE-26F0FFD0230E]
    // </editor-fold> 
    public void modificarMantenimiento () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.521ED7A6-A809-BF89-0328-564F91A3F53B]
    // </editor-fold> 
    public void modificarProgramaInstalado () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.035164BD-9837-71F4-5242-0B322F670408]
    // </editor-fold> 
    public void modificarCaracteristicaFisica () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.45F00FEF-3E4F-8486-E9EF-77DCF2B31361]
    // </editor-fold> 
    public ArrayList<CaracteristicaFisica> getCaracteristicas () {
        return caracteristicas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.966F1E5B-A572-61A7-CFF5-3EDB4E22ACA8]
    // </editor-fold> 
    public void setCaracteristicas (ArrayList<CaracteristicaFisica> val) {
        this.caracteristicas = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.64F264DA-7BAD-658D-ACFD-FDF35A2E5D89]
    // </editor-fold> 
    public ArrayList<Mantenimiento> getMantenimientos () {
        return mantenimientos;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.05831DE9-B9C4-6F1B-A99B-F2261AF961DC]
    // </editor-fold> 
    public void setMantenimientos (ArrayList<Mantenimiento> val) {
        this.mantenimientos = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6A8823D2-2E52-199C-C7DC-0ADBFF6300E2]
    // </editor-fold> 
    public ArrayList<ProgramaInstalado> getProgramas () {
        return programas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FA1B595A-852A-36A6-2F6D-5F9C8A953EC0]
    // </editor-fold> 
    public void setProgramas (ArrayList<ProgramaInstalado> val) {
        this.programas = val;
    }

}

