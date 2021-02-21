package controllers;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.BeautifulThing;
import business.BusinessServiceInterface;


@ManagedBean
public class FormController {
	
	public FormController() {
		
	}
	
	@Inject
	BusinessServiceInterface bs;
	
	public String onSubmitCreate() throws SQLException {
		
		//when user creates new item
		
		//read the "get" values from the form
		FacesContext context = FacesContext.getCurrentInstance();
		
		//store the "get" values in an object
		BeautifulThing b = context.getApplication().evaluateExpressionGet(context, "#{beautifulThing}", BeautifulThing.class);
		
		System.out.println("The object you entered is " + b.getThingTitle() );
		
		
		//store object in the database
		
		bs.insertOne(b);
		
		//put the get values in a response page
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("beautifulThing", b);
		
		//show response page
		return "ResponsePage.xhtml";
		
	}
	
public String onSubmitEdit() throws SQLException {
		
		//when user creates new item
		
		//read the "get" values from the form
		FacesContext context = FacesContext.getCurrentInstance();
		
		//store the "get" values in an object
		BeautifulThing b = context.getApplication().evaluateExpressionGet(context, "#{beautifulThing}", BeautifulThing.class);
		
		System.out.println("The object you edited is " + b.getThingTitle() );
		
		
		//store object in the database
		
		bs.updateOne(b.getId(), b);
		
		//put the get values in a response page
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("beautifulThing", b);
		
		//show response page
		return "ResponsePage.xhtml";
		
	}
	
	public ArrayList<BeautifulThing> getAll() throws SQLException{

		
		
		
		return bs.readAll();
	
		
	}

	public String onDelete(BeautifulThing b) throws SQLException {
		
	//when user creates new item
		
		
		System.out.println("The object you plan to delete is " + b.getThingTitle() );
		
		
		//store object in the database
		
		bs.deleteOne(b.getId());
		
		//put the get values in a response page
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("beautifulThing", b);
		
		//show response page
		return "ResponsePage.xhtml";
		
	}
	
	public String onShowEdit(BeautifulThing b) throws SQLException {

		
		System.out.println("The object you plan to edit is " + b.getThingTitle() );
		
		//put the get values in a response page
				FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("beautifulThing", b);
				
		
		return "EditForm.xhtml";
		
	}
	
	public String showEntryForm() {
		
		return "EntryForm.xhtml";
	}
	
	public String showIndex() {
		
		return "index.xhtml";
		
	}
}
