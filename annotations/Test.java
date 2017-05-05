package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Test {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
Main main = new Main(5,2);
Class c = main.getClass();

Annotation ann = (Annotation) c.getAnnotation(Schedule.class);
Schedule sch = (Schedule) ann;
System.out.println(sch.name());
System.out.println(sch.age());
System.out.println(sch.height());
System.out.println(sch.weight());

Method m = c.getMethod("sum");
Annotation ann2 = m.getAnnotation(EnhancementRequest.class);
EnhancementRequest enh = (EnhancementRequest) ann2;
System.out.println(enh.date());
System.out.println(enh.engineer());
System.out.println(enh.id());
System.out.println(enh.sysnopsis());
	}

}
