package Teste;

import DAO.GravadoraDAO;
import DAO.MusicaDAO;
import DAO.MusicoDAO;
import Model.Gravadora;
import Model.Musica;
import static Model.Musica_.musicoidMusico;
import Model.Musico;

/**
 *
 * @author Jotamo Jr
 */
public class Main {

    public static void main(String[] args) {
        
        GravadoraDAO dg =new GravadoraDAO();
        MusicoDAO dm = new MusicoDAO();
        MusicaDAO mdao=new MusicaDAO();

        //SALVA UMA GRAVADORA
        //Gravadora g = new Gravadora("JotamoGroove", 0);
        //dg.salvar(g);
        //SALVA UM MUSICO
        //Musico musico=new Musico("Jotamo Jr", "Mucavel", "Jazz", 0);
        //dg.salvar(musico);
        
        Gravadora gravadora = new Gravadora();
        gravadora = (Gravadora) dg.procurar(1);

        Musico musico = new Musico();
        musico = (Musico) dm.procurar(1);

        
        Musica musica = new Musica("Jazz", "Marijuana", "Genero Jazz", gravadora, musico);
        mdao.save(musica);
    }
}