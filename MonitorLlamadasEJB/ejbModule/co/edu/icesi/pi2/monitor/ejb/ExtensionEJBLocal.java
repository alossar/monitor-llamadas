package co.edu.icesi.pi2.monitor.ejb;

import java.util.List;
import javax.ejb.Local;

import co.edu.icesi.pi2.monitor.modelo.Extension;


/**
 * @generated DT_ID=none
 */
@Local
public interface ExtensionEJBLocal
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Extension persistExtension(Extension extension);

    /**
     * @generated DT_ID=none
     */
    public Extension mergeExtension(Extension extension);

    /**
     * @generated DT_ID=none
     */
    public void removeExtension(Extension extension);

    /**
     * @generated DT_ID=none
     */
    public List<Extension> getExtensionFindAll();

    /**
     * @generated DT_ID=none
     */
    public List<Extension> getExtensionFindByNumero(String numero);

    /**
     * @generated DT_ID=none
     */
    public List<Extension> getExtensionFindByNombre(String nombre);

    /**
     * @generated DT_ID=none
     */
    public List<Extension> getExtensionFindByExtensionId(java.math.BigDecimal extensionId);

}
