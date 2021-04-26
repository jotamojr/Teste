package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Gravadora.class)
public abstract class Gravadora_ {

	public static volatile SingularAttribute<Gravadora, Short> estado;
	public static volatile SingularAttribute<Gravadora, Integer> numeroMusicas;
	public static volatile SingularAttribute<Gravadora, String> nome;
	public static volatile SingularAttribute<Gravadora, Integer> idGravadora;
	public static volatile CollectionAttribute<Gravadora, Musica> musicaCollection;

	public static final String ESTADO = "estado";
	public static final String NUMERO_MUSICAS = "numeroMusicas";
	public static final String NOME = "nome";
	public static final String ID_GRAVADORA = "idGravadora";
	public static final String MUSICA_COLLECTION = "musicaCollection";

}

