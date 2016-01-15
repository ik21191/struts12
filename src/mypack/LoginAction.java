/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.actions.DispatchAction;
public class LoginAction extends DispatchAction {

    /* forward name="success" path="" */
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    private static int count=0;
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public LoginAction() {
    	count++;
		System.out.println(count+" LoginAction object is created.");
	}
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception 
        {
        LoginForm loginForm = (LoginForm) form;
        System.out.println(request.getServerName());
        if (loginForm.getUserName().equals(loginForm.getPassword())) 
        {
        	return mapping.findForward(SUCCESS);
        	//return new ActionForward("/hello?name=imran", true);
            
        	/*response.setContentType("text/html");
        	PrintWriter out=response.getWriter();
        	out.println("Response of Action.");
        	out.flush();
        	return null;*/
        } else 
            return mapping.findForward(FAILURE);
     }
}
