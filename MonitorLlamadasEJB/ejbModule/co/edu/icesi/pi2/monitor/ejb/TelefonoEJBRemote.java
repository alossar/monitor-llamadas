package co.edu.icesi.pi2.monitor.ejb;

import java.util.List;
import javax.ejb.Remote;

import co.edu.icesi.pi2.monitor.modelo.Telefono;


/**
 * @generated DT_ID=none
 */
@Remote
public interface TelefonoEJBRemote
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Telefono persistTelefono(Telefono telefono);

    /**
     * @generated DT_ID=none
     */
    public Telefono mergeTelefono(Telefono telefono);

    /**
     * @generated DT_ID=none
     */
    public void removeTelefono(Telefono telefono);

    /**
     * @generated DT_ID=none
     */
    public List<Telefono> getTelefonoFindAll();

    /**
     * @generated DT_ID=none
     */
    public List<Telefono> getTelefonoFindByNumero(String numero);

    /**
     * @generated DT_ID=none
     */
    public List<Telefono> getTelefonoFindByExtension(String extension);

    /**
     * @generated DT_ID=none
     */
    public List<Telefono> getTelefonoFindByTipo(String tipo);

}
