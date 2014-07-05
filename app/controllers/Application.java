package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Hola a todos nuestra primera Aplicacion"));
    }
    
    
    public static Result decirHola() {
    return ok(hola.render("Hola de nuevo !!!"));
    }


}
