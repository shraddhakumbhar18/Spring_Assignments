package com.capgemini.spring.aspect;
import com.capgemini.spring.math.*;
import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;

@Component
@Aspect
public class ValidationAspect
{
	@Before("execution(* com.capgemini.spring.math.CalculatorImpl.add(..))")
	public void validateAdd()
	{
		System.out.println("Addition Validated Successfully");
	}

	@Before("execution(* com.capgemini.spring.math.CalculatorImpl.divide(..))")
	public void validateDivide()
	{
		System.out.println("Division Validated Successfully");
	}
	
}
