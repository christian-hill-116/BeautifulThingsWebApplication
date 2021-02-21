package business;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import beans.BeautifulThing;

@Stateless
@Local
@Alternative
public class BusinessService implements BusinessServiceInterface {
	
	@Inject
	BusinessServiceInterface db;

	@Override
	public int deleteOne(int d) {
		
		return db.deleteOne(d);
	}

	@Override
	public int insertOne(BeautifulThing b) {
		
		return db.insertOne(b);
	}

	@Override
	public ArrayList<BeautifulThing> readAll() {
		
		return db.readAll();
	}

	@Override
	public int updateOne(int d, BeautifulThing b) {
		
		return db.deleteOne(d);
	}

}
