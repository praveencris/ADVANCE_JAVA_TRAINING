package mypackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentClient {
	public static void main(String args[])
	{
		final EntityManagerFactory emf =
		     	Persistence.createEntityManagerFactory("MYJSE");
				System.out.println("welcome");
				EntityManager em = emf.createEntityManager();
				EntityTransaction et=em.getTransaction();
				et.begin();
				Student s=new Student();
				s.setId(19);
				s.setSname("dsfds");
				s.setRoll(33);
				s.setCourse("Commerce");
em.persist(s);
				
				java.util.List<Student> l=em.createQuery("Select stud from Student stud")
				.setMaxResults(5).getResultList();
				java.util.Iterator<Student> iter=l.iterator();
				while(iter.hasNext())
				{
					Student st=iter.next();
					System.out.println("Name is "+st.getSname() +"   "+st.getId());
				}
			/*	Student s1=em.find(Student.class, 11);
				s1.setRoll(51);
				s1.setCourse("computer");
				System.out.println("Student code is "+s1.getId());
				System.out.println("Student course is "+s1.getCourse());
			*/	
				et.commit();
				
				
				
	}

}
