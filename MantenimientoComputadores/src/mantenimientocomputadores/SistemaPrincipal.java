package mantenimientocomputadores;

import java.awt.List;
import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E585918A-CA63-57D0-C1F2-E632F4A595D1]
// </editor-fold> 
public class SistemaPrincipal {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.46DB52C0-1A2F-6BD4-F51C-1A4B3BFC7492]
    // </editor-fold> 
    private ArrayList<Computador> computadores;
    private Computador computador;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.232D4151-4A9B-4E40-D7CB-DD071F92864F]
    // </editor-fold> 
    public SistemaPrincipal () 
    {
        computadores = new ArrayList<Computador>();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F42DE085-0E27-17F4-68DA-264EB1096A15]
    // </editor-fold> 
    public void agregarComputador (int codigo, int precio, String encargado, String ubicacion) throws Exception 
    {
        Computador computador = buscarComputador(codigo);
        if(computador==null){
            computador = new Computador(codigo, precio, encargado, ubicacion);
            computadores.add(computador);
        }
        else{
            throw new Exception("Ya existe un computador registrado con el codigo: "+ codigo);
        }
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.825669A4-16B7-FE16-67BC-251CE446F967]
    // </editor-fold> 
    public void agregarMantenimiento (int codigo) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.52A03B08-3F78-A9B6-FFEA-8AB0BDD09253]
    // </editor-fold> 
    public void agregarCaracteristicafisica (int codigo) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.00A15B03-6469-5126-9DBA-6A8D48268A81]
    // </editor-fold> 
    public void ProgramaInstalado (int codigo) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D1795AA8-1652-CEA3-9EE2-6283B5FA621A]
    // </editor-fold> 
    public Computador buscarComputador (int Codigo)
    {
        Computador  computador = null;
        boolean encontrado = false;
        
        for(int indice = 0; indice < computadores.size() && !encontrado; indice ++){
            computador = (Computador) computadores.get(indice);
            if(computador.getCodigo()==Codigo){
                encontrado=true;
            }
            
        }
        return computador;
       
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C51CCA64-7CED-4CF0-748C-506EC20C409B]
    // </editor-fold> 
    public void modificarMantenimiento (int codigo, Mantenimiento Unnamed) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D0919868-180E-67BC-3D6F-1CDD29A49A4B]
    // </editor-fold> 
    public void modificarProgramaInstalado (int codigo, ProgramaInstalado Unnamed) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C4888692-4CF9-CC10-A99E-B5C426CC73DA]
    // </editor-fold> 
    public void modificarCaracteristicaFisica (int codigo, CaracteristicaFisica Unnamed) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0350EAC8-67ED-D899-8A83-D39DB3CEC514]
    // </editor-fold> 
    public void eliminarComputador (int codigo) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B7654196-68A6-C418-94E1-6C8F320E5500]
    // </editor-fold> 
    public void eliminarCaracteristicaFisica (int codigo) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.206C118A-60FE-E6FC-A15F-7CB1A03B21C9]
    // </editor-fold> 
    public void eliminarProgramaInstalado (int codigo) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.72CCB6E0-A492-1B92-A965-2E0C6A7D830F]
    // </editor-fold> 
    public List mostrarMantenimiento () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.03FD6FAB-1DF5-3F2A-65CC-09DDA696AA94]
    // </editor-fold> 
    public ArrayList darComputador () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.791EE7AA-5ABA-1340-E725-CD30EE866BCF]
    // </editor-fold> 
    public int darAnioMasMantenimiento () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.66B476FE-1762-16F5-21C1-8C5A074836BE]
    // </editor-fold> 
    public ArrayList ComputadoresMasMantenimiento () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9FB714D1-34AC-78A9-7C81-8A61F831FBEC]
    // </editor-fold> 
    public ArrayList darComputadoresMenosMantenimientos () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.76068887-F01C-18A1-56BC-F5015E9866B1]
    // </editor-fold> 
    public ArrayList<Computador> getComputadores () {
        return computadores;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.52020496-40F2-7CBB-A75F-992B054FCE3B]
    // </editor-fold> 
    public void setComputadores (ArrayList<Computador> val) {
        this.computadores = val;
    }

}

