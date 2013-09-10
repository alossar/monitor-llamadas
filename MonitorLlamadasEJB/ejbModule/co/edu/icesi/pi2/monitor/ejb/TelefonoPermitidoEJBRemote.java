package co.edu.icesi.pi2.monitor.ejb;

import java.util.List;
import javax.ejb.Remote;

import co.edu.icesi.pi2.monitor.modelo.TelefonoPermitido;


/**
 * @generated DT_ID=none
 */
@Remote
public interface TelefonoPermitidoEJBRemote
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public TelefonoPermitido persistTelefonoPermitido(TelefonoPermitido telefonoPermitido);

    /**
     * @generated DT_ID=none
     */
    public TelefonoPermitido mergeTelefonoPermitido(TelefonoPermitido telefonoPermitido);

    /**
     * @generated DT_ID=none
     */
    public void removeTelefonoPermitido(TelefonoPermitido telefonoPermitido);

    /**
     * @generated DT_ID=none
     */
    public List<TelefonoPermitido> getTelefonoPermitidoFindAll();

    /**
     * @generated DT_ID=none
     */
    public List<TelefonoPermitido> getTelefonoPermitidoFindByNumero(String numero);

    /**
     * @generated DT_ID=none
     */
    public List<TelefonoPermitido> getTelefonoPermitidoFindByExtensionExtensionId(java.math.BigInteger extensionExtensionId);

}
