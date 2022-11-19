package mxj.wjk;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = annotationConfigApplicationContext.getBean(User.class);
		System.out.println(user);
	}
}
