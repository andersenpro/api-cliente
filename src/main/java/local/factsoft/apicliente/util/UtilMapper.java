package local.factsoft.apicliente.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UtilMapper {

    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        return modelMapper;
    }

}
