package com.capgemini.spring.provider;
import org.springframework.stereotype.*;


@Component
public class GMMessageProvider implements MessageProvider
{
	@Override
	public String getMessage()
	{
		return "good Morning";

	}
}  