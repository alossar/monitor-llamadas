package co.edu.icesi.pi2.monitor.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.icesi.pi2.monitor.modelo.Telefono;


/**
 * @generated DT_ID=none
 */
@Stateless(name = "TelefonoEJB", mappedName = "MonitorLlamadasEAR-MonitorLlamadasJPA-TelefonoEJB")
public class TelefonoEJB
        implements TelefonoEJBLocal, TelefonoEJBRemote
{

    /**
     * @generated DT_ID=none
     */
    @PersistenceContext(unitName="MonitorLlamadasJPA")
    private EntityManager em;

    /**
     * @generated DT_ID=none
     */
    public TelefonoEJB() {
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
    public Telefono persistTelefono(Telefono telefono) {
        em.persist(telefono);
        return telefono;
    }

    /**
     * @generated DT_ID=none
     */
    public Telefono mergeTelefono(Telefono telefono) {
        return em.merge(telefono);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeTelefono(Telefono telefono) {
        telefono = em.find(Telefono.class, telefono.getNumero());
        em.remove(telefono);
    }

    /**
     * @generated DT_ID=none
     */
    public List<Telefono> getTelefonoFindAll() {
        return em.createNamedQuery("Telefono.findAll").getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public List<Telefono> getTelefonoFindByNumero(String numero) {
        return em.createNamedQuery("Telefono.findByNumero").setParameter("numero", numero).getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public List<Telefono> getTelefonoFindByExtension(String extension) {
        return em.createNamedQuery("Telefono.findByExtension").setParameter("extension", extension).getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public List<Telefono> getTelefonoFindByTipo(String tipo) {
        return em.createNamedQuery("Telefono.findByTipo").setParameter("tipo", tipo).getResultList();
    }

}
