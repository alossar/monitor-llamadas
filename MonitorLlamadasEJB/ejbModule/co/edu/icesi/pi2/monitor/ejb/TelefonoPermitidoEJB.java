package co.edu.icesi.pi2.monitor.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.icesi.pi2.monitor.modelo.TelefonoPermitido;


/**
 * @generated DT_ID=none
 */
@Stateless(name = "TelefonoPermitidoEJB", mappedName = "MonitorLlamadasEAR-MonitorLlamadasJPA-TelefonoPermitidoEJB")
public class TelefonoPermitidoEJB
        implements TelefonoPermitidoEJBLocal, TelefonoPermitidoEJBRemote
{

    /**
     * @generated DT_ID=none
     */
    @PersistenceContext(unitName="MonitorLlamadasJPA")
    private EntityManager em;

    /**
     * @generated DT_ID=none
     */
    public TelefonoPermitidoEJB() {
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
    public TelefonoPermitido persistTelefonoPermitido(TelefonoPermitido telefonoPermitido) {
        em.persist(telefonoPermitido);
        return telefonoPermitido;
    }

    /**
     * @generated DT_ID=none
     */
    public TelefonoPermitido mergeTelefonoPermitido(TelefonoPermitido telefonoPermitido) {
        return em.merge(telefonoPermitido);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeTelefonoPermitido(TelefonoPermitido telefonoPermitido) {
        telefonoPermitido = em.find(TelefonoPermitido.class, telefonoPermitido.getNumero());
        em.remove(telefonoPermitido);
    }

    /**
     * @generated DT_ID=none
     */
    public List<TelefonoPermitido> getTelefonoPermitidoFindAll() {
        return em.createNamedQuery("TelefonoPermitido.findAll").getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public List<TelefonoPermitido> getTelefonoPermitidoFindByNumero(String numero) {
        return em.createNamedQuery("TelefonoPermitido.findByNumero").setParameter("numero", numero).getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public List<TelefonoPermitido> getTelefonoPermitidoFindByExtensionExtensionId(java.math.BigInteger extensionExtensionId) {
        return em.createNamedQuery("TelefonoPermitido.findByExtensionExtensionId").setParameter("extensionExtensionId", extensionExtensionId).getResultList();
    }

}
