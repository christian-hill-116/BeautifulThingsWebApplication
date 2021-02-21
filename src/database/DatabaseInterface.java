package database;

import java.util.ArrayList;

import javax.ejb.Local;

import beans.BeautifulThing;

@Local
public interface DatabaseInterface {

	public int deleteOne(int d);
	public int insertOne(BeautifulThing b);
	public ArrayList<BeautifulThing> readAll();
	public int updateOne(int d, BeautifulThing b);
}
