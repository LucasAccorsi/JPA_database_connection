package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		
		 /* Criando Pessoas */
		/*
		 * Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		 * Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		 * Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		*/
		
		/* Conexão com banco */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		/* Colocar no banco
		 * Inicio da alteracao
		*/
		/*
		 * em.getTransaction().begin();
		 * em.persist(p1);
		 * em.persist(p2);
		 * em.persist(p3);
		 * em.getTransaction().commit();
		*/
		/* Fim da alteração */

		/* Buscar no banco */
		/*
		 * Pessoa p = em.find(Pessoa.class, 2);
		 * System.out.println(p);
		*/
		
		/* Remover no banco */
		/* E necessario procurar ou acaber de ter sido inserido no banco antes de remorver */
		/*
		 * Pessoa p = em.find(Pessoa.class, 2); em.getTransaction().begin();
		 * em.remove(p); em.getTransaction().commit();
		 */
		
		System.out.println("Pronto");

		/* fechar conexao */
		em.close();
		emf.close();

	}
}
