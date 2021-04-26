
package DAO;

import Connection.ConnectionFactory;
import Model.Gravadora;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jotamo Jr
 */
public class GravadoraDAO {
    public Gravadora save (Gravadora gravadora){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(gravadora);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Gravadora adicionada com sucesso");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null,  e+" Falha ao adicionar a gravadora");
        }finally{
            em.close();
    }
        return gravadora;
    }
    
    public Gravadora actualizar (Gravadora gravadora){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.merge(gravadora);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Gravadora adicionada com sucesso");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Falha ao adicionar a gravadora");
        }finally{
            em.close();
        }
        return gravadora;
    }
    
    public Gravadora delete(int id){
        EntityManager em = new ConnectionFactory().getConnection();
        
        Gravadora gravadora=null;
        try{
            gravadora=em.find(Gravadora.class, id);
            em.getTransaction().begin();
            em.remove(gravadora);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return gravadora;  
    }
    
    public Gravadora procurar(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Gravadora gravadora=null;
        try{
             gravadora=em.find(Gravadora.class, id);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return gravadora;
    }
    public List<Gravadora> findAll(){
        EntityManager em =new ConnectionFactory().getConnection();
        List<Gravadora> gravadora = null;
        
        try{
            gravadora=em.createQuery("Gravadora").getResultList();
            
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return gravadora;
    }
}
