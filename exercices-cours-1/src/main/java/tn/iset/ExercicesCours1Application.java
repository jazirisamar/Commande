package tn.iset;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Date;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tn.iset.dao.ArticleRepository;
import tn.iset.dao.CommandLineRepository;
import tn.iset.dao.CommandRepository;
import tn.iset.dao.PaymentRepository;
import tn.iset.dao.RoleRepository;
import tn.iset.dao.UserInformationRepository;
import tn.iset.dao.UtilisateurRepository;
import tn.iset.entities.Utilisateur;
import tn.iset.entities.Article;
import tn.iset.entities.Command;
import tn.iset.entities.CommandLine;
import tn.iset.entities.CreditCardPayment;
import tn.iset.entities.Payment;
import tn.iset.entities.PaypalPayment;
import tn.iset.entities.Role;
import tn.iset.entities.UserInformations;


@SpringBootApplication
public class ExercicesCours1Application {

	/*public static void main(String[] args) {
		SpringApplication.run(ExercicesCours1Application.class, args);
	}*/
	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(ExercicesCours1Application.class, args);
	RoleRepository rolesRepository = ctx.getBean(RoleRepository.class);
	Role pa1 = new Role();
	Role pa2 = new Role();
	Role pa3 = new Role();
	pa1.setRoleName("R1");
	pa2.setRoleName("R2");
	pa3.setRoleName("R3");
	List<Role> Roles = Arrays.asList(pa1, pa2, pa3);
	UserInformationRepository InformationsRepository = ctx.getBean(UserInformationRepository.class);
	UserInformations ui1 = new UserInformations();
	UserInformations ui2 = new UserInformations();
	
	ui1.setAddress("djerba");ui1.setCity("elmay");ui1.setEmail("jazirisamar@gmail.com");ui1.setPhoneNumber("2222222");
	ui2.setAddress("djerba");ui2.setCity("midoun");ui2.setEmail("jazirisamar150@gmail.com");ui2.setPhoneNumber("2222222");
	
	CommandRepository CommandRepository = ctx.getBean(CommandRepository.class);
	
	Command c1= new Command();
	Command c2= new Command();
	Command c3= new Command();
	Calendar calendar = Calendar.getInstance();
	Date now = calendar.getTime();
    c1.setCommandDate(now);
    c2.setCommandDate(now);
    c3.setCommandDate(now);
	
    List<Command> command = Arrays.asList(c1, c2, c3);
    
    
    PaymentRepository paymentRepository = ctx.getBean(PaymentRepository.class);
    Payment p1=new PaypalPayment("12-23654789");
    Payment p2=new CreditCardPayment("123-1112586","12/03/2023");
    p1.setAmount(22);p1.setPaymentDate(now);
    p2.setAmount(20);p2.setPaymentDate(now);
    
    CommandLineRepository commandLineRepository = ctx.getBean(CommandLineRepository.class);
    CommandLine cl1=new CommandLine();
    CommandLine cl2=new CommandLine();
    cl1.setQuantity(2);cl1.setCommand(c1);
    cl2.setQuantity(3);cl2.setCommand(c2);
    
    List<CommandLine> commandLine = Arrays.asList(cl1, cl2);
    
    ArticleRepository  articleRepository = ctx.getBean(ArticleRepository .class);
    Article a1=new Article(null,"l'aticle 1","brand",2.3);
    Article a2=new Article(null,"l'aticle 2","brand",2.3);
    
    List<Article> article = Arrays.asList(a1, a2);
    articleRepository.saveAll(article);
    
    cl1.setArticle(a1);
    cl2.setArticle(a2);
    
    
	UtilisateurRepository usersRepository= ctx.getBean(UtilisateurRepository.class);
	Utilisateur co1=new Utilisateur(null,"m1@orsys.fr","mmm",123456,Roles,ui1,command);
	Utilisateur co2=new Utilisateur(null,"m2@orsys.fr","hhhhh",456789,Roles,ui2,command);
    List<Utilisateur> users = Arrays.asList(co1, co2);
    usersRepository.saveAll(users);
    pa1.setUtilisateur(users);
    pa2.setUtilisateur(users);
    pa3.setUtilisateur(users);
   
   InformationsRepository.save(ui1);
   InformationsRepository.save(ui2);
   
   CommandRepository.saveAll(command);
   commandLineRepository.saveAll(commandLine);
    
    ui1.setUtilisateur(co1);
    ui2.setUtilisateur(co2);
    
    
    paymentRepository.save(p1);
    paymentRepository.save(p2);
    
    c1.setUtilisateur(co1);
    c2.setUtilisateur(co2);
    
    c1.setPayment(p1);
    c2.setPayment(p2);
    
    c1.setCommandLine(commandLine);
    c2.setCommandLine(commandLine);
    
    p1.setCommand(c1);
    p2.setCommand(c2);
    
    
   
    rolesRepository.saveAll(Roles);
    
	
	}

}
