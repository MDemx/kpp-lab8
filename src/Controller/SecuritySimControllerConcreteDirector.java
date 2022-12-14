/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

/**
 *
 * @author pz-34
 */
//concrete director
public class SecuritySimControllerConcreteDirector implements SecuritySimControllerDirector {
    private static SecuritySimControllerConcreteDirector instance = new SecuritySimControllerConcreteDirector();
    
    //return single instance
    public static SecuritySimControllerConcreteDirector getInstance() {
        return instance;
    }
    
    private SecuritySimControllerConcreteDirector() {}
    
    //build application controller
    public SecuritySimController build(SecuritySimControllerBuilder builder) {
        builder.buildSimView();
        builder.buildSimModel();
        builder.buildPanelsFromView();
        builder.buildPanelsInView();
        builder.buildControllerInViews();
        builder.buildPanelTables();
        builder.buildSimulator();
        return builder.getSecuritySimController();
    }
}
