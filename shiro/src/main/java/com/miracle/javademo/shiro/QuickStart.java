package com.miracle.javademo.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickStart {

    private static final Logger log = LoggerFactory.getLogger(QuickStart.class);
    public static void main(String[] args) {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        session.setAttribute("someKey","aValue");
        String value = (String)session.getAttribute("someKey");
        if(value.equals("aValue")){
            log("Retrieved the correct value! ["+value+"]");
        }


        if(!currentUser.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken("lonestarr","vespa");
            token.setRememberMe(true);
            currentUser.login(token);
        }

        log("User ["+currentUser.getPrincipal()+"]"+ " logged in successfully");

        if(currentUser.hasRole("schwartz")){
            log("May the Schwartz be with you");
        }else{
            log("Hello,more mortal");
        }

        if(currentUser.isPermitted("lightsaber:weild")){
            System.out.println("You may use a lightsaber ring. Use it wisely.");
        }else{
            log("Sorry,you aren't allowed to drive the 'eagle5' winnebago");
        }

        currentUser.logout();

        System.exit(0);
    }

    private static void log(String msg){
        log.info(msg);
//        System.out.println(msg);
    }
}
