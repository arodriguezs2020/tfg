package org.jesuitasrioja.com.TFGUltimo.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfigurations {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
