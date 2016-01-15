package mypack;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
public class LoginForm extends org.apache.struts.action.ActionForm {
    private String userName="Enter User";
    private String password="Enter Password";
    private static int count=0;
    public LoginForm() {
        super();
        count++;
        System.out.println(count+" LoginForm object is creted.");
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (userName == null || userName.length() < 1) 
        	errors.add("userName", new ActionMessage("error.userName.required"));
            
        if (password == null || password.length() < 1)
            errors.add("password", new ActionMessage("error.password.required"));
        return errors;
    }
    /*@Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
    	
    	userName="Imran Khan";
    	password="Imran Khan";
    }*/
    
    public String getUserName() {
        System.out.println("Inside getUserName "+this.userName);
        return this.userName;
    }
    public void setUserName(String userName) {
        System.out.println("Inside setUserName "+this.userName);
        this.userName = userName;
    }
    public String getPassword() {
    	System.out.println("Inside getPassword "+this.password);
        return this.password;
    }
    public void setPassword(String password) {
    	System.out.println("Inside setPassword "+this.password);
        this.password = password;
    }
}
