package cz.inventi.kpj.spring.springintroduction.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fileRepo")
public class GreetingFileRepositoryImpl implements GreetingRepository {
    @Autowired
    private GreetingFileData textFileData;
    public String getGreetingText(){
        return textFileData.getText();
    }
}
