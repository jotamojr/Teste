package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Musico.class)
public abstract class Musico_ {

	public static volatile SingularAttribute<Musico, Integer> idMusico;
	public static volatile SingularAttribute<Musico, String> apelido;
	public static volatile SingularAttribute<Musico, Integer> numeroMusicas;
	public static volatile SingularAttribute<Musico, String> estiloMusical;
	public static volatile SingularAttribute<Musico, String> nome;
	public static volatile CollectionAttribute<Musico, Musica> musicaCollection;

	public static final String ID_MUSICO = "idMusico";
	public static final String APELIDO = "apelido";
	public static final String NUMERO_MUSICAS = "numeroMusicas";
	public static final String ESTILO_MUSICAL = "estiloMusical";
	public static final String NOME = "nome";
	public static final String MUSICA_COLLECTION = "musicaCollection";

}

