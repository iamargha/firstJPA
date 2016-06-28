package firstJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("firstJPA");
		EntityManager entitymanager = emfactory.createEntityManager();

		// Scalar function
		Query query = entitymanager
				.createQuery("Select UPPER(e.username) from User e");
		List<String> list = query.getResultList();

		for (String e : list) {
			System.out.println("Employee NAME :" + e);
			System.out.println("Employee NAME :" + e);
		}

		// Aggregate function
		Query query1 = entitymanager
				.createQuery("Select MAX(e.username) from User e");
		Double result = (Double) query1.getSingleResult();
		System.out.println("Max Employee Salary :" + result);
	}

}
