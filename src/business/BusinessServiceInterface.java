package business;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.BeautifulThing;

@Stateless
@Local
@Alternative
public interface BusinessServiceInterface {
	public int deleteOne(int d);
	public int insertOne(BeautifulThing b);
	public ArrayList<BeautifulThing> readAll();
	public int updateOne(int d, BeautifulThing b);
	
	
	

}
