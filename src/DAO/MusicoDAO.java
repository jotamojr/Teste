
package DAO;

import Connection.ConnectionFactory;
import Model.Gravadora;
import Model.Musica;
import Model.Musico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jotamo Jr
 */
public class MusicoDAO {
    public Musica save (Musica musica){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(musica);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Musica adicionada com sucesso");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Falha ao adicionar a Musica");
        }finally{
            em.close();
    }
        return musica;
    }
    
    public Musica actualizar (Musica musica){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.merge(musica);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Musica adicionada com sucesso");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Falha ao adicionar a musica");
        }finally{
            em.close();
        }
        return musica;
    }
    
    public Musica delete(int id){
        EntityManager em = new ConnectionFactory().getConnection();
        
        Musica musica=null;
        try{
            musica=em.find(Musica.class, id);
            em.getTransaction().begin();
            em.remove(musica);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return musica;  
    }
    
    public Musico procurar(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Musico musico=null;
        try{
             musico=em.find(Musico.class, id);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return musico;
    }
    public List<Musica> findAll(){
        EntityManager em =new ConnectionFactory().getConnection();
        List<Musica> musica = null;
        
        try{
            musica=em.createQuery("Musica").getResultList();
            
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return musica;
    }
}
