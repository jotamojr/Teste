package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Musica.class)
public abstract class Musica_ {

	public static volatile SingularAttribute<Musica, Integer> idMusica;
	public static volatile SingularAttribute<Musica, String> estilo;
	public static volatile SingularAttribute<Musica, String> titulo;
	public static volatile SingularAttribute<Musica, String> generoMusical;
	public static volatile SingularAttribute<Musica, Musico> musicoidMusico;
	public static volatile SingularAttribute<Musica, Gravadora> gravadoraidGravadora;

	public static final String ID_MUSICA = "idMusica";
	public static final String ESTILO = "estilo";
	public static final String TITULO = "titulo";
	public static final String GENERO_MUSICAL = "generoMusical";
	public static final String MUSICOID_MUSICO = "musicoidMusico";
	public static final String GRAVADORAID_GRAVADORA = "gravadoraidGravadora";

}

