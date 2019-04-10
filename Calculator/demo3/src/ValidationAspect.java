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
	@AfterReturning( pointcut = "execution(* com.capgemini.spring.math.CalculatorImpl.divide(..))", returning = "result")
	public void afterResult(double result) throws Throwable
 	{
	 	System.out.println( result );
	}
}
