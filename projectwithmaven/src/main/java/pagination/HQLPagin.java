package pagination;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hib.projectwithmaven.Student;

public class HQLPagin {
	
	public static void main(String[] args) {
		
		SessionFactory factory =  new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		Query q = s.createQuery("from Student ");
		
		//implementing pagination
		q.setFirstResult(0);
		q.setMaxResults(5);
		List<Student> list = q.list();
		
		for(Student st : list)
		{System.out.println(st.getName() + st.getId());}
		
		
		
		s.close();
		
		factory.close();
		
		
	}
}
