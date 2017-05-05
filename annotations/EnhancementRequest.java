package annotations;
import java.lang.annotation.*;
//@Repeatable(EnhancementRequests.class)
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnhancementRequest {
	/**
	 * @deprecated
	 * id has to be kept secret
	 * 
	 */
	@Deprecated String id();
	String sysnopsis();
	String engineer() default "unknown";
	String date() default "unkown";

}
