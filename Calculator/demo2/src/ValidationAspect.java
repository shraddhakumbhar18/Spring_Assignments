package com.capgemini.spring.aspect;
import com.capgemini.spring.math.*;
import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;

@Component
@Aspect
public class ValidationAspect
{
	@Around("execution(* com.capgemini.spring.math.CalculatorImpl.add(..))")
	public void validateAdd(ProceedingJoinPoint pjp) throws Throwable
	{
		Object [] args = pjp.getArgs();
		int firstArg = Integer.parseInt(args[0].toString());
		int secondArg = Integer.parseInt(args[1].toString());
		if(firstArg > 0 && secondArg > 0)
		{
			System.out.println("Addition Validated Successfully");
		}
		else
		{
			System.out.println("Parameter cannot be zero or less");
		}
	}

	@Around("execution(* com.capgemini.spring.math.CalculatorImpl.divide(..))")
	public void validateDivide(ProceedingJoinPoint pjp) throws Throwable
	{
		Object [] args = pjp.getArgs();
		double secondArg = Double.parseDouble(args[1].toString());
		if(secondArg != 0)
		{
			pjp.proceed();
		}
		else
		{	
			System.out.println("Division Validated Successfully");
		}
			
	}
	
}
