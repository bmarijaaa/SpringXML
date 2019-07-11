package springpaket;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context  = 
											new ClassPathXmlApplicationContext("spring.xml"); 
		
		
		Profesor prof = context.getBean("profaLikovnogSlikanje",Profesor.class);
		
		System.out.println(prof.pozdrav());
		System.out.println(prof.dajMiPredmetKojiPredajem());

	}

}
