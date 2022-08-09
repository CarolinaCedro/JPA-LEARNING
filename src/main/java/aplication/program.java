package aplication;

import dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class program {
    public static void main(String[] args) {

        //Instanciando dados

//        Pessoa pessoa1 = new Pessoa(null, "teste1", "teste@gmail");
//        Pessoa pessoa2 = new Pessoa(null, "teste2", "teste@gmail");
//        Pessoa pessoa3 = new Pessoa(null, "teste3", "teste@gmail");
//        Pessoa pessoa4 = new Pessoa(null, "teste4", "teste@gmail");

        //o nome do arquivo passado ao final do entityManager dever ser o mesmo criando no persintence.xml
        //lá em persistence-unit name="exemplo-jpa"
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();


        //Inserindo Dados no banco
//        em.getTransaction().begin();
//        em.persist(pessoa1);
//        em.persist(pessoa2);
//        em.persist(pessoa3);
//        em.persist(pessoa4);
//        em.getTransaction().commit();


        //Buscando dado por id informado

//        Pessoa pessoa = em.find(Pessoa.class, 1);
//        System.out.println(pessoa);

    }
}
