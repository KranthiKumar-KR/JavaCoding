package annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Schedule {
String name() default "kranthi";
int age() default 23;
int height() default 6;
int weight() default 80;
}
