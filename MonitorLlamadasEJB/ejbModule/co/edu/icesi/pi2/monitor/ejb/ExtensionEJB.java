package co.edu.icesi.pi2.monitor.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.icesi.pi2.monitor.modelo.Extension;


/**
 * @generated DT_ID=none
 */
@Stateless(name = "ExtensionEJB", mappedName = "MonitorLlamadasEAR-MonitorLlamadasJPA-ExtensionEJB")
public class ExtensionEJB
        implements ExtensionEJBLocal, ExtensionEJBRemote
{

    /**
     * @generated DT_ID=none
     */
    @PersistenceContext(unitName="MonitorLlamadasJPA")
    private EntityManager em;

    /**
     * @generated DT_ID=none
     */
    public ExtensionEJB() {
    }

    /**
     * @generated DT_ID=none
     */
    public Object queryByRange(String jpqlStmt, int firstResult,
                               int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }

        return query.getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public Extension persistExtension(Extension extension) {
        em.persist(extension);
        return extension;
    }

    /**
     * @generated DT_ID=none
     */
    public Extension mergeExtension(Extension extension) {
        return em.merge(extension);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeExtension(Extension extension) {
        extension = em.find(Extension.class, extension.getExtensionId());
        em.remove(extension);
    }

    /**
     * @generated DT_ID=none
     */
    public List<Extension> getExtensionFindAll() {
        return em.createNamedQuery("Extension.findAll").getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public List<Extension> getExtensionFindByNumero(String numero) {
        return em.createNamedQuery("Extension.findByNumero").setParameter("numero", numero).getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public List<Extension> getExtensionFindByNombre(String nombre) {
        return em.createNamedQuery("Extension.findByNombre").setParameter("nombre", nombre).getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public List<Extension> getExtensionFindByExtensionId(java.math.BigDecimal extensionId) {
        return em.createNamedQuery("Extension.findByExtensionId").setParameter("extensionId", extensionId).getResultList();
    }

}
