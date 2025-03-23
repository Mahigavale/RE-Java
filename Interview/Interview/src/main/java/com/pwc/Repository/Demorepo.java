package com.pwc.Repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("arr")
public interface Demorepo {
	
	
	public void log();

}
