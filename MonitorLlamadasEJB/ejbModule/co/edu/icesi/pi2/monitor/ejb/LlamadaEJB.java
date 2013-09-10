package co.edu.icesi.pi2.monitor.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.icesi.pi2.monitor.modelo.Llamada;


/**
 * @generated DT_ID=none
 */
@Stateless(name = "LlamadaEJB", mappedName = "MonitorLlamadasEAR-MonitorLlamadasJPA-LlamadaEJB")
public class LlamadaEJB
        implements LlamadaEJBLocal, LlamadaEJBRemote
{

    /**
     * @generated DT_ID=none
     */
    @PersistenceContext(unitName="MonitorLlamadasJPA")
    private EntityManager em;

    /**
     * @generated DT_ID=none
     */
    public LlamadaEJB() {
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
    public Llamada persistLlamada(Llamada llamada) {
        em.persist(llamada);
        return llamada;
    }

    /**
     * @generated DT_ID=none
     */
    public Llamada mergeLlamada(Llamada llamada) {
        return em.merge(llamada);
    }

    /**
     * @generated DT_ID=none
     */
    public void removeLlamada(Llamada llamada) {
        llamada = em.find(Llamada.class, llamada.getCodigollamada());
        em.remove(llamada);
    }

    /**
     * @generated DT_ID=none
     */
    public List<Llamada> getLlamadaFindAll() {
        return em.createNamedQuery("Llamada.findAll").getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public List<Llamada> getLlamadaFindByFecha(java.util.Date fecha) {
        return em.createNamedQuery("Llamada.findByFecha").setParameter("fecha", fecha).getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public List<Llamada> getLlamadaFindByDuracion(String duracion) {
        return em.createNamedQuery("Llamada.findByDuracion").setParameter("duracion", duracion).getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public List<Llamada> getLlamadaFindByRutaarchivo(String rutaarchivo) {
        return em.createNamedQuery("Llamada.findByRutaarchivo").setParameter("rutaarchivo", rutaarchivo).getResultList();
    }

}
