package JavaKampiOdev3Hafta3.business;
import JavaKampiOdev3Hafta3.entities.Category;

import java.util.List;


import JavaKampiOdev3Hafta3.core.logging.ILogger;
import JavaKampiOdev3Hafta3.dataAcsses.EntitiesDao;
import JavaKampiOdev3Hafta3.entities.BaseEntities;
import JavaKampiOdev3Hafta3.entities.Course;

public class CategoryManager {
 private EntitiesDao entitesDao;
	private ILogger[] loggers;
	private List<Category> category;
 

	public CategoryManager(EntitiesDao entitesDao, ILogger[] loggers, List<Category> category) {
		super();
		this.entitesDao = entitesDao;
		this.loggers = loggers;
		this.category = category;
	}

	public void add(Category categori) throws Exception{
		int sayac=0;
		
        
		for (Category c : category) {
			if (c.getName() .equals(categori.getName()) ){
				sayac=sayac+1;
				if(sayac>1)
				{
				throw new Exception("Kategori isimleri aynı olamaz.");
				}
			}}
		
		
		
		for (ILogger logger : loggers) {
			logger.log();
		}
		entitesDao.add(categori);

	}



}