package controllers;

import java.util.List;

import models.Plato;
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        List<Plato> platos1= Plato.listadoplatos();
        return ok(index.render(Plato.listadoplatos()));
    }

}
