package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_email
     
    /**
     * <p></p>
     */
    public static Object G_password
     
    /**
     * <p></p>
     */
    public static Object G_firstName
     
    /**
     * <p></p>
     */
    public static Object G_lastName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            G_email = selectedVariables['G_email']
            G_password = selectedVariables['G_password']
            G_firstName = selectedVariables['G_firstName']
            G_lastName = selectedVariables['G_lastName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
