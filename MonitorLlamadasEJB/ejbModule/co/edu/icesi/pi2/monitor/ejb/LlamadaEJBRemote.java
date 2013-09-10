package co.edu.icesi.pi2.monitor.ejb;

import java.util.List;
import javax.ejb.Remote;

import co.edu.icesi.pi2.monitor.modelo.Llamada;


/**
 * @generated DT_ID=none
 */
@Remote
public interface LlamadaEJBRemote
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public Llamada persistLlamada(Llamada llamada);

    /**
     * @generated DT_ID=none
     */
    public Llamada mergeLlamada(Llamada llamada);

    /**
     * @generated DT_ID=none
     */
    public void removeLlamada(Llamada llamada);

    /**
     * @generated DT_ID=none
     */
    public List<Llamada> getLlamadaFindAll();

    /**
     * @generated DT_ID=none
     */
    public List<Llamada> getLlamadaFindByFecha(java.util.Date fecha);

    /**
     * @generated DT_ID=none
     */
    public List<Llamada> getLlamadaFindByDuracion(String duracion);

    /**
     * @generated DT_ID=none
     */
    public List<Llamada> getLlamadaFindByRutaarchivo(String rutaarchivo);

}
