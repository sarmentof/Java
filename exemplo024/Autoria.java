package exemplo024;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Retention define escopo de utilizacao
@Retention(value = RetentionPolicy.RUNTIME)

// @Target define o alvo (classes, metodos, atributos)
@Target(value = ElementType.TYPE)

// @interface define uma anotacao
public @interface Autoria {

  String autor();

  int ano();

  String empresa() default "UNESA";

}