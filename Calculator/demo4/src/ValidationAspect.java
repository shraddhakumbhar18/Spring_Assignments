package com.capgemini.spring.aspect;
import com.capgemini.spring.math.*;
import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.AfterReturning;

@Component
@Aspect
public class ValidationAspect
{
	@AfterReturning( pointcut = "execution(* com.capgemini.spring.math.CalculatorImpl.divide(..))", throwing="ex")
	public void afterResult(ArithmeticException ex) throws Throwable
 	{
	 	System.out.println( result );
	}
}
