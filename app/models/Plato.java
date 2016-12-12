package models;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;

@Entity 
public class Plato extends com.avaje.ebean.Model {

    private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;
    
    
    public String origen;
    
    public String valor;
    
    public String demora;
    
    /**
     * Generic query helper for entity Company with id Long
     */
    public static Find<Long,Plato> find = new Find<Long,Plato>(){};
    
    public static List<Plato> listadoplatos(){
    	return
    			find.all();
    }

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Plato c: Plato.find.orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }

}